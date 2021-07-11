


package leetcode.solutions;
import java.util.*;
/*
	Problem : 7
	Number leecode problem: 378
	https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
    Time Complexity: O(n log m) 
    Space Complexity: O(1)
*/


  public class KthSmallestElementSortedMatrix{
	  public int kthSmallest(int[][] matrix, int k) {
		  
		  int s = matrix[0][0], end = matrix[matrix.length -1][matrix[0].length-1];
		  while(s < end){
			  int m = (s + end) / 2;
			  int cont = getElement(matrix, m);
			  if(cont < k)
				  s = m + 1;
			  else
				  end = m; 
		  }
		  
		  return s;		  
      }
	  
	  private int getElement(int[][] matrix, int ele){
		  int res = 0, i = matrix.length-1, j = 0;
		  while(i >= 0; && j < matrix[0].length){
			  if(matrix[i][j] <= ele)
				  res += i+1;
				  j++;
			  else {
				  i--;				  
			  }
		  }
		  return res;
	  }
  }