package HashMapVsHashSet;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kutta");
		hashset.add("Billi");
		hashset.add("Bandar");
		hashset.add("Kutta");
		hashset.add("Sher");
		hashset.add("Chita");
		
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
