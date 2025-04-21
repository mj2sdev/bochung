package inter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inter08_Map {
	public static void main(String[] args) {
		/*
		 * HashMap
		 * 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션
		 * 키는 해시맵에 삽입되는 위치를 결정할 때 사용한다.
		 * 값을 검색할 때는 반드시 키를 사용한다.
		 * [어레이리스트]는 인덱스를 이용해서 요소에 접근하지만 [맵]은 인덱스를 이용해서 접근할 수 없다.
		 * 삽입 : put(), 검색 : get()
		 * 
		 */
		Map<String, String> map = new HashMap<>();
		
		map.put("baby", "애기");
		map.put("love", "tkfkd");
		map.put("apple", "tkrhk");
		
		var scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색하고 싶은 단어 입력 : ");
			String tango = scanner.next();
			
			String result = map.get(tango);
			
			if (tango.equalsIgnoreCase("exit")) {
				System.out.println("ok");
				break;
			}
			
			if (result == null)
				System.out.println("no daner");
			else
				System.out.println(result);
		}
	}
}
