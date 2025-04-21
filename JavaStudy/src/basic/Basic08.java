package basic;

public class Basic08 {
	public static void 장수(String... args) {
		String train = String.join(",", args);
		if (train.contains("클래스")) {
			System.out.println("새로운 꾸뤠수~");
		} else if (train.contains("거만")){
			
		} else if(train.contains("핑계")) {
			System.out.println("개가 안팔려도 핑계대지 말것!");
		} else if (train.contains("틀렸")) {
			System.out.println("암쑈리");
		} else {
			System.out.println("집중!");
			System.out.println("생각!");
			System.out.println("코딩!");
		}
	}
}
