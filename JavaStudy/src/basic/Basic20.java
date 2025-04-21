package basic;

public class Basic20 {
	public static void main(String[] args) {
		// 문자열 비교하는 방법
		// 문자열이 같은지 비교할 때는 == 대신에 equals() 메서드를 사용한다
		
		int a = 10;
		int b = 20;
		boolean result = (a == b) ? true : false;
		System.out.println(result);
		
		String c = "abc";
		String d = "abc";
		boolean result1 = (c == d) ? true : false;
		System.out.println(result1);
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		// false. 주소가 같은지를 물어보는 거야 103 = 105
		System.out.println(str1.equals(str2));
	}
}
