package leetcode.solutions;
import java.util.*;
/*
	Problem : 24
	Number leecode problem: 576
	https://leetcode.com/problems/out-of-boundary-paths/
    Time Complexity: O(nmmaMove) 
    Space Complexity: O(nmmaxMove)
*/


public class OutBoundaryPaths{
	int mod = (int) 1e9 + 7;
	public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
		dfs(dp,m,n,maxMove, startRow, startColumn);
		return  dp[startRow][startColumn][maxMove]% mod;
    }
	
	private int dfs(int[][][] dp, int m, int n, int maxMove, int startRow, int startColumn){
		if(startRow < 0 || startColumn < 0 || startRow == m || startColumn == n)return 1;
		if(startRow - maxMove >= 0 && startColumn  - maxMove >= 0 && m - startRow > maxMove && n - startColumn > maxMove) return 0;
		
		if(dp[startRow][startColumn][maxMove] != 0)return dp[startRow][startColumn][maxMove];
		
		dp[startRow][startColumn][maxMove] = (dp[startRow][startColumn][maxMove] + dfs(dp, m, n, maxMove - 1, startRow + 1, startColumn))% mod;
		dp[startRow][startColumn][maxMove] = (dp[startRow][startColumn][maxMove] + dfs(dp, m, n, maxMove - 1, startRow, startColumn + 1))% mod;
		dp[startRow][startColumn][maxMove] = (dp[startRow][startColumn][maxMove] + dfs(dp, m, n, maxMove - 1, startRow - 1, startColumn))% mod;
		dp[startRow][startColumn][maxMove] = (dp[startRow][startColumn][maxMove] + dfs(dp, m, n, maxMove - 1, startRow, startColumn - 1))% mod;
		
		return dp[startRow][startColumn][maxMove];
	}
}