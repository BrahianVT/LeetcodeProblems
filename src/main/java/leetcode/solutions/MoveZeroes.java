package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem:283
	https://leetcode.com/problems/move-zeroes/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class MoveZeroes{
	public void moveZeroes(int[] nums) {
		int len = 0, cont = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0){ cont++; continue; }
			nums[len++] = nums[i];
		}
		int last = nums.length -1;
		while(cont-- > 0){
			nums[last--] = 0;
		}
	}
}