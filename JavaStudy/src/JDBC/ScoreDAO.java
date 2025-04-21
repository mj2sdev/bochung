package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAO {
	// 입력처리 메서드
	public void insert(ScoreVO vo) {
		// 데이터베이스 접속 정
		Connection connection = null;
		// SQL(insert, update, delete) 실행을 위한 준비 객체 이렇게 걍 외워
		PreparedStatement preparedStatement = null;
		
		String sql = "INSERT INTO SCORE (bno, name, kor, eng, mat) VALUES (score_seq.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			// insert 하기 위해서 DB 접속 한다
			connection = DatabaseManager.getInstance().getConnection();
			
			// insert 하기 위해서 물음표에 값을 대입 한다
			preparedStatement = connection.prepareStatement(sql);
			
			// preparedStatement.setInt(1, vo.getBno());
			preparedStatement.setString(1, vo.getName());
			preparedStatement.setInt(2, vo.getKor());
			preparedStatement.setInt(3, vo.getEng());
			preparedStatement.setInt(4, vo.getMat());
			
			// insert 문을 실행한다
			preparedStatement.executeUpdate();
			
			// insert, delete, update SQL문은 executeUpdate() 함수로 실행
			// select SQL 문은 executeQuery() 함수로 실행
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// 검색처리 메서드
	public List<ScoreVO> getSelect() throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String sql = "SELECT * FROM SCORE";
		
		List<ScoreVO> list = new ArrayList<>();
		
		try {
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setBno(resultSet.getInt("bno"));
				vo.setName(resultSet.getString("name"));
				vo.setKor(resultSet.getInt("kor"));
				vo.setEng(resultSet.getInt("eng"));
				vo.setMat(resultSet.getInt("mat"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closing(resultSet, preparedStatement, connection);
		}
		
		return list;
	}
	
	// 삭제처리 메서드
	public int deleteByBno(int bno) {
		int result = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		String sql = "DELETE score WHERE bno = ?";
		
		try {
			connection = DatabaseManager.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bno);
			result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closing(preparedStatement, connection);
		}
		
		return result;
	}
	
	// 수정처리 메서드
	public void updateByBno(int bno) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
	}
	
	private void closing(AutoCloseable... closable) {
		try {
			for (AutoCloseable autoCloseable : closable) {
				if (autoCloseable != null)
					autoCloseable.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
