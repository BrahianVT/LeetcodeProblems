package leetcode.solutions;
import java.util.*;
/*
	Problem : 28
	Number leecode problem: 1047
	https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/


public class RemoveAllAdjacentDuplicatesString{
	
	public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack();

		for(int i = 0; i< s.length(); i++){
			if(!stack.isEmpty() && stack.peek() == s.charAt(i))stack.poll();
			else stack.push(s.charAt(i));
		}
		
		StringBuilder res = new StringBuilder();
		for(Character c: stack)res.append(c);
		
		return res.toString();
    }

}