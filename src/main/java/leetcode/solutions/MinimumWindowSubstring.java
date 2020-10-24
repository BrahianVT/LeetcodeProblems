package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 76
https://leetcode.com/problems/minimum-window-substring/
 
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public MinimumWindowSubstring{
	
	public String minWindow(String s, String t){
		int[] map = new int[128];
		for(char c: t.toCharArray()){
			map[c]++;	
		}
		int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0, counter = t.length();
		
		while(end < s.length()){
			char c = s.charAt(end);
			if(map[c] > 0)counter--;
			map[c]--; end++;
			
			while(counter == 0){
				if(end - start < minLen){
					minLen = end -start;
					start = start;
				}
				char c2 = s.charAt(start);
				map[c2]++; start++;
				if(map[c2] > 0)counter++;
			}
		}
		
		return minLen == Integer.MAX_VALUE?"":s.substring(minStart, minStart + end);
	}
}