package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1679
	https://leetcode.com/problems/max-number-of-k-sum-pairs/
    Time Complexity: O(n^2)
    Space Complexity: O(1)
*/
public class FindMostCompetitiveSubsequence{
	
	public int[] mostCompetitive(int[] nums, int k) {
		Stack<Integer> stack = new Stack();
		int len = nums.length;
		for(int i = 0; i < len; i++){
			while(!stack.isEmpty() && stack.peek() > nums[i] && stack.size() - 1 + len - i >= k)
				stack.pop();
		}
		
		return stack.stream().mapToInt(i -> i).toArray();
	}
}