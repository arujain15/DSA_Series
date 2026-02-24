package com.arushi.slidingwindowday1;

public class MaximumSum {

	public static void main(String[] args) {
				//   0 1 2 3 4 5
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		int windowSum = 0;
		
		for(int i = 0; i < k; i++)
		{
			windowSum += arr[i];  //windowSum = 2 + 1 + 5 = 8
		}
		
		int maxSum = windowSum;  //maxSum = 8
		
		for (int i = k; i < arr.length; i++) { //arr[i - k] = 2	,arr[i] = 5
			windowSum = windowSum - arr[i - k] + arr[i]; // 9 - 5 + 2 = 6
			
			maxSum = Math.max(maxSum, windowSum);  //9
		}
		
		System.out.println("Maximum Sum: " + maxSum);

	}

}
