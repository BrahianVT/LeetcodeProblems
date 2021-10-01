
package leetcode.solutions;
import java.util.*;
/*
	Problem : 28
	Number leecode problem: 922
	https://leetcode.com/problems/sort-array-by-parity-ii/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class SortArrayParityII{
	 public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1;
		while(even < nums.length && odd < nums.length){
			
			
			while(even < nums.length && nums[even] % 2 == 0)even = even + 2;
			while(odd < nums.length && nums[odd] % 2 == 0)odd = odd + 2;
			
			if(even < nums.length && odd < nums.length && even != oddd){
				int aux = nums[odd];
				nums[odd] = nums[even];
				nums[even] = nums[aux];
			}
		}
		
		return nums;
    }
}