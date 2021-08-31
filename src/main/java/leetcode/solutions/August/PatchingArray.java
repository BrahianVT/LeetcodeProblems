
package leetcode.solutions;
import java.util.*;
/*
	Problem : 29
	Number leecode problem: 330
	https://leetcode.com/problems/patching-array/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class PatchingArray{
	
	public int minPatches(int[] nums, int n) {
        long max = 0;
		int cnt = 0, i = 0;
		while(max < n){
			if(i >= nums.length || max < nums[i]-1){
				max+=max + 1;
				cnt++;
			} else {
				max+= nums[i++];
			}
		}
		
		return cnt;
    }
}