package leetcode.solutions;
import java.util.*;
/*
	Problem : 28
	Number leecode problem: 1235
	https://leetcode.com/problems/maximum-profit-in-job-scheduling/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class  MaximumProfitJobScheduling{
	
	 public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		int n = startTime.length;
		int[][] jobs = new int[n][3];
		
		for(int i = 0; i < n; i++){
			jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
		}
		
		Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
		TreeMap<Integer, Integer> dp = new TreeMap<>();
		dp.put(0,0);
		
		for(int[] job: jobs){
			int cur = dp.floorEntry(job[0]).getValue() + job[2];
			if(cur > dp.lastEntry().getValue())
				dp.put(job[1], cur);
		}
		return dp.lastEntry().getValue();
     }
}
