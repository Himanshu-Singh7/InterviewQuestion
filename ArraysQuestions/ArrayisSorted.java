package ArraysQuestions;
import java.util.*;
public class ArrayisSorted {
	public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     int [] arr = new int[n];
     for(int i = 0 ; i < arr.length ; i++) {
    	 arr[i] =scn.nextInt();
     }
     boolean flag = false;
     for(int i = 1 ; i < arr.length ; i++ ) {
    	 if(arr[i] < arr[i -1]) {
    		 flag  = false;
    	 }else {
    		  flag  = true; 
    	 }
    	 	 
     }
     System.out.println(flag);
     
	}
}
