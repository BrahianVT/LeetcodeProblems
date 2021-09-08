

package leetcode.solutions;
import java.util.*;
/*
	Problem : 1
	Number leecode problem: 153
	https://leetcode.com/problems/array-nesting/submissions/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class ArrayNesting{
	public int arrayNesting(int[] nums) {
        int res = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != Integer.MAX_VALUE){
				int start = nums[i], cont = 0;
				while(nums[start] != Integer.MAX_VALUE){
					int temp = start;
					start = nums[start];
					cont++;
					nums[temp] = Integer.MAX_VALUE;
				}
				res = Math.max(res, cont);
			}
		}
    }
}