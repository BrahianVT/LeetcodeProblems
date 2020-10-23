package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 74
 
https://leetcode.com/problems/search-a-2d-matrix/
    Time Complexity: O(log n + log m)
    Space Complexity: O(1)
*/

public Search2DMatrix{
	public boolean searchMatrix(int[][] matrix, int target){
		if(matrix.length == 0 || matrix[0].length == 0)return false;
		
		int s = 0, end = matrix.length;
		while(s < end){
			int m = (s + end)/2;
			if(target == matrix[m][0])return true;
			else if(target > matrix[m][0]){
				if(target <= matrix[m][matrix[m].length-1]){
					if(Arrays.binarySearch(matrix[m], target) > -1)return true;
					return false;
				}
				s = m + 1;
			} else {
				end = m;
			}
		}
		return false;
	}
}