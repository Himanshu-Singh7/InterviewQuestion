package InternalworkingofHashSet;

import java.util.HashSet;

/*How To Hashset avoid dublicate value in collection ???*/
/*HashSet is Internally use HashMap.
 * So whatever the value we are passing to add into the HashSet is eventually being added into a HashMap as a key,
 * now the important point here is, we know that HashMap will not allow the duplicate keys to be added into it, implementation of HashSet */
public class Main {
  public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	boolean add1 = set.add("Himanshu");
	boolean add2 = set.add("Rahul");
	boolean add3 = set.add("Himanshu");
	
	System.out.println(add1);
	System.out.println(add2);
	System.out.println(add3);
	
}
}
