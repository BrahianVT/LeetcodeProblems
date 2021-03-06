
import java.util.*;

/**
   Number leecode problem:22
   Link: https://leetcode.com/problems/generate-parentheses/
   
   Time Complexity: O(2 ^ 2n)
   Space Complexity: O(n)
*/

public class GenerateParentheses{
	
	 public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList();
		
		backtracking(0,0,new StringBuilder(), n, res);
		 return res;
	}
	
	private void backtracking(int open, int close, StringBuilder aux, int n, List<String> res){
		if(aux.length() == n * 2){
			res.add(aux.toString()); return;
		}
		
		if(open < n){
			backtracking(open +1, close, aux.append("("), n, res);
			aux.deleteCharAt(aux.length() - 1);
		}
		
		if(close < open){
			backtracking(open, close+1, aux.append(")"), n, res);
			aux.deleteCharAt(aux.length() - 1);
		}
	}
}
