


package leetcode.solutions;
import java.util.*;
/*
	Problem : 31
	Number leecode problem: 42
	https://leetcode.com/problems/trapping-rain-water/
	 Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class TrappingRainWater{

	public int trap(int[] height) {
		if(height.length < 3)return 0;
        int l = 1, r = height.length-2;
		int maxLeft = height[l-1], maxRight[r+1];
		
		int res = 0;
		while(l < r){
			if(height[l] <= height[r]){
				maxLeft = Math.max(maxLeft, height[l]);
				res+= maxLeft-height[l++];
			} else{
				maxRight = Math.max(maxRight, height[r]);
				res+= maxRight-height[r--];
			}
		}
		return res;
    }
}