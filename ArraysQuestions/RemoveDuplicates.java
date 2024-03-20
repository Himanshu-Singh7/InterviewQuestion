package ArraysQuestions;

import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int[] arr = new int [n];
     
     for(int i = 0 ; i < arr.length ; i++) {
    	 arr[i] = scn.nextInt();
     }
     
     int i =  0 ;
     for(int j  =  1 ; j < arr.length ; j++) {
    	 if(arr[i] != arr[j]) {
    		 i++;
    		 arr[i] = arr[j];
    	 }
     }
     
     System.out.println(i);
	}
}
