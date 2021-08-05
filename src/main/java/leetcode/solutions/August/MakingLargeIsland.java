
package leetcode.solutions;
import java.util.*;
/*
	Problem : 1
	Number leecode problem: 827
	https://leetcode.com/problems/making-a-large-island/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/


public class MakingLargeIsland{
	
	public int find(int[] f, int id){
		while(id != f[id]){
			f[id] = f[f[id]];
			id = f[id];
		}
		return id;
	}
	public int largestIsland(int[][] grid) {
		int m = grid.length, n  = grid[0].length;
		int res = 0;
		int[] f	= new int[m * n];
		Arrays.fill(f, -1);
		int[] c = new int[n*m];
		int[] d = new int[]{1,-1,n,-n };
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == 1){
					int cur = i * n + j;
					c[cur] = 1;
					f[cur] = cur;
					
					for(int k = 0; k < 4; k++){
						int nbr = cur + d[k];
						if(nbr < 0 || nbr >= m*n || cur%n == 0 && nbr == cur-1 || nbr%n == 0 && cur == nbr-1 || f[nbr] == -1)continue;
						int prev = find(f, nbr);
						if(prev == cur)continue;
						f[prev] = cur;
						c[cur]+= c[prev];
					}					
				}
			}
		}
			
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == 0){
					int cur = i * n +j, cont = 1;
					Set<Integer> visited = new HashSet<>();
					for(int k = 0; k < 4; k++){
						int nbr = cur + d[k];
						if(nbr < 0 || nbr >= m*n || cur%n == 0 && nbr == cur-1 || nbr%n == 0 && cur == nbr-1 || f[nbr] == -1)continue;
						
						int nbrRoot = find(f, nbr);
						if(visited.add(nbrRoot)) cont+=c[nbrRoot];
					}
					res = Math.max(res, cont);
				}
			}
		}
		return res == 0?m*n:res;
    }
		
		
}



