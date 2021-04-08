
package leetcode.solutions;
import java.util.*;
/*
	3
	Number leecode problem: 32
	DP knapsack approach
	https://leetcode.com/problems/longest-valid-parentheses/
    Time Complexity: O(n)  
    Space Complexity: O(n)
*/
public class LongestValidParentheses{
	public int longestValidParentheses(String st) {
		char[] c = s.toCharArray();
		int res = 0;
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < c.length; i++){
			if(c[i] == '(')s.push(i);
			else if(s.isEmpty() || c[s.peek()] == ')')s.push(i);
			else{
				int top = s.pop();
				res = Math.max(res, i - (s.isEmpty()?-1:s.peek()));
			}
		}
		return res;
    }
}