package leetcode.solutions;
import java.util.*;

/**
 Number leecode problem: 743
	https://leetcode.com/problems/network-delay-time/
    Time Complexity: O(E log(v))
    Space Complexity: O(V)
*/
public class NetworkDelayTime{
	
	public int networkDelayTime(int[][] times, int N, int K){
		
		List<List<int[]>> adjacencyList = new ArrayList();
		
		for(int i = 0; i <= N; i++){ adjacencyList.add(new ArrayList()); }
		for(int i = 0; i < times.length; i++){
			adjacencyList.get(times[i][0]).add(new int[]{times[i][1], times[i][2]});
		}
	}
	
	
	private int dijkstra(int start, int n, List<List<int[]>> graph){
		double dist = new double[ n + 1];
		boolean[] visited = new boolean[n + 1];
		Arrays.fill(dist, Double.POSITIVE_INFINITY);
		
		dist[start] = 0;
		
		PriorityQueue<int[]> pq = new PriorityQueue<int[]> (n * 2, (p1, p2) -> p1[1] - p2[1]);
		
		pq.offer(new int[]{start, 0});
		
		int longest = 0;
		auxSize = 1;
		while(!pq.isEmpty()){
			int[] node = pq.poll();
			visited[node[0]] = true;
			if(dist[node[0]] < node[1]){ continue; }
			
			for(int i = 0; i < graph.get(node[0]).size(); i++){
				int[] edge = graph.get(node[0]).get(i);
				
				if(visited[edge[0]]){ continue; }
				
				double newDist = dist[node[0]] + edge[1];
				if(newDist < dist[edge[0]]){
					if(dist[edge[0]] == Double.POSITIVE_INFINITY){ auxSize++; }
					pq.offer(new int[]{edge[0], (int)newDist});
				}
			}
			
			if(dist[node[0]] > longest){
				longest = (int)dist[node[0]];
			}
		}
		
		return auxSize == n ? longest : -1;
	}
	
}