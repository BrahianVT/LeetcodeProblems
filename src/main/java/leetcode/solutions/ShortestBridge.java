

package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 934
	https://leetcode.com/problems/shortest-bridge/
    Time Complexity: O(i + j)
    Space Complexity: O(i + j)
*/

public class ShortestBridge{
	
	public int shortestBridge(int[][] a) {
		Queue<Integer> queue = new ArrayDeque();
		boolean flag = false;
		for(int i = 0; i < a.length && !flag; i++){
			for(int j = 0; i < a[0].length; j++){
				if(a[i][j] == 1){
					flag = true;
					dfs(a, i, j, queue);
					break;
				}
			}
		}
		
		int res = 0;
		
		int coor = {{1,0},{-1,0},{0,1},{0,-1}};
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int t = 0; t < size; t++){
				int aux = queue.poll();
				for(int[] coo: coor){
					int i = aux[0] + coo[0];
					int j = aux[1] + coo[1];
					if(i < 0 || j < 0 || i == a.length || j == a[0].length)continue;
					if(aux[i][j] == 1){ return res; }
					a[i][j] = -1;
					queue.offer(new int[]{i, j});
				}
			}
			res++;
		}
		return -1;
	}
	
	
	private void dfs(int[][] a, int i , int j, Queue<Integer> queue){
		
		if(i < 0 || i == a.length || j < 0 || j == a[0].length || a[i][j] != 1)return;
		
		a[i][j] = -1;
		queue.offer(new int{i, j });
		dfs(a, i + 1, j, queue);
		dfs(a, i - 1, j, queue);
		dfs(a, i, j - 1, queue);
		dfs(a, i, j + 1, queue);
	}
}
 
 
 
