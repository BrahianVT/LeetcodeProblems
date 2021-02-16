package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1376
	https://leetcode.com/problems/time-needed-to-inform-all-employees/
    Time Complexity: O(n + m)
    Space Complexity: O(n + m)
*/

public class TimeNeededInformAllEmployees{
	public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
		List<List<Integer>> graph = new ArrayList();
		
		for(int i = 0; i < n; i++){
			graph.add(new ArrayList());
		}
		
		for(int i = 0; i < manager.length; i++){
			if(manager[i] == -1)continue;
			graph.get(manager[i]).add(i);
		}
		
		return dfs(graph, headID, informTime, 0);
	}
	
	private int dfs(List<List<Integer>> graph, int s, int[] informTime, int aux){
		if(graph.get(s).size() == 0)return time;
		int aux = 0;
		for(int to: graph.get(s)){
			aux = Math.max(aux, dfs(graph, to, informTime, aux + informTime[s]));
		}
		
		return aux;
	}
}