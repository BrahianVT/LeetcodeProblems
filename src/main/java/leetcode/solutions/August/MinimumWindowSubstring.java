package leetcode.solutions;
import java.util.*;
/*
	Problem : 15
	Number leecode problem: 76
	https://leetcode.com/problems/minimum-window-substring/
    Time Complexity: O(s + t)
    Space Complexity: O(1)
*/

public class MinimumWindowSubstring {
	
	public String minWindow(String s, String t){
		int[] map = new int[128];
		char[] p = t.toCharArray();
		
		for(int i = 0; i < p.length; i++)map[p[i]]++;
		
		int i = 0, j = 0, minStart = 0, minLen = 100000, cont = p.length;
		
		while(j < s.length()){
			int a = s.charAt(j++);
			if(map[a]-- > 0)cont--;
			
			while(cont == 0){
				if(j-i < minLen){
					minLen = j-i;
					minStart = i;
				}
				if(++map[s.charAt(i++)] > 0)cont++;
			}
		}
		
		return minLen == 100000?"":s.substring(minStart, minStart + minLen);
	}
}