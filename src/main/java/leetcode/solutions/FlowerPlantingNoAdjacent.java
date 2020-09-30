package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 1042
	https://leetcode.com/problems/flower-planting-with-no-adjacent/
	
    Time Complexity: O(N) 
    Space Complexity: O(N)
*/

public class FlowerPlantingNoAdjacent{
	
	public int[] gardenNoAdj(int N, int[][] paths){
		
		Map<Integer, List<Integer>> graph = new HashMap<>();
		
		for(int i = 0; i < N; i++){ graph.put(i, new ArrayList<>(3)); }
		
		for(int[] p: paths){
			graph.get(p[0] - 1).add(p[1] - 1);
			graph.get(p[1] - 1).add(p[0] - 1);
		}
		
		
		int[] res = new int[N];
		for(int i = 0; i < N; i++){
			int[] colors = new int[5];
			
			for(int gardens: graph.get(i)){
				colors[res[gardens]] = 1;
			}
			
			for(int j = 4; j > 0; j--){
				if(colors[j] == 0){ res[i] = j; }
			}
		}
		
		return res;
	}
}