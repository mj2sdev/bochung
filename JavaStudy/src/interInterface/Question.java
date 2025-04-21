package interInterface;

public interface Question {
	final int MAX = 100;
	
	// 1 ~ 100 범위 중에서 3의 배수 이면서 5의 배수를 출력
	public void cal35();
	
	// a ~ 100 까지 출력을 하는데 1줄에 10개씩 출력하고 홀수 합계를 출력하시오
	public int sum(int a);
	
	default void logo() {
		System.out.println("Interface");
	}
	
	// Question 인터페이스를 구현하는 Answer 클래스를 만들어서 프로그램을 완성하시오
}
