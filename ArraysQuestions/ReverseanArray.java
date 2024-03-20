package ArraysQuestions;

import java.util.*;

public class ReverseanArray {
	public static void dispaly(int [] arr) {
		StringBuilder sb = new StringBuilder();
		
		for(int val : arr) {
			sb.append(val + " ");
			
		}
		System.out.println(sb);
		
	}
	public static void revrse(int[] arr) {
		int i = 0;
		int j = arr.length -1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

   public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     
	     int [] arr = new int[n];
	     for(int i = 0 ; i < n; i++) {
	    	 arr[i] =scn.nextInt();
	     }
	 
	   revrse(arr);
	   dispaly(arr);
	   
   }
}
