
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 301
	https://leetcode.com/problems/remove-invalid-parentheses/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/
public class RemoveInvalidParentheses{
	public List<String> removeInvalidParentheses(String s) {
		List<String> res = new ArrayList();
		
	}
	private void remove(List<String> res, char[] c , int iLast, int jLast, char open, char close){
		int i = iLast , cont  = 0;
		while(i < c.length; && cont >= 0){
			if(c[i] == open)cont++;
			if(c[i] == close)cont--;
			i++;
		}
		if(cont >= 0){ // No extra found
			String revert = new StringBuilder(String.valueOf(c)).revert().toString();
			if(open = '(')remove(res, revert.toCharArray(), 0, 0, ')','(');
			else res.add(revert);
		} else {
			i--;
			for(int j = jLast; j <= i; j++){
				if(c[j] == close &&(j == jLast || c[j-1] != close))
					remove(res, chunck(c, 0, j, j + 1, c.length), i, j, open, close);
			}
		}
	}
	
	private char[] chunck(char[] c, int s, int end, int s2, int end2){
		char[] res = new char[end - s + end2 - s2];
		int i = 0;
		for(int j = s; j < end; j++){
			res[i++] = j; 
		}
		for(int j = s2; j < end2; j++){
			res[i++] = j;
		}
		return res;
	}
}