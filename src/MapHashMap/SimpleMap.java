package MapHashMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {

	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<>();
		map.put("Moon", 200);
		map.put("Earth", 100);
		map.put("Saturn", 150);
		map.put("Jupiter", 300);
		System.out.println(map.size());
		
		for (Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey() + " " + tmp.getValue());
		}
	}

}
 