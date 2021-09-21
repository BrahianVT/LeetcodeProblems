
package leetcode.solutions;
import java.util.*;
/*
	Problem : 12
	Number leecode problem: 882
	https://leetcode.com/problems/reachable-nodes-in-subdivided-graph/
    Time Complexity: O(n+m)
    Space Complexity: o(n+m)
*/

public class ReachableNodes {
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        Map<Integer, Map<Integer, Integer>> g = new HashMap<>();
		
		for(int i = 0; i < n; i++)g.put(i, new HashMap());
		
		for(int[] v : edges){
			g.get(v[0]).put(v[1], v[2]);
			g.get(v[1]).put(v[0], v[2]);
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0], a[0]);
		
		pq.offer(new int[]{maxMoves, 0});
		HashMap<Integer, Integer> seen = new HashMap<>();
		
		while(!pq.isEmpty()){
			int moves = pq.peek()[0], i = pq.peek()[1];
			pq.poll();
			if(!seen.containsKey(i)){
				seen.put(i, moves);
				for(int j : g.get(i).keySet()){
					int move2 = moves - g.get(i).get(j) -1;
					if(!seen.containsKey(j) && move2 >= 0)
						pq.offer(new int[]{move2, j });
				}
			}
		}
		int res = seen.size();
		for(int[] v: edges){
			int a = seen.getOrDefault(v[0], 0);
			int b = seen.getOrDefault(v[1], 0);
			res+= Math.min(a + b , v[2]);
		}
		
		return res;
    }
}