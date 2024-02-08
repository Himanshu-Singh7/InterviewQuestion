package RepatedNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	    int arr [] = {2,3,6,3,8,3,11,2};
	     
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int num : arr) {
	    	map.put(num, map.getOrDefault(num,0) + 1);
	    }
	    
	    for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
	    	if(entry.getValue() > 1) {
	    		System.out.println(entry.getKey());
	    	}
	    }
	   }
}
