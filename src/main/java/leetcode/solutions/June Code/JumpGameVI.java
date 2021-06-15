package leetcode.solutions;
import java.util.*;
/*
	Problem : 9
	Number leecode problem: 1696
	https://leetcode.com/problems/jump-game-vi/
    Time Complexity: O(n*k) 
    Space Complexity: O(n)
*/


public class JumpGameVI{
	public int maxResult(int[] nums, int k) {
		Deque<Integer> dq = new ArrayDeque();
		df.offer(0);
		for(int i = 1 ; i < nums.length; i++){
			nums[i] = nums[i] + nums[dq.peekFirst()];
			while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])dp.pollLast();
			dq.offerLast(i);
			if(i - dp.peekFirst() >= k)dp.pollFirst();
		}
		
		return nums[nums.length -1];
    }

}