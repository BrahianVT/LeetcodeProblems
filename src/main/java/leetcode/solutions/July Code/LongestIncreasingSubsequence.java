

package leetcode.solutions;
import java.util.*;
/*
	Problem : 9
	Number leecode problem: 300
	https://leetcode.com/problems/longest-increasing-subsequence/
    Time Complexity: O(n logn) 
    Space Complexity: O(n)
*/

public class LongestIncreasingSubsequence{

	public int lengthOfLIS(int[] nums){
		int[] res = new int[nums.length];
		int size = 0;
		for(int i = 0; i < = nums.length; i++){
			int l = 0, r = size;
			while(l < r){
				int m = (l + r) /2;
				if(res[m] < nums[i])
					l = m + 1;
				else
					r = m;
			}
			if(l == size)size++;
			res[l] = nums[i];
		}
		
		return size;
	}
}
