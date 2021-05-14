

package leetcode.solutions;
import java.util.*;
/*
	5
	Number leecode problem: 45
	https://leetcode.com/problems/jump-game-ii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    
public class JumpGameII{
	public int jump(int[] nums) {
		int endHere = nums[0], endFar = nums[0];
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			endFar = Math.max(endFar, nums[i] + i);
			if(i == endHere){
				res++;
				endHere = endFar;
			}
		}
		return res;
    }
}