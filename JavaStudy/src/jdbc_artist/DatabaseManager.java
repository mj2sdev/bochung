package jdbc_artist;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {
	private static DatabaseManager instance = new DatabaseManager();

	private DatabaseManager() {}

	public static DatabaseManager getInstance(){
		return instance;
	}

	public Connection getConnection(){
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
