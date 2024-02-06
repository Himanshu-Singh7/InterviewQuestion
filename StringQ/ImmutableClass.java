package StringQ;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClass {
  public static void main(String[] args) {
	
	  System.out.println("Immutable class trigered");
	  
	  List<String> list = new ArrayList<>();
	  list.add("Kusagra");
	  Student student = new Student("Himanshu", 23, 98L,list);
	 
	  student.display();
	  System.out.println(student);
	  
	  
	  student.display();
	  System.out.println(student);
 }
}
