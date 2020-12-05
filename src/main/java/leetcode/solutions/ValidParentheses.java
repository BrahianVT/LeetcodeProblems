


package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:20
   Link: https://leetcode.com/problems/valid-parentheses/
   
   Time Complexity: O(n)
   Space Complexity: O(n)
*/

public class ValidParentheses{
	
	 public boolean isValid(String s) {
		 
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : s.toCharArray()){
			if(c == '}'){
				if(stack.isEmpty()){ return false; }
				else if('{' != stack.pop()){ return false; }
			}
			else if(c == ')'){
				if(stack.isEmpty()){ return false; }
				else if('(' != stack.pop()){ return false; }				
			}
			else if(c == ']'){
				if(stack.isEmpty()){ return false; }
				else if('[' != stack.pop()){ return false; }
			}
			else atack.append(c);
		}

		
		return stack.isEmpty();
	 }
	
}
