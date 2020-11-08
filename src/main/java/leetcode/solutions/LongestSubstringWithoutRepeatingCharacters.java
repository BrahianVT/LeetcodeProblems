package leetcode.Solutions;

import java.util.HashMap;
import java.util.Map;

/**
   Number leecode problem: 3
   Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
   
   Time Complexity: O(n)
   Space Complexity: O(1)
*/

public class LongestSubstringWithoutRepeatingCharacters{
	
	
	public int lengthOfLongestSubstring(String s){
		
		if(s.length() == 0) return 0;
		
		int res = 0;
		int[] map = new int[256];
		Arrays.fill(map, -1);
		for(int i = 0, j = 0; i < s.length(); i++){
			int c = s.charAt(i); 
			if( map[c] != -1){
				j = Math.max(j, map[c] + 1);
			}
			map[c] = i;
			res = Math.max(res, i-j+1);		
		}
		
		return res;
	}
}