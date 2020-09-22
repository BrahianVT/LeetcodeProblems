package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 207
	https://leetcode.com/problems/course-schedule/
    Time Complexity: O(E + V)
    Space Complexity: O(E + V)
*/


public class CourseSchedule{
	
	
	public boolean canFinish(int numCourses, int[][] prerequisites){
		
		ArrayList<Integer>[] graph = new ArrayList[];
		
		for(int i = 0; i < numCourses; i++){  graph[i] = new ArrayList(); }
		
		boolean[] visited = new boolean[numCourses];
		
		for(int i = 0; i <numCourses; i++){
			graph[prerequisites[i][1]].add(prerequisites[i][0]);
		}
		
		
		for(int i = 0; i < numCourses; i++){
			if(!dfs(graph, i, visited)){ return false; }
		}
		
		return true;
	}
	
	
	
	public boolean dfs(ArrayList<Integer>[] graph, int start, boolean[] visited){
		
		if(visited[start]){ return false; }
		
		visited[start] = true;
		
		for(int i = 0; i < graph[start].size(); i++){
			if(!dfs(graph, graph[start].get(i), visited)){ return false; }
		}
		visited[start] = false;
		return true;
	}
	
}