package com.arushi;

import java.util.Arrays;
import java.util.Stack;

public class StackSpanProblem {

	public static void main(String[] args) {
		int[] arr = {100, 80, 60, 70, 60, 75, 85};
		
		Stack<Integer> stack = new Stack<>();
		
		int[] span = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
			{
				span[i] = i + 1;
			}
			else
			{
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
		
		System.out.println(Arrays.toString(span));

	}

}
