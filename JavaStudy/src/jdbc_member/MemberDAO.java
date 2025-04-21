package jdbc_member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	public void insert(MemberVO vo) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		String sql = "INSERT INTO member_tbl_02 (custno, custname, phone, address, joindate, grade, city) VALUES (?,?,?,?,?,?,?)";
		
		try {
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, vo.getCustno());
			preparedStatement.setString(2, vo.getCustname());
			preparedStatement.setString(3, vo.getPhone());
			preparedStatement.setString(4, vo.getAddress());
			preparedStatement.setString(5, vo.getJoindate());
			preparedStatement.setString(6, vo.getGrade());
			preparedStatement.setString(7, vo.getCity());
			
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(preparedStatement, connection);
		}
	}
	
	public int custnoMax() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int maxcustno = 0;
		
		String sql = "SELECT MAX(custno) + 1 as maxcustno FROM member_tbl_02";
		
		try {
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				maxcustno = resultSet.getInt("maxcustno");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(resultSet, preparedStatement, connection);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return maxcustno;
	}
	
	public List<MemberVO> select() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<MemberVO> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM member_tbl_02";
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				MemberVO vo = new MemberVO();
				vo.setCustno(resultSet.getInt("custno"));
				vo.setCustname(resultSet.getString("custname"));
				vo.setAddress(resultSet.getString("address"));
				vo.setJoindate(resultSet.getString("joindate"));
				vo.setPhone(resultSet.getString("phone"));
				vo.setGrade(resultSet.getString("grade"));
				vo.setCity(resultSet.getString("city"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(resultSet, preparedStatement, connection);
		}
		
		return list;
	}
	
	public int deleteByCustno(int custno) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;
		
		String sql = "DELETE member_tbl_02 WHERE custno = ?";
		
		try {
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, custno);
			result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(preparedStatement, connection);
		}
		return result;
	}
	
	private void close(AutoCloseable... closeables) {
		try {
			for (AutoCloseable autoCloseable : closeables) {
				if (autoCloseable != null)
					autoCloseable.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
