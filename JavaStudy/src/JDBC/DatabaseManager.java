package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

// 오라클 db와 접속하는 설계도임 ㅋ
public class DatabaseManager {
	
	private static final DatabaseManager instance = new DatabaseManager();
	
	private DatabaseManager() {}
	
	public static DatabaseManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		
		// db 접속 정보를 가지고 있다
		Connection connection = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.30.28:1521:xe";
		String id = "sinobi22";
		String password = "1234";
		
		try {
			// 드라이버 로딩
			Class.forName(driver);
			// 지정된 url, id, pw를 이용해 DB에 접속한다. 성공하면 DB접속 정보를 객체에 저장
			connection = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
