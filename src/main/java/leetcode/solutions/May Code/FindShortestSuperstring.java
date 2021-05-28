package leetcode.solutions;
import java.util.*;

/*

	23
	Number leecode problem: 943
	https://leetcode.com/problems/find-the-shortest-superstring/
	Time Complexity: 
	Space Complexity: 
*/

public class FindShortestSuperstring{
	public String shortestSuperstring(String[] words) {
        int n = words.length;
		int[][] graph = new int[n][n];
		int[][] dp = new int[1 << n][n];
		int[][] path = new int[1 << n][n];
		int  min = Integer.MAX_VALUE;
		int last = -1;
		buildGraph(graph, words);
		for(int i = 0; i < path.length; i++)Arrays.fill(path[i], -1);
		
		for(int i = 1; i < (1<<n); i++){
			Arrays.fill(dp[i], Integer.MAX_VALUE);
			for(int j = 0; j < n; i++){
				if((i & (1 << j)) == 0)continue;
				int prev = i ^ (1 << j);
				if(prev == 0)dp[i][j] = words[j].length();
				else {
					for(int k = 0; k < n; k++){
						if(dp[prev][k] < Integer.MAX_VALUE && dp[prev][k] + graph[k][j] < dp[i][j]){
							dp[i][j] = dp[prev][k] + graph[k][j];
							path[i][j] = k;
						}
					}
				}
				if(i == (1<< n) -1 && dp[i][j] < min){
					min = dp[i][j];
					last = j;
				}
			}
		}
		
		StringBuilder res = new StringBuilder();
		int s = (1<<n) - 1;
		while(s > 0){
			int prevNode = path[s][last];
			if(prevNode == -1)
				res.insert(0, words[last]);
			else
				res.insert(0, words[last].substring(words[last].length() - graph[prevNode][last]));
			
			s = s ^ (1 << last);
			last = prev;
		}
		
		return res.toString();
    }
	
	
	private void buildGraph(int[][] graph, String[] words){
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph.length; j++){
				boolean overloap = false;
				for(int index = 0; index < words[i].length;  index++){
					if(words[j].startsWith(words[i].substring(index))){
						graph[i][j] = words[j].length() - (words[i].length() - index);
						overloap = true; break;
					}
				}
			}
			if(!overloap)graph[i][j] = words[j].length();
		}
	}
}