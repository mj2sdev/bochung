package JDBC;

import java.util.List;
import java.util.Scanner;

import interListMap.StudentMain;

public class ScoreMain {
	
	private Scanner scanner = new Scanner(System.in);
	
	private ScoreDAO dao = new ScoreDAO();
	
	public static void main(String[] args) {
		ScoreMain main = new ScoreMain();
		String menu = "[1]입력 [2]검색 [3]삭제 [4]수정 [0]종료 : ";
		StudentMain.menu(menu,
				main::insert,
				main::search,
				main::delete,
				main::update);
	}
	
	public void insert() {
		System.out.println("번호 이름 국어 영어 수학 : ");
		// int bno = scanner.nextInt();
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int mat = scanner.nextInt();
		
		ScoreVO vo = new ScoreVO();
		
		// vo.setBno(bno);
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
		vo.setMat(mat);
		
		dao.insert(vo);
	}
	
	public void search() {
		try {
			List<ScoreVO> list = dao.getSelect();
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "순번", "이름", "국어", "영어", "수학", "총점", "평균");
			for (ScoreVO scoreVO : list) {
				scoreVO.print();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		System.out.print("삭제할 번호 입력 : ");
		int bno = scanner.nextInt();
		boolean result = dao.deleteByBno(bno) > 0;
		if (result) System.out.println("삭제가 완료되었습니다.");
		else System.out.println("삭제할 항목이 없습니다.");
	}
	
	public void update() {
		
	}
}
