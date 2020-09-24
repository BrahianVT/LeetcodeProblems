package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 32
	https://leetcode.com/problems/longest-valid-parentheses/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class LongestValidParentheses{
	
	int longestValidParentheses(String s) {
		
		Stack<Integer> stack = new Stack();
		
		int longest = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if( c == '('){
				stack.push(i);
			} else if( stack.isEmpty() || s.charAt(stack.peek()) == ')'){
				stack.push(i);
			} else {
				stack.pop();
				longest = Math.max(i - (stack.isEmpty()?-1:stack.peek()), longest);
			}
		}
		
		
		return longest;
	}
}
