


package leetcode.solutions;
import java.util.*;
/*
	Problem : 20
	Number leecode problem: 778
	https://leetcode.com/problems/swim-in-rising-water/
    Time Complexity: O(nlog n) 
    Space Complexity: O(n^2)
*/


public class  SwimRisingWater{

	public int swimInWater(int[][] grid) {
		int n = grid.length;
		PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> p1[2] - p2[2]);
		int[][] coor = {{1,0}, {-1,0},{0,1}, {0,-1}};
		pq.offer(new int[]{0, 0, grid[0][0]});
		boolean[][] used = new boolean[n][n];
		
		used[0][0] = true;
		while(pq.size()){
				int[] aux = pq.poll(), max = aux[2];
				for(int k = 0; k < 4; k++){
					int a = aux[0] + coor[k][0], b = aux[1] + coor[k][1];
					if(a < 0 || a == n || b < 0 || b == n )continue;
					if(!used[a][b]){
						used[a][b] = true;
						int ele =  Math.max(max, grid[a][b]);
						if(a == n-1 && b == n-1) return ele;
						pq.offer( new int[]{a,b,ele});
					}
					
				}		
			
		}
		return 0;
		
    }

}