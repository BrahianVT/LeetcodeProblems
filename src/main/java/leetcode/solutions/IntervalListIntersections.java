
package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 986
	https://leetcode.com/problems/interval-list-intersections/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class IntervalListIntersections{
	
	public int[][] intervalIntersection(int[][] A, int[][] B) {
		
		List<int[]> res = new ArrayList();
		if(A.length == 0 || B.length == 0){ return res.toArray(new int[res.size()]);}
		
		int i = 0, j = 0;
		while(i < A.length && j < B.length){
			if(B[j][0] <= A[i][1] && B[j][0] >= A[i][0] || A[i][0] <= B[j][1] && A[i][0] >= B[j][0]){
				int a = Math.max(A[i][0], B[j][0]);
				int b = Math.min(A[i][1], B[j][1]);
				res.add(new int[]{a, b});
			}
			
			if(A[i][1] >= B[j][1])j++
			else i++;
		}
		
		return res.toArray(new int[res.size()][]);
	}
}
