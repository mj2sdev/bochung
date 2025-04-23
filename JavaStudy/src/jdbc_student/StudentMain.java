package jdbc_student;

import java.util.Scanner;

public class StudentMain {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static StudentDAO dao = StudentDAO.getInstance();
	
	public static void main(String[] args) throws Exception {
		/*
		 * [1]학생등록 [2]성적입력 [3]학생성적조회 [4]반별통계 [0]종료
		 * 학생등록
		 * 학년 :
		 * 반 :
		 * 번호 :
		 * 생년월일 :
		 * 성별[m:남자, f:여자] :
		 * 전화번호 :
		 * 
		 * 성적입력
		 * 학년 : 
		 * 반 : 
		 * 번호 : 
		 * 국어 : 
		 * 영어 :
		 * 수학 : 
		 * 
		 * 학생성적조회
		 * 학년-반-번호 이름 성별 국어 영어 수학 총점 평균
		 * 1-1-01     김학생 여 50  50  50  150  50.0
		 * ...
		 * 
		 * 반별통계
		 * 학년 반 교사명 국어총점 영어총점 수학총점 국어평균 영어평균 수학평균
		 * 1   0  김교사 180    160    220     80.0   50.0   60.0 
		 */
		String title = "[1]학생등록 [2]성적입력 [3]학생성적조회 [4]반별통계 [0]종료 : ";
		
		Menu.menu(title,
			StudentMain::insertStudent,
			StudentMain::insertScore,
			StudentMain::selectScore,
			StudentMain::selectAverage
		);
	}
	
	public static void insertStudent() {
		System.out.println("학생 등록");
		System.out.print("학년 : ");
		String syear = scanner.next();
		System.out.print("반 : ");
		String sclass = scanner.next();
		System.out.print("번호 : ");
		String sno = scanner.next();
		System.out.print("생년월일 : ");
		String birth = scanner.next();
		System.out.print("성별[m:남자, f여자] : ");
		String gender = scanner.next();
		System.out.print("전화번호[띄어쓰기로 구분] : ");
		String tel1 = scanner.next();
		String tel2 = scanner.next();
		String tel3 = scanner.next();
		
		StudentVO vo = new StudentVO();
		vo.setSname("폭풍의전학생");
		vo.setSyear(syear);
		vo.setSclass(sclass);
		vo.setSno(sno);
		vo.setBirth(birth);
		vo.setGender(gender);
		vo.setTel1(tel1);
		vo.setTel2(tel2);
		vo.setTel3(tel3);
		
		boolean result = dao.insert(vo) > 0;
		if (result) System.out.println("등록되었습니다.");
		else System.out.println("등록안되었습니다.");
	}
	
	public static void insertScore() {
//		 * 성적입력
//		 * 학년 : 
//		 * 반 : 
//		 * 번호 : 
//		 * 국어 : 
//		 * 영어 :
//		 * 수학 : 
		System.out.println("성적입력");
		System.out.print("학년 : ");
		String syear = scanner.next();
		System.out.print("반 : ");
		String sclass = scanner.next();
		System.out.print("번호 : ");
		String sno = scanner.next();
		System.out.print("국어 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 : ");
		int mat = scanner.nextInt();
		
		StudentVO vo = new StudentVO();
		vo.setSyear(syear);
		vo.setSclass(sclass);
		vo.setSno(sno);
		vo.setKor(kor);
		vo.setEng(eng);
		vo.setMat(mat);
		
		boolean result = dao.insertScore(vo) > 0;
		if (result) System.out.println("등록되었습니다.");
		else System.out.println("등록안되었습니다.");
	}
	
	public static void selectScore() {
		System.out.println("학년-반-번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		var list = dao.selectScore();
		
		for (StudentVO studentVO : list) {
			String gender = studentVO.getGender().equalsIgnoreCase("f") ? "여자" : "남자";
			System.out.printf("%s-%s-%s\t\t", studentVO.getSyear(), studentVO.getSclass(), studentVO.getSno());
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\n", studentVO.getSname(),
					gender,
					studentVO.getKor(),
					studentVO.getEng(),
					studentVO.getMat(),
					studentVO.getTotal(),
					studentVO.getAverage());
		}
	}
	
	public static void selectAverage() {
		System.out.println("학년\t반\t교사명\t국어총점\t영어총점\t수학총점\t국어평균\t영어평균\t수학평균");
		var list = dao.selectAverageOfDepartment();
		
		for (StudentVO studentVO : list) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%.1f\t%.1f\t%.1f\n",
					studentVO.getSyear(),
					studentVO.getSclass(),
					studentVO.getTname(),
					studentVO.getKorTotal(),
					studentVO.getEngTotal(),
					studentVO.getMatTotal(),
					studentVO.getKorAverage(),
					studentVO.getEngAverage(),
					studentVO.getMatAverage()
					);
		}
	}
}
