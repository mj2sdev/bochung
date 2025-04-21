package interListMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDAO {
	
	List<Map<String, ?>> list = new ArrayList<Map<String,?>>();
	
	public void mapPrint() {
		
		
		
		for (Map<String, ?> map : list) {
			
			for (String key : map.keySet()) {
				Object value = map.get(key);
				System.out.println(value);
			}
		}
	}
}
