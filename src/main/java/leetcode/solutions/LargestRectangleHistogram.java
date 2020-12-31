

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 84
https://leetcode.com/problems/largest-rectangle-in-histogram/
 
    Time Complexity: O(n)
    Space Complexity: O(n)
	
*/

 public class LargestRectangleHistogram{
	 
	public int largestRectangleArea(int[] heights) {
		int max = 0, n = heights.length;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i <= n; i++){
			int h = i ==n?0:heights[i];
			if(stack.isEmpty() || h >= heights[stack.peek()]){
				stack.push(i);
			} else {
				int top = stack.pop();
				max = Math.max(max, heights[top] * (stack.isEmpty()?i: i - stack.peek() -1));
				i--;
			}
		}
		
		return max;
	}
	 
 }