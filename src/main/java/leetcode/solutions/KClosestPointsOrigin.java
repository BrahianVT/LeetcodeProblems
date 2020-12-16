package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 189
	https://leetcode.com/problems/rotate-array/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class KClosestPointsOrigin{
	
	
	public int[][] kClosest(int[][] points, int K) {
		int[][] res = new int[K][2];
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((p1,p2)-> (p1[0] * p1[0] + p1[1] * p1[1])-(p2[0]* p2[0] + p2[1] * p2[1]));

		for(int[] p : points){
			pq.offer(p);
		}
		int i = 0;
		while(K > 0){
			res[i++] = pq.poll();
			K--;
		}
		
		return res;
	}
}