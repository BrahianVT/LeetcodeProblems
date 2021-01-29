package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 378
	https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
 public class KthSmallestElementSortedMatrix{
	public int kthsmallest(int[][] matrix, int k){
		int n = matrix.length;
		PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> p1[2] - p2[2]);
		for(int j = 0; j < n; j++){ pq.offer(new int[]{0 ,j, matrix[0][j]}); }
		for(int i = 0; i <  k-1; i++){
			int[] p = pq.poll();
			if(p[0] == n -1)continue;
			pq.offer(new int[]{p[0] + 1, p1[1], matrix[p[0] + 1][p[1]]});
		}
		
		return pq.peek()[2];
	}
 
 }