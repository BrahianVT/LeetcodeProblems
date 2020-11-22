package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 95
https://leetcode.com/problems/interleaving-string/
    Time Complexity: O(n + m)
    Space Complexity: O( n + m)
*/
public class InterleavingString{
	public boolean isInterleave(String s1, String s2, String s3) {
	
		char[] c1 = s1.toCharArray(), s2.toCharArray(), s3.toCharArray();
		int n = s1.length, c2 = s2.length;
	}
	
	
	private boolean dfs(char[] c1,char[] c2,char[] c3, i, j, k, boolean[][] invalid){
		if(invalid[i][j])return false;
		if (k == c3.length)return false;
		
		boolean isValid = i < c1.length && c1[i] == c3[k] && dfs(c1, c2 ,c3 , i+1, j,k+1,invalid) ||
							j < c2.length && c2[j] == c3[k] && dfs(c1, c2, c3, i, j+1, k+1, invalid);
							
		if(!isValid)invalid[i][j] = true;
		return isValid;
	}
	
	
}