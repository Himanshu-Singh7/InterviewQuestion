package HashMapVsConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//It is a Fail fast iteration.
//Whereas Fail-fast iterators throw an exception(ConcurrentModificationException) .
//if the collection is modified while iterating over it.
public class Main1 {
   public static void main(String[] args) {
	Map<String,Long> phoneBook = new HashMap<String,Long>();
	phoneBook.put("Himanshu", 9310664280L);
	phoneBook.put("Rahul", 9310664280L);
	phoneBook.put("Aprajit", 9310664281L);
	phoneBook.put("Kusagra", 98178176167L);
	
	Iterator<String> keyiterator = phoneBook.keySet().iterator();
	
	while(keyiterator.hasNext()) {
		String key = keyiterator.next();
		if("Himanshu".equals(key)) {
		phoneBook.put("Vikaram",9220341211L);
		}
	}
	
  }
}
