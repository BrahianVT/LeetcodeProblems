package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 907
	https://leetcode.com/problems/sum-of-subarray-minimums/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class SumSubarrayMinimums{
	public int sumSubArray(int[] arr){
		Stack<Integer> s = new Stack<Integer>();
		s.push(-1);
		int[] dp = new int[arr.length + 1];
		int mod = 1000000007, res = 0; 
		for(int i = 0; i < arr.length; i++){
			while(s.peek() != -1 && arr[i] <= s.peek())s.pop();
			
			dp[i+ 1] = (dp[ s.peek() + 1] + (i - s.peek()) * arr[i])% mod;
			s.push(i);
			res+= dp[i + 1];
			res%=mod;
		}
		return res;
	}
}