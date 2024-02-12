package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
	
	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<>();
		emp.add(new Emp(23, "Himanshu","(9310664280"));
		emp.add(new Emp(54, "Rahul","(9310664281"));
    	emp.add(new Emp(61, "Ankit","(9310664282"));
    	emp.add(new Emp(72, "Beni","(9310664283"));
    	System.out.println("Unsorted emp : "+emp);
    	Collections.sort(emp , new ComparatorById());
    	System.out.println("Soreted emp using Comparator : " + emp);
    	
    	ArrayList<Emp> list = new ArrayList<>(emp);
    	Collections.sort(list,new ComparatorByName());
    	System.out.println("Sort by name : "+list);
    	
	}

}
