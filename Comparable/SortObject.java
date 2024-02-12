package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortObject {
  public static void main(String[] args) {
	ArrayList<Student> list = new ArrayList<>();
	list.add(new Student(18,"Himanshu","9310664280"));
	list.add(new Student(20,"Rahul","9310664281"));
	list.add(new Student(51,"Ankit","9310664280"));
	System.out.println("Unsorted List : "+list);
	Collections.sort(list);
	System.out.println("Sorted List by Id  : " + list);
  }
}
