package HashMapVsConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Main2 {
   public static void main(String[] args) {
	   Map<String,Long> phoneBook = new ConcurrentHashMap<String, Long>();
		phoneBook.put("Himanshu", 9310664280L);
		phoneBook.put("Rahul", 9310664280L);
		phoneBook.put("Aprajit", 9310664281L);
		phoneBook.put("Kusagra", 98178176167L);
		
		Iterator<String> keyiterator = phoneBook.keySet().iterator();
		System.out.println("Map Content before modification : " + phoneBook);
		while(keyiterator.hasNext()) {
			String key = keyiterator.next();
			if("Himanshu".equals(key)) {
			phoneBook.put("Vikaram",9220341211L);
			}
			
			
		}
		System.out.println("Map Content after modification : " + phoneBook);
}
}
