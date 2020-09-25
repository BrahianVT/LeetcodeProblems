
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 332
	https://leetcode.com/problems/reconstruct-itinerary/
    Time Complexity: O( e + v)
    Space Complexity: O(e + v)
*/

public class ReconstructItinerary{
	
	
	Map<String, PriorityQueue<String>> graph = new HashMap();
	List<String> route = new LinkedList();
	
	public List<String> findItinerary(List<List<String>> tickets){
		for(List<String> ticket: tickets){
			graph.computeIfAbsent(ticket.get(0), v -> new PriorityQueue()).add(ticket.get(1));
		}
		
		eulerianPath("JFK");
		
		return route;
	}
	
	
	private void eulerianPath(String airport){
		
		while(graph.containsKey(airport) && graph.get(airport).size() > 0 ){
			eulerianPath(graph.get(airport).poll());
		}
		
		route.add(0, airport);
	}
}