

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 399
	https://leetcode.com/problems/evaluate-division/
    Time Complexity: O(Q(E + V)) Q:Size of queries
    Space Complexity: O(Q(E + V))
*/

public class EvaluateDivision{
	
	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		Map<String, Map<String, Double>> graph = new HashMap<>();
		double[] res = new double[queries.size()];

		for(int i = 0; i < equations.size(); i++){
			String from = equations.get(i).get(0), to = equations.get(i).get(1);
			graph.computeIfAbsent(from, v -> new HashMap()).put(to, values[i]);
			graph.computeIfAbsent(to, v -> new HashMap()).put(from, 1/values[i]);
		}
		
		for(int i = 0; i < res.length; i++){
			String from = queries.get(i)(0), to = queries.get(i)(1);
			res[i] = dfs(from, to ,1, graph, new HashSet()); 
			
		}
		
		return res;
	}
	
	private double dfs(String from, String to, double aux, Map<String, Map<String, Double>> graph, Set<String> visited){
		if(!graph.containsKey(from) || !visited.add(from)){ return -1; }
		
		if(from.equals(to)) return aux;
		
		for(String node: graph.get(from).keySet()){
			double res = dfs(node, to, aux * graph.get(from).get(node), graph, visited);
			if(res != -1) return res;
		}
		
		return -1;
	}
}


