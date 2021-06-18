

package leetcode.solutions;
import java.util.*;
/*
	Problem : 12
	Number leecode problem: 871
	https://leetcode.com/problems/minimum-number-of-refueling-stops/
    Time Complexity: O(n^2) 
    Space Complexity: O(n)
*/
public class MinimumNumberRefuelingStops{
	 public int minRefuelStops(int target, int startFuel, int[][] stations) {
		int fuel = startFuel, miles = 0,res = 0, i = 0;	
		PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2 -p1);
		while(fuel < target){
			for(; i < stations.length && fuel >= stations[i][0]; i++){
				pq.offer(stations[i][1]);
			}
			if(pq.isEmpty())return -1;
			fuel+=pq.poll(); res++;
		}
		return res;	
	 }
}