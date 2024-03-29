package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 72
 
	https://leetcode.com/problems/edit-distance/
    Time Complexity: O(n*m)
    Space Complexity: O(n*m)
*/



public class EditDistance{
	
	public int minDistance(String word1, String word2){
		int[][] dp = new int[word1.length() + 1][word2.length() + 1];
		
		for(int i = 0; i < word1.length(); i++){ dp[i][0] = i; }
		for(int i = 0; i < word2.length(); i++){ dp[0][i] = i; }
		
		for(int i = 0; i < word1.length(); i++){
			for(int j = 0; j < word2.length(); j++){
				if(word1.charAt(i) == word2.charAt(j))dp[i + 1][ j + 1] = dp[i][j];
				else
				dp[i + 1][ j + 1] = Math.min(dp[i][j], Math.min(dp[i +1][j], dp[i][ j + 1])) + 1;
			}
		}
		
		return dp[word1.length][word2.length];
	}
}
