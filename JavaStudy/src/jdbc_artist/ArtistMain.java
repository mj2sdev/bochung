package jdbc_artist;

import java.util.List;
import java.util.Scanner;

public class ArtistMain {

	private static ArtistDAO dao = ArtistDAO.getInstance();
	public static void main(String[] args) throws Exception {

		var scanner = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.print("[1]아티스트목록 [2]채점목록 [3]랭킹구 [0]나가기 : ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1 -> selectArtist();
				case 2 -> selectPoints();
				case 3 -> selectRanking();
				case 0 -> loop = false;
			}
		}
		scanner.close();
	}

	private static void selectArtist() throws Exception {
		List<ArtistVO> list = dao.selectArtists();

		System.out.println("참가자명\t참가번호\t생년월일\t성별\t특기\t소속사");
		for (ArtistVO vo : list) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
				vo.getArtist_name(),
				vo.getArtist_id(),
				vo.getArtist_birth(),
				vo.getArtist_gender().equalsIgnoreCase("M") ? "남자" : "여자",
				vo.getTalent(),
				vo.getAgency()
			);
		}
	}

	private static void selectPoints() throws Exception {
		List<ArtistVO> list = dao.selectPoints();

		System.out.println("채점번호\t참가번호\t참가자명\t생년월일\t점수\t멘토");
		for (ArtistVO vo : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n",
				vo.getSerial_no(),
				vo.getArtist_id(),
				vo.getArtist_name(),
				vo.getArtist_birth(),
				vo.getPoint(),
				vo.getMento_name()
			);
		}
	}

	private static void selectRanking() throws Exception {
		List<ArtistVO> list = dao.selectRanking();

		System.out.println("참가번호\t참가자명\t성별\t총점\t평균");
		for (ArtistVO vo : list) {
			System.out.printf("%s\t%s\t%s\t%d\t%.1f\n",
				vo.getArtist_id(),
				vo.getArtist_name(),
				vo.getArtist_gender().equalsIgnoreCase("M") ? "남자" : "여자",
				vo.getArtist_total(),
				vo.getArtist_average()
			);
		}
	}
}