
package leetcode.solutions;
import java.util.*;
/*
	Problem : 1
	Number leecode problem: 97
	https://leetcode.com/problems/interleaving-string/
    Time Complexity: O(n*m) 
    Space Complexity: O(n)
*/


public class InterleavingString{
	
	public boolean isInterleave(String s1, String s2, String s3){
		
		char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
		int n1 = c1.length, n2 = c2.length, n3 = s3.length;
		if(n1 + n2 != n3) return false;
		return dfs(c1, c2, c3, new boolean[n1+ 1][n2 + 1]);
	}
	
	private boolean dfs(char[] c1, char[] c2, char[] c3, boolean[][] invalidate, int i, int j, int k){
		if(invalidate[i][j])return false;
		
		if(k == c3.length) return true;
		
		
		boolean valid = i < c1.length && c1[i] == c3[k] && dfs(c1, c2, c3, i+1, j, k+1) || 
						j < c1.length && c2[j] == c3[k] && dfs(c1, c2, c3, i, j+1, k+1);
		
		if(!valid)invalidate[i][j] = false;
	}

}