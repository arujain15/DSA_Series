package com.arushi.slidingwindowday2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringAtmost2DistinctCharacter {

	public static void main(String[] args) {
		String s = "eceba";
		
		Map<Character, Integer> map = new HashMap<>();
		
		int left = 0, maxLength = 0;
		
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			map.put(ch,  map.getOrDefault(ch, 0) + 1);
			
			while(map.size() > 2)
			{
				char leftChar = s.charAt(left);
				
				map.put(leftChar, map.get(leftChar) - 1);
				
				if(map.get(leftChar) == 0)
				{
					map.remove(leftChar);
				}
				left++;
			}
			
			int windowLength = right - left + 1;
			maxLength = Math.max(maxLength, windowLength);
			
		}
		
		System.out.println("Maximum length : " + maxLength);
	}

}
