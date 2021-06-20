

package leetcode.solutions;
import java.util.*;
/*
	Problem : 16
	Number leecode problem: 473
	https://leetcode.com/problems/generate-parentheses/
    Time Complexity: O(2^2n) 
    Space Complexity: O(n)
*/

public GenerateParentheses{
	public List<String> generateParenthesis(int n) {
        return back(0, 0, new StringBuilder(), n, new ArrayList());
    }
	private void back(int open ,int close, StringBuilder aux, int n,List<String> res){
		if(aux.length() == 2*n){ res.add(aux.toSting());  return; }
		
		if(open < n){
			back(open + 1, close, aux.append('('), n, res);
			aux.removeCharAt(aux.length() -1);
		}
		
		if(close < open){
			back(open, close +1, aux.append(')'), n , res);
			aux.removeCharAt(aux.length() -1);
		}
		
	}
}