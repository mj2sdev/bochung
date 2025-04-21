package inter;

class Score3 extends Object {
	// すべてのクレスーはオブゼクトと言うクラスを相続する。
	private int bno;
	private String name;
	private int score;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

public class Inter07＿ {
	public static void main(String[] args) {
		// 접근 제한자
		// 자바언어는 클래스, 멤버변수, 메서드 접근에 제한을 두고 있다
		// 이렇게 제한을 부여하여 멤버변수에 저장된 값을 보호할 수 있다 == 정보 은닉 캡슐화
		// 접근이 제한된 멤버변수는 특정 메서드에 의해서만 변경이 가능하게 할 수 있다(게터, 세터)
		// 종류
		// private : 같은 클래스 에서만 접근이 가능하다
		// default : 같은 패키지 에서만 접근이 가능하다
		// protected : 같은 패키지 또는 다른 패키지의 자손 클래스에서 접근이 가능하다
		// public : 접근 제한이 없다
		// 宿題　：접근제한자 일본어로 해석해서 말해보
		
		Score3 s3 = new Score3();		
		
//		s3.bno = 1111;
//		s3.name = "aaa";
//		s3.score = 100;
		
		s3.setBno(111);
		s3.setName("aaa");
		s3.setScore(120);
		
		int bno = s3.getBno();
		System.out.println("번호 : " + bno);
		
		
	}
}
