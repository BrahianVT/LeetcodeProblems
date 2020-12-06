
package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 1249
	https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class MinimumRemoveMakeValidParentheses{

	public String minRemoveToMakeValid(String s) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == '(')stack.push(i);
			else if ( c == ')' ){
				if(!stack.isEmpty() && c.charAt(stack.peek()) == '(')stack.pop();
				else stack.push(i);
			}
		}
		int end = s.length();
		String res = "";
		while(!stack.isEmpty()){
			int start = stack.pop();
			res = s.substring(start + 1, end) + res;
			end = start;
		}
		if(end > 1)res = s.substring(0, end) + res;
		return res;
	}
}
