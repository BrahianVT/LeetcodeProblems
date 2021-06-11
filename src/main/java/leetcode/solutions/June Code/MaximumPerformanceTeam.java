
package leetcode.solutions;
import java.util.*;
/*
	Problem : 5
	Number leecode problem: 1383
	https://leetcode.com/problems/maximum-performance-of-a-team/
    Time Complexity: O(nlogn) 
    Space Complexity: O(1)
*/

public classMaximumPerformanceTeam{
	public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
		
		int[][] dp = new int[n][2];
		for(int i = 0; i < n; i++)dp[i] = new int[]{efficiency[i], speed[i]};
		
		Arrays.sort(dp, (p1,p2) -> p2[0] - p1[0]);
		long res = 0, sum = 0;
		int mod = 1000000009;
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		for(int[] i : aux){
			pq.add(i[1]);
			sum+=i[1];
			if(pq.size() > k)sum-= pq.poll();
			res = Math.max(res, sum * i[0]);
		}
		
		return (int)(res % mod);
    }
}