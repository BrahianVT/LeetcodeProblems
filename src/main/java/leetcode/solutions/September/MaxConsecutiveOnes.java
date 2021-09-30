

package leetcode.solutions;
import java.util.*;
/*
	Problem : 21
	Number leecode problem: 485
	https://leetcode.com/problems/max-consecutive-ones/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class MaxConsecutiveOnes{
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int res = 0, max = 0;
		for(int n: nums){
			if(n == 1)aux++;
			else {
				res = Math.max(res, aux);
				aux = 0;
			}
		}
		res = Math.max(res, aux);
		
		return res:
    }
}
