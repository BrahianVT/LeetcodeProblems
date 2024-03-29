package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1376
	https://leetcode.com/problems/time-needed-to-inform-all-employees/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class ValidateStackSequences{
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> res = new Stack<>();
		int j = 0;
		for(int i = 0; i < pushed.length; i++){
			res.push(pushed[i]);
			while(!res.isEmpty() && j < popped.length && res.peek() == popped[j]){ 
			   j++; res.pop();
			}
		}
		
		return res.isEmpty();
	}
}