package basic;

public class Basic31 {
	public static void main(String[] args) {
		// 주민번호를 이용하여 성별을 출력하시오
		String number = "123456-1234567";
		int target = number.charAt(7) - 48;
		String gender = target % 2 == 0 ? "여자" : "남자";
		String since = target > 2 ? "이후" : "이전";
		
		System.out.printf("당신은 2000년 %s에 태어난 %s입니다.\n", since, gender);
	}
}
