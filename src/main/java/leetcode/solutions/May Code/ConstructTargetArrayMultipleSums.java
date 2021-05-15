

package leetcode.solutions;
import java.util.*;
/*
	9
	Number leecode problem: 1354
	https://leetcode.com/problems/construct-target-array-with-multiple-sums/

	Time Complexity: O(2n)
	Space Complexity: O(1)
*/    

public class ConstructTargetArrayMultipleSums{
	public boolean isPossible(int[] target){
        long sum = 0;
		for(int n:sum)sum+=n;
		for(int i = maxId(nums); sum > 1 && target[i] > sum/2; i = maxId(target)){
			sum-= target[i];
			if(sum <= 1)
				return sum == 1?true:false;
			target[i] = target[i]%(int)sum;
			sum+=target[i];
		}
		return sum == target.length;
    }
	
	private maxId(int[] nums){
		int max = 0;
		for(int i = 1; i < arr.length; i++){
			max = nums[i] > nums[i-1]?i:max;
		}
		return max;
	}
}