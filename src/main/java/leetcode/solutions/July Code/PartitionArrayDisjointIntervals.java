

package leetcode.solutions;
import java.util.*;
/*
	Problem : 22
	Number leecode problem: 915
	https://leetcode.com/problems/partition-array-into-disjoint-intervals/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/

public class PartitionArrayDisjointIntervals{
	
	public int partitionDisjoint(int[] nums) {
		int left = nums[0];
		int maxLeft = left, index = 0;
		
		for(int i = 1; i < nums.length; i++){
			if(left > nums[i]){
				left = maxLeft;
				index = i;
			}else maxLeft = Math.max(maxLeft, nums[i]);
		}
		
		return index +1;
    }
}