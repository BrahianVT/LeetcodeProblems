
package leetcode.solutions;
import java.util.*;
/*
	23
	Number leecode problem: 696
https://leetcode.com/problems/count-binary-substrings/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    


 public class CountBinarySubstrings{
	 public int countBinarySubstrings(String s) {
		 int cur = 1, pre = 0, res = 0;
		 char[] c = s.toCharArray();
		 for(int i = 1; i < c.length; i++){
			 if(c[i] == c[i-1])cur++;
			 else{
				 res+= Math.min(cur, pre);
				 pre = cur;
				 cur = 1;
			 }
		 }
		 return res + Math.min(cur, pre);
	 }
 }