
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 815
	https://leetcode.com/problems/bus-routes/
    Time Complexity: O(E + V)
    Space Complexity: O(E + V)

*/


public class BusRoutes{
	public int numBusesToDestination(int[][] routes, int S, int T){
		HashSet<Integer> visited = new HashSet<>();
		Deque<Integer> q = new ArrayDeque<>();
		
		Map<Integer, ArrayList<<Integer>> graph = new HashMap<>();
		
		int res = 0,n = routes.length;
		if(S == T) return 0;
		
		for(int i = 0; i < n; i++){
			for(int node: routes[i]){
				graph.computeIfAbsent(node,v -> new ArrayList()).add(i);
			}
		}
		
		q.offer(S);
		
		while(!q.isEmpty()){
			int stops = q.size();
			res++;
			for(int i = 0; i < stops; i++){
				int currentStop = q.poll();
				for(int stop: graph.get(currentStop)){
					if(visited.contains(stop))continue;
					visited.add(stop);
					
					for(int j = 0; j < routes[stop].length; i++){
						if(routes[stop][j] == T) return res;
						q.offer(routes[stop][j]);
					}
				}
			}
		}
		
		return  -1;
	}
}
