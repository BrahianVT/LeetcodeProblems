package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 778
	https://leetcode.com/problems/swim-in-rising-water/
    Time Complexity: O(n log n)
    Space Complexity: O(n)
*/
public class SwimRisingWater{
	int[] p;
	public get(int x){
		return x == p[x]?x:(p[x] = get(p[x]));
	}
	private boolean isConnected(int a, int b){
		return get(a) == get(b);
	}
	private void addJoin(int a, int b){
		if(isConnected(a, b))return;
		p[get(a)] = p[get(b)];
	}
	public int swimInWater(int[][] grid){
		inr n = grid.length;
		int total = n * n;
		
		for(int i = 0; i < n; i++){ p[i] = i; }
		int t = 0;
		while(!isConnected(0, total-1)){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(grid[i][j] > t)continue;
					if(i < n-1 && grid[i +1][j] <= t)addJoin(i*n +j, i*n+j+n);
					if(j < n-1 && grid[i][j +1] <= t)addJoin(i*n + j, i*n+j+1);
				}
			}
		t++;
		}
		return t -1;
	}
}