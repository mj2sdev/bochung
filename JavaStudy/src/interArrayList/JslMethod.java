package interArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class JslMethod {
	
	/*
	 * 2번
	 * JslVO 객체를 저장하기 위한 가변 배열(컬렉션)을 생성한다
	 */
	ArrayList<JslVO> list = new ArrayList<JslVO>();
	
	Scanner scanner = new Scanner(System.in);
	
	private static int count = 1;
	
	// 3번 입력기능 만들기
	public void jslInsertIterator() {
		int count = 1;
		while (count-- > 0)
			this.jslInsert();
		this.calculator();
	}
	
	public void jslInsert() {
		System.out.print("데이터 입력 [이름, java, jsp, spring] : ");
		String name = scanner.next();
		int java = scanner.nextInt();
		int jsp = scanner.nextInt();
		int spring = scanner.nextInt();
		
		JslVO vo = new JslVO();
		
		vo.setBno(JslMethod.count++);
		vo.setName(name);
		vo.setJava(java);
		vo.setJsp(jsp);
		vo.setSpring(spring);
		
		list.add(vo);
	}
	
	// 출력기능
	public void getListInterator() {
		System.out.println("22기 성적표");
		
		// 향상된 for문
		if (true)
			for (JslVO vo : list)
				this.getList(vo);
		
		// 일반 for문
		if (false)
			for (int index = 0; index < list.size(); index++)
				this.getList(list.get(index));
	}
	public void getList(JslVO vo) {
		System.out.print(vo.getBno() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getJava() + "\t");
		System.out.print(vo.getJsp() + "\t");
		System.out.print(vo.getSpring() + "\t");
		System.out.print(vo.getAverage() + "\t");
		System.out.print(vo.getRank() + "\t\n");
	}
	
	public ArrayList<JslVO> getListAll() {
		return this.list;
	}
	// 검색기능
	public JslVO getSelectByBno(int bno) {
		for (JslVO vo : list) {
			if (vo.getBno() == bno)
				return vo;
		}
		return null;
	}
	
	// 삭제기능
	public int deleteByBno(int bno) {
		int index = 0;
		for (; index < list.size(); index++)
			if (list.get(index).getBno() == bno) break;
		
		if (list.size() <= index) {
			return 0;
		} else {
			list.remove(index);
			return 1;
		}
		// 삭제 완료가 되면 1을 리턴
		// 삭제 번호가 없으면 0을 리턴하는 걸로 우리 합시다 ㅋㅋ
	}
	
	private int findIndex(int bno) {
		int index = 0;
		for (; index < list.size(); index++)
			if (list.get(index).getBno() == bno) break;
		return index;
	}
	
	public void calculator() {
		for (JslVO vo : list) {
			int total = vo.getJava() + vo.getJsp() + vo.getSpring();
			vo.setTotal(total);
			vo.setAverage((double) total / 3);
			vo.setRank(1);
		}
		
		// 순위 계산
		
		for (int outer = 0; outer < list.size(); outer++) {
			for (int inner = 0; inner < list.size(); inner++) {
				if (list.get(outer).getTotal() < list.get(inner).getTotal()) {
					int rank = list.get(outer).getRank();
					list.get(outer).setRank(++rank);
				}
			}
		}
	}
	
	// 수정기능
	// 수정하고픈 번호를 메인 메서드에서키보드로 입력 받는다
	// public boolean editorByBno(int bno){} 메서드를 만들어 처리하시오
	// 수정하고픈 객체가 있으면 출력하고 수정 할래요[y/n]? 라고 물어본다
	// y이면
	// java, jsp, spring 점수 입력 : 10 10 10 화면이 나오고
	// 수정이 완료 된다
	// n이거나 수정하고픈 객체 중 번호가 존재하지 않으면 메뉴로 되돌아 간다
	// 메인 메서드에서 리턴값이 참이면 수정 완료를 출력하고 그렇지 않으면 해당 번호 없음 출력
	public boolean editByBno(int bno) {
		int findedIndex = findIndex(bno);
		if (list.size() <= findedIndex) return false;
		
		JslVO vo = list.get(findedIndex);
		this.getList(vo);
		
		System.out.println("수정 할래요[y/n]?");
		String henji = scanner.next();
		
		if (henji.equalsIgnoreCase("y")) {
			int java, jsp, spring;
			System.out.print("java, jsp, spring 점수 입력 : ");
			java = scanner.nextInt();
			jsp = scanner.nextInt();
			spring = scanner.nextInt();
			
			vo.setJava(java);
			vo.setJsp(jsp);
			vo.setSpring(spring);
			
			this.calculator();
		}
			
		return true;
		
	}
}
