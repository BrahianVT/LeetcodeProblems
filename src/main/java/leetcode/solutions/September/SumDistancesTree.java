

package leetcode.solutions;
import java.util.*;
/*
	Problem : 4
	Number leecode problem: 834
	https://leetcode.com/problems/sum-of-distances-in-tree/
    Time Complexity: O(n + m)
    Space Complexity: O(n + m)
*/


public class SumDistancesTree{
	int[] res, cont;
	public int[] sumOfDistancesInTree(int n, int[][] edges) {
		List<List<Integer>> graph = new ArrayList();
		
		for(int i = 0; i < n; i++){ graph.add(new ArrarList()); }
		res = new int[n]; cont = new int[n];
		
		for(int[] e: edges){
			graph.get(e[0]).add(e[1]);
			graph.get(e[1]).add(e[0]);
		}
    }
	
	
	private dfs(List<List<Integer>> graph, int pre, int root){
		for(int i: graph.get(root)){
			if(i == pre)continue;
			dfs(graph, root, i);
			cont[root]+=cont[i];
			res[root]+=res[i] + cont[i];
		}
		cont[root]++;
	}
	
	private dfs2(List<List<Integer>> graph, int pre, int root){
		for(int i : graph.get(root)){
			if(i == pre)continue;
			
			res[i] = res[root] - cont[i] + cont.length - cont[i];
			dfs2(graph, root, i);
		}
	}
	
}