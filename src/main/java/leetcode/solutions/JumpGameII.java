
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 45

	https://leetcode.com/problems/jump-game-ii/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class JumpGameII{
	
	public int jump(int[] nums){
		int res = 0;
		int curEnd = 0, curFarthest = 0;
		
		for(int i = 0; i < nums.length-1; i++){
			
			curFarthest = Math.max(curFarthest, i + nums[i]);
			if(curEnd == i){
				res++; curEnd = curFarthest;
			}
		}
		
		returb res++;
	}
}