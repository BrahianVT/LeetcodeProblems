
package leetcode.solutions;
import java.util.*;
/*
	Problem : 10
	Number leecode problem: 926
	https://leetcode.com/problems/flip-string-to-monotone-increasing/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class FlipStringMonotoneIncreasing{
	
	public int minFlipsMonoIncr(String s) {
		
		char[] c = s.toCharArray();
		
		int ones = 0, res = 0;
		for(int i = 1; i <= c.length; i++){
			if(c[i - 1] == '1')
				ones++;
			else
				res = Math.max(res + 1, ones);
		}
		
		return res;
    }

}