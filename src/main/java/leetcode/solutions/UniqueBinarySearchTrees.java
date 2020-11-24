package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 96
https://leetcode.com/problems/unique-binary-search-trees/
    Time Complexity: O(n + m)
    Space Complexity: O( n + m)
*/

public class UniqueBinarySearchTrees{
	
	
	public int numTrees(int n) {
	
		// catalan numbers;
		
		int[] dp = new int[n +1];
		dp[0] = dp[1] = 1;
		
		for(int level = 2; level <= n; i++){
			for(int i = 1; i <= level; i++){
				dp[level]+= dp[level - i] * dp[i - 1];
			}
		}
		
		return dp[n];
	}
	
}