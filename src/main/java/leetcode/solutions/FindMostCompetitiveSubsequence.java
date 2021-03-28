package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1673
	https://leetcode.com/problems/find-the-most-competitive-subsequence/
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
			if(stack.size() < k)stack.push();
		}
		
		return stack.stream().mapToInt(i -> i).toArray();
	}
}
