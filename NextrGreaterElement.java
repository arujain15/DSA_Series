package com.arushi;

import java.util.Arrays;
import java.util.Stack;

public class NextrGreaterElement {

	public static void main(String[] args) {
		int[] arr = {2, 1, 2, 4, 3};
		int[] result = new int[arr.length];
		Arrays.fill(result, -1);
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			while(!stack.isEmpty() && arr[i] > arr[stack.peek()] )
			{
				int index = stack.pop();
				result[index] = arr[i];
			}
			stack.push(i);
		}
		
		System.out.println(Arrays.toString(result));
	}

}
