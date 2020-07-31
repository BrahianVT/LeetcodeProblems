

package leetcode.solutions;
/**
 Number leecode problem: 11
	https://leetcode.com/problems/container-with-most-water/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class ContainerWithMostWater{
	
	  public int maxArea(int[] height) {
		  
		  int start = 0, end = height -1;
		  int max = 0;
		  while(start < end){
			  max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
			  
			  if(height[start] < height[end]){
				  start++;
			  } else {
				end--;
			  }
		  }
		  
		return max;
	  }
		
}