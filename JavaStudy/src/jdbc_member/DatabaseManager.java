package jdbc_member;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {
	
	//싱글톤 패턴 (면접 ppt 제작하세요)
	// 인스턴스(객체)가 에플리케이션에서 딱 1개만 존재하도록 보장하는 디자인 패턴이다
	
	private static final DatabaseManager instance = new DatabaseManager();
	private DatabaseManager() {}
	
	public static DatabaseManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		
		Connection connection = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.30.28:1521:xe";
		String id = "sinobi22";
		String pw = "1234";
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
