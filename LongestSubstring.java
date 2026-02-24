package com.arushi.slidingwindowday1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
		
		Map<Character, Integer> map = new HashMap<>();
		
		int left = 0;
		int maxLength = 0;
		
		for(int right = 0; right < s.length(); right++)
		{
			char ch = s.charAt(right);
			
			if(map.containsKey(ch) && map.get(ch) >= left)
			{
				left = map.get(ch) + 1;
			}
			
			map.put(ch, right);
			
			int windowLength = right - left + 1;
			maxLength = Math.max(maxLength, windowLength);
		}
		
		System.out.println("Longest Length: " + maxLength);

	}

}
