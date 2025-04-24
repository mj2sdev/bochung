package jdbc_student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.Utils;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();
	
	private Connection connection = null;
	
	private PreparedStatement preparedStatement = null;
	
	private ResultSet resultSet = null;
	
	private StudentDAO() {}
	
	private PreparedStatement setPreparedStatement(String sql) {
		try {
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.preparedStatement;
	}
	
	private int execute() {
		int count = 0;
		try {
			count = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	private ResultSet execute(ResultSet resultSet) {
		try {
			this.resultSet = preparedStatement.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static StudentDAO getInstance() { return instance; }
	
	public int insert(StudentVO vo) {
		String sql = "INSERT INTO tbl_student_201905 VALUES (?,?,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			setPreparedStatement(sql);
			preparedStatement.setString(1, vo.getSyear());
			preparedStatement.setString(2, vo.getSclass());
			preparedStatement.setString(3, vo.getSno());
			preparedStatement.setString(4, vo.getSname());
			preparedStatement.setString(5, vo.getBirth());
			preparedStatement.setString(6, vo.getGender());
			preparedStatement.setString(7, vo.getTel1());
			preparedStatement.setString(8, vo.getTel2());
			preparedStatement.setString(9, vo.getTel3());
			
			result = execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utils.close(connection, preparedStatement, resultSet);
		
		return result;
	}
	
	public int insertScore(StudentVO vo) {
		String sql = "INSERT INTO tbl_score_201905 VALUES (?,?,?,?,?,?)";
		int result = 0;
		try {
			setPreparedStatement(sql);
			preparedStatement.setString(1, vo.getSyear());
			preparedStatement.setString(2, vo.getSclass());
			preparedStatement.setString(3, vo.getSno());
			preparedStatement.setInt(4, vo.getKor());
			preparedStatement.setInt(5, vo.getEng());
			preparedStatement.setInt(6, vo.getMat());
			
			result = execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utils.close(connection, preparedStatement, resultSet);
		return result;
	}
	
	public List<StudentVO> selectScore() {
		var list = new ArrayList<StudentVO>();
		try {
			StringBuilder sb = new StringBuilder();
			sb
				.append("SELECT st.syear, st.sclass, st.sno, st.sname, st.gender, sc.kor, sc.eng, sc.mat, ")
				.append("(sc.kor + sc.eng + sc.mat) as total, ")
				.append("(sc.kor + sc.eng + sc.mat) / 3 as average ")
				.append("FROM tbl_student_201905 st ")
				.append("JOIN tbl_score_201905 sc ")
				.append("ON st.syear = sc.syear ")
				.append("AND st.sclass = sc.sclass ")
				.append("AND st.sno = sc.sno ")
				.append("ORDER BY st.syear, st.sclass, st.sno");
			
			setPreparedStatement(sb.toString());
			execute(resultSet);
			
			while (resultSet.next()) {
				StudentVO vo = new StudentVO();
				vo.setSyear(resultSet.getString("syear"));
				vo.setSclass(resultSet.getString("sclass"));
				vo.setSno(resultSet.getString("sno"));
				vo.setSname(resultSet.getString("sname"));
				vo.setGender(resultSet.getString("gender"));
				vo.setKor(resultSet.getInt("kor"));
				vo.setEng(resultSet.getInt("eng"));
				vo.setMat(resultSet.getInt("mat"));
				vo.setTotal(resultSet.getInt("total"));
				vo.setAverage(resultSet.getDouble("average"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utils.close(connection, preparedStatement, resultSet);
		return list;
	}
	
	public List<StudentVO> selectAverageOfDepartment() {
		var list = new ArrayList<StudentVO>();
		try {
			StringBuilder sb = new StringBuilder();
			sb
				.append("SELECT dp.syear, dp.sclass, dp.tname, ")
				.append("SUM(sc.kor) korTotal, ")
				.append("SUM(sc.eng) engTotal, ")
				.append("SUM(sc.mat) matTotal, ")
				.append("AVG(sc.kor) korAverage, ")
				.append("AVG(sc.eng) engAverage, ")
				.append("AVG(sc.mat) matAverage ")
				.append("FROM tbl_dept_201905 dp ")
				.append("JOIN tbl_score_201905 sc ")
				.append("ON sc.syear = dp.syear ")
				.append("AND sc.sclass = dp.sclass ")
				.append("GROUP BY dp.syear, dp.sclass, dp.tname ")
				.append("ORDER BY dp.sclass ");
			
			setPreparedStatement(sb.toString());
			execute(resultSet);
			
			while (resultSet.next()) {
				StudentVO vo = new StudentVO();
				vo.setSyear(resultSet.getString("syear"));
				vo.setSclass(resultSet.getString("sclass"));
				vo.setTname(resultSet.getString("tname"));
				vo.setKorTotal(resultSet.getInt("korTotal"));
				vo.setEngTotal(resultSet.getInt("engTotal"));
				vo.setMatTotal(resultSet.getInt("matTotal"));
				vo.setKorAverage(resultSet.getDouble("korAverage"));
				vo.setEngAverage(resultSet.getDouble("engAverage"));
				vo.setMatAverage(resultSet.getDouble("matAverage"));
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utils.close(connection, preparedStatement, resultSet);
		return list;
	}
}
