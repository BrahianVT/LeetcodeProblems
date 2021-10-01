
package leetcode.solutions;
import java.util.*;
/*
	Problem : 26
	Number leecode problem: 1293
	https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class ShortestPathGridObstaclesElimination{
	
	 public int shortestPath(int[][] grid, int k) {
	 	Queue<int[]> q = new LinkedList();
		int[][] coor = {{0,1},{1,0},{0,-1},{-1,0}};
		
		q.add(new int[]{0,0,0});
		int res = 0;
		int n = grid.length, m = grid[0].length;
		int[][] seen = new int[n][m];
		for(int i = 0; i < n; i++)Arrays.fill(seen[i], 100000);
		seen[0][0] = 0;
		
		while(!q.isEmpty()){
			int s = q.size();
			while(s-- > 0){
				int[] cur = q.poll();
				if(cur[0] == n-1 && cur[1] == m-1)return res;
				for(int[] d: coor){
					int x = d[0] + cur[0], y = d[1] + cur[1];
					if(x < 0 || x >= n || y < 0 || y >= m)continue;
					int aux = grid[x][y] + cur[2];
					if(aux >= seen[x][y] || aux > k)continue;
					seen[x][y] = aux;
					q.offer(new int[]{x,y,aux});
				}
			}
		}
     }
}