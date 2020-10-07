package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 42

	https://leetcode.com/problems/trapping-rain-water/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class  TrappingRainWater{
	
	public int trap(int[] height){
		if(height < 3) return 0;
		int maxLeft = height[0], maxRight = height[height.length - 1];
		int left = 1, right = height.length - 2;
		int water = 0;
		
		while(left <= right){
			if(maxLeft <= maxRight){
				maxLeft = Math.max(maxLeft, height[left]);
				water+= maxLeft - height[left++];
			} else {
				maxRight = Math.max(maxRight, height[right]);
				water+= maxRight - height[right --];
			}
		}
		
		
		return water;
	}
}