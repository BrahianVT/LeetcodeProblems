

package leetcode.solutions;
import java.util.*;
/*
	28
	Number leecode problem: 1695
	https://leetcode.com/problems/maximum-erasure-value/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/

public class MaximumErasureValue{
	public int maximumUniqueSubarray(int[] nums) {
			
		int res = 0,aux = 0;
		boolean[] map = new boolean[40001];
		Arrays.fill(map, -1);
		for(int i = 0, j = 0; i < nums.length && j < nums.length;){
			if(map[nums[i]]){
				map[nums[j]] = false;
				aux-=nums[j++];
			} else {
				map[nums[i]] = true;
				aux+=nums[i++];
				res = Math.max(res, aux);
			}
		}
		return res;
    }
}
