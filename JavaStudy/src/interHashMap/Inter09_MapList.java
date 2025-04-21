package interHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inter09_MapList {
	public static void main(String[] args) {
		var map = new HashMap<>();
		
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setSyainnumber(111);
		e1.setName("aaa");
		e1.setOkane(10);
		
		Employee e2 = new Employee();
		e2.setSyainnumber(222);
		e2.setName("bbb");
		e2.setOkane(20);
		
		Employee e3 = new Employee();
		e3.setSyainnumber(333);
		e3.setName("ccc");
		e3.setOkane(30);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
	}
}
