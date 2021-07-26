

package leetcode.solutions;
import java.util.*;
/*
	Problem : 20
	Number leecode problem: 384
	https://leetcode.com/problems/shuffle-an-array/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/


public class ShuffleArray{
	int[] nums;
	Random r = new Random();
	public ShuffleArray(int[] nums){
		this.nums = nums;
	}
	public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = nums.clone();
		
		for(int i = nums.length; i > 0; i--){
			int a = r.nextInt(i);
			int aux = nums[a];
			nums[a] = nums[i-1];
			nums[i-1] = aux;
		}
    }
}

