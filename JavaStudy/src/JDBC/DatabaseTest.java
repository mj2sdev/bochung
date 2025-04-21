package JDBC;

public class DatabaseTest {
	public static void main(String[] args) {
		
		var manager = DatabaseManager.getInstance();
		
		var connection = manager.getConnection();
		
		if (connection == null) System.out.println("접속 실패");
		else System.out.println("접속 완료");
	}
}
