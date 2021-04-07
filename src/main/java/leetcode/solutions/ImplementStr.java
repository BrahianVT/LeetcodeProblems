
package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:28
   https://leetcode.com/problems/implement-strstr/
   
   Time Complexity: O(n-m) n: length of hayStack m: length of needle
   Space Complexity: O(1)
*/

public class ImplementStr{
	
	public int strStr(String haystack, String needle) {
		if(needle == null || needle == 0 || needle.length() < haystack.length()){ return -1; }
		
		int sizeS = hayStack.length(), sizeP = needle.length();
		
		for( int i = 0; i <= sizeS - sizeP; i++){
			if(haystack.charAt(i) == needle.charAt(0)){
				if(haystack.substring(i, i+sizeP).equals(needle)) return i;
			}
		}
		
		return -1;
    }
	
}
