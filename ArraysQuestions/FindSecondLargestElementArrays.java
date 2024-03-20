package ArraysQuestions;
import java.util.*;
public class FindSecondLargestElementArrays {
	public static int secondLargestElement(int arr[]) {
		if(arr.length <= 2) {
			return -1 ;
		}
		
		int large = Integer.MIN_VALUE;
		int secondlarge = Integer.MIN_VALUE;
		
		for(int i =  0 ; i < arr.length ; i++) {
			if(arr[i] > large) {
				secondlarge = large;
				large= arr[i];
			}else if (arr[i] > secondlarge && large != arr[i]) {
				secondlarge = arr[i];
			}
		}
		return secondlarge;
		
	}
	
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();

	int [] arr = new int [n];
	for(int i  = 0 ; i < arr.length; i++) {
		arr[i] = scn.nextInt();
	}
	System.out.println("Second largest is : "+secondLargestElement(arr));
  }
}
