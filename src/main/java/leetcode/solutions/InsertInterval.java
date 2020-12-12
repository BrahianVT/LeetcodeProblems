´
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 57
	https://leetcode.com/problems/insert-interval/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class InsertInterval{
	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> res = new ArrayList<>();
		int i = 0
		int a = newInterval[0], b = newInterval[1]; 
		for(; i < intervals.length && intervals[i][1] < a; i++){
			res.add(new intervals[i]);
		}
		
		for(; i < intervals.length && intervals[i][0] <= b; i++){
			a = Math.min(a, intervals[i][0]);
			b = Math.max(b, intervals[i][1]);
		}
		res.add(new int[]{a, b});
		
		for(; i < intervals.length; i++){
			res.add(intervals[i]);
		}
		
		return res.toArray(new int[res.size()][]);
	}
	
}

	
	