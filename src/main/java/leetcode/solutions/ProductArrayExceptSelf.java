
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 238
https://leetcode.com/problems/product-of-array-except-self/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class ProductArrayExceptSelf{
	public int[] productExceptSelf(int[] nums) {
			
		int[] res = new int[nums.length];
		res[0] = 1;
		for(int i = 1; i < nums.length; i++){
			res[i] = res[i - 1] * nums[i - 1]; 
		}
		
		int right = 1;
		for(int i = nums.length -1; i >= 0; i--){
			res[i]*= right;
			right*= nums[i];
		}
		
		return res;
	}
}