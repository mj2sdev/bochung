package inter;

public class Inter06_variable {
	public static void main(String[] args) {
		// 변수의 범위 (Scope)
		// 변수의 선언 위치에 따라 변수의 종류(멤버변수, 지역변수)의 범위가 결정된다.
		
	}
}

class Scope {
	// 멤버변수의 종류
	
	// 인스턴스 변수(필드) : 반드시 객체를 생성해야 사용할 수 있는 변수
	String name;
	int scope;
	
	// 정적(static) 멤버변수 : 객체 생성없이 사용할 수 있다.
	static int count;
	
	// 상수 : 변하지 않는 값
	final double pi = 3.141592;
	
	public Scope() {}
	
	public void method(int number) { // 인스턴스 메서드
		int temp = number;
		System.out.println(temp);
		name = "honngildong";
		scope = 100;
	}
}
