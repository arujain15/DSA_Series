package com.arushi.slidingwindowday1;

public class MaximumSum2 {

	public static void main(String[] args) {
				//   0 1 2 3 4 5 6 7 8
		int[] arr = {4,2,10,23,3,1,0,20};
		int k = 4;
		int windowSum = 0;
		
		for(int i = 0; i < k; i++)
		{
			windowSum += arr[i];  //windowSum = 4 + 2 + 10 + 23 = 39
		}
		
		int maxSum = windowSum;  //maxSum = 39
		
		for (int i = k; i < arr.length; i++) { //arr[i - k] = 3	,arr[i] = 7
			windowSum = windowSum - arr[i - k] + arr[i]; //
			
			maxSum = Math.max(maxSum, windowSum); //
		}
		
		System.out.println("Maximum Sum: " + maxSum);

	}

}
