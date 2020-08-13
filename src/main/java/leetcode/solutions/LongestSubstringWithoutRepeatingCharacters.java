package leetcode.Solutions;

import java.util.HashMap;
import java.util.Map;

/**
   Number leecode problem: 3
   Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
   
   Time Complexity: O(n)
   Space Complexity: O(n)
*/

public class LongestSubstringWithoutRepeatingCharacters{
	
	
	public int lengthOfLongestSubstring(String s){
		
		if(s.length() == 0) return 0;
		
		int res = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0, j = 0; i < s.length(); i++){
			
			if(map.containsKey(s.charAt(i))){
				
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.chartAt(i), i);
			res = Math.max(res, i-j+1);
			
		}
		
		return res;
	}
}