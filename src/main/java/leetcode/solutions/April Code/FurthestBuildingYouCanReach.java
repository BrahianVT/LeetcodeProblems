
package leetcode.solutions;
import java.util.*;
/*
	26
	Number leecode problem: 1642
https://leetcode.com/problems/furthest-building-you-can-reach/
    Time Complexity: O(nlogn) 
    Space Complexity: O(n)
*/

public class FurthestBuildingYouCanReach{
	public int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < heights.length-1; i++){
			int diff = heights[i+1] - heights[i];
			if(diff > 0)
				pq.offer(diff);
			if(pq.size() > ladders)
				bricks-= pq.poll();
			if(bricks < 0)
				return i;
		}
		return heights.length-1;
	}
}