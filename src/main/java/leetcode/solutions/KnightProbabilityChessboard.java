
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 688
	https://leetcode.com/problems/knight-probability-in-chessboard/
    Time Complexity: O(n^2)
    Space Complexity: O(kn^2)
*/

public class KnightProbabilityChessboard{
	static int[][] coor = {{-2,-1},{-2,1},{2,1},{2,-1},{1,-2},{-1,-2},{-1,2},{1,2}};
	public double knightProbability(int N, int K, int r, int c){
		double[][] dp = new int[N][N];
		dp[r][c] = 1;
		double res = 1;
		for(int k = 0; k < K; k++){
			double[][] auxM = new double[N][N];
			double auxRes = 0;
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					for(int[] co: coor){
						int newRow = i + co[0], newCol = j + co[1];
						if(newRow >= 0 && newRow < N && newCol < N && newCol >= 0){
							auxM[newRow][newCol]+= dp[i][j] / 8;
							auxRes+= dp[i][j] / 8;
						}
					}
				}
			}
			dp = auxM; res = auxRes;
		}
		return res;
	}
}


