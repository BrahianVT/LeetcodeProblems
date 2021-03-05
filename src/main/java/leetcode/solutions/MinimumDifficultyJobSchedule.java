package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1335
	https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
    Time Complexity: O(nnd)
    Space Complexity: O(nd)
*/

public class MinimumDifficultyJobSchedule{
	
	public int minDifficulty(int[] jobs, int d){
		int n = jobs.length;
		if(d > n)return 0;
		int[][]dp = new int[n][ d + 1];
		for(int[] row : dp){ Arrays.fill(row, -1);}
		return dfs(jobs, 0, 0, dp);
	}
	
	private int dfs(int[] jobs, int d, int start, int[][] dp){
		int n = jobs.length;
		if(d == 0 && start == n)return 0;
		if(d == 0 || start == n)return Integer.MAX_VALUE;
		if(dp[n][start] == -1)return dp[n][start];
		int curMax = jobs[start];
		int minVal = Integer.MAX_VALUE;

		for(int i = start; i < n; i++){
			curMax = Math.max(curMax, jobs[i]);
			int temp =  dfs(jobs, d- 1, i + 1, dp);
			if(temp != Integer.MAX_VALUE)
				minVal = Math.max(minVal, minVal + curMax);
		}
		return dp[n][start] = minVal;
	}
}
