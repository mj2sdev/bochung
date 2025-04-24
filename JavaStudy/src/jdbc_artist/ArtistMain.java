package jdbc_artist;

import java.sql.Connection;

public class ArtistMain {
	public static void main(String[] args) {
		Connection connection = DatabaseManager.getInstance().getConnection();

		if (connection != null)
		System.out.println("테스트 완료");
		else
		System.out.println("오류 ㅋㅋ");
	}
}