package com.arushi.slidingwindowd4;

import java.util.HashMap;
import java.util.Map;

public class MinimunWindowSubstring {
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		System.out.println(new MinimunWindowSubstring().minWindow(s, t));
	}

	public String minWindow(String s, String t) {
		
		if(s.length() < t.length()) 
			return "Invalid String";
		
		Map<Character, Integer> tMap = new HashMap<>();
		Map<Character, Integer> windowMap = new HashMap<>();
		
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
		}
		
		int required = tMap.size();
		int formed = 0;
		
		int left = 0, right = 0;
		
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		while(right < s.length())
		{
			char ch = s.charAt(right);
			windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
			
			if(tMap.containsKey(ch) && windowMap.get(ch).intValue() == tMap.get(ch).intValue())
			{
				formed++;
			}
			
			right++;
			
			while(formed == required)
			{
				if((right - left) < minLength)
				{
					minLength = right - left;
					start = left;
				}
				
				char leftChar = s.charAt(left);
				
				windowMap.put(leftChar, windowMap.get(leftChar) - 1);
				
				if(tMap.containsKey(leftChar) && windowMap.get(leftChar) < tMap.get(leftChar))
					formed--;
				
				
				left++;
			}
		}
		
		return (minLength == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLength);
		
	}
}
