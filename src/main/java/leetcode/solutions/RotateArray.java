
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 189
	https://leetcode.com/problems/rotate-array/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class RotateArray{
	public void rotate(int[] nums, int k) {
        int k = k%nums.length;
		
		
		swap(nums, 0, nums.length -1);
		swap(nums, 0, k -1);
		swap(nums, k, nums.length -1);
    }
	
	private swap(int[] nums, int s ,int e){
		for(; s < e; s++, e--){
			int aux = nums[e];
			nums[e] = nums[s];
			nums[s] = aux;
		}
	}
}