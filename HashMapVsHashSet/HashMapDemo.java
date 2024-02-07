package HashMapVsHashSet;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
   public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("India", "Delhi");
	map.put("India", "Delhi");
	map.put("America", "Wasington");
	map.put("China", "shanghi");
	map.put("Pakistan", "Karachi");
	
	
	Iterator<String> iterator = map.keySet().iterator();
	while(iterator.hasNext()) {
		String key = iterator.next();
		System.out.println("Country - "+ key +" : "+ "Capital - "+ map.get(key));
	}
	
  }
}
