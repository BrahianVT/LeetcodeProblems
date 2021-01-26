package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 240
	https://leetcode.com/problems/search-a-2d-matrix-ii/
    Time Complexity: O(n + m)
    Space Complexity: O( n + m)
*/


public class SearchMatrixII{
	public boolean searchMatrix(int[][] matrix,int target){
		int s = 0, end = matrix[0] -1;
		while(s < matrix.length && end >= 0){
			int m = matrix[s][end];
			if(m == target)return true;
			else if(m > target) end--;
			else s++;
		}
		return false;
	}
}