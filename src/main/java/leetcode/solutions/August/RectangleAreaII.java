
package leetcode.solutions;
import java.util.*;
/*
	Problem : 22
	Number leecode problem: 850
	https://leetcode.com/problems/rectangle-area-ii/
    Time Complexity: O(n^2)
    Space Complexity: O(n)
*/


public class RectangleAreaII{
	 public int rectangleArea(int[][] rectangles) {
		int mod = (int)1e9 + 7;
		long res = 0;
		List<int[]> recList = new ArrayList();
		
		for(int[] rec: rectangles)
			addRec(recList, rec, 0);
		
		for(int[] rec : recList)
			res = (res + (long)(rec[2] - rec[0]) + (long)(rec[3] - rec[1])) % mod;
		
		return (int)res%mod;
    }
	
	private void addRec(List<int[]> recList, int[] curRec, int start){
		if(start >= recList.size()){ recList.add(curRec); return; }
		
		int[] r = recList.get(start);
		if(curRec[2] <= r[0] || curRec[3] <= r[1] || curRec[0] >= r[2] || curRec[1] >= r[3]){
			addRec(recList, curRec, start +1); return;
		}
		
		if(curRec[0] < r[0])
			addRec(recList, new int[]{curRec[0], curRec[1], r[0], curRec[3]}, start + 1);
		
		if(curRec[2] > r[2])
			addRec(recList, new int[]{r[2], curRec[1],curRec[2],curRec[3]}, start + 1);
		
		if(curRec[1] < r[1])
			addRec(recList, new int[]{Math.max(r[0], curRec[0]), curRec[1], Math.min(r[2], curRec[2]), r[1]}, start + 1);
		
		if(curRec[3] > r[3])
			addRec(recList, new int[]{Math.max(r[0], curRec[0]), r[3], Math.min(r[2], curRec[2]), curRec[3]}, start + 1);
	}
}