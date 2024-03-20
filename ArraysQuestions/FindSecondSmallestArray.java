package ArraysQuestions;

import java.util.*;

public class FindSecondSmallestArray {
	public static int secondSmallest(int arr[]) {
		if (arr.length <= 2) {
			return -1;
		}

		int small = Integer.MAX_VALUE;
		int scendSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				scendSmallest = small;
				small = arr[i];
			} else if (arr[i] < scendSmallest && arr[i] != small) {
				scendSmallest = arr[i];
			}
		}
       return scendSmallest;

	}
     public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Second Smallest : "+secondSmallest(arr));

	}
}
