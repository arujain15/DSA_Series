package com.arushi.slidingwindowd3;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		String s = "AABBA";
		int k  = 1;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int left = 0, maxFre = 0, maxLength = 0;
		
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
			maxFre = Math.max(maxFre, map.get(ch));
			
			int windowLength = right - left + 1;
			
			if(windowLength - maxFre > k)
			{
				left = map.get(ch) + 1;
			}
			
			maxLength = Math.max(maxLength, right - left + 1);
		}

		System.out.println(maxLength);
	}

}
