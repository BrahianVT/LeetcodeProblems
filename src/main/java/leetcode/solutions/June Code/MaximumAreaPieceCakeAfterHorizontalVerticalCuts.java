
package leetcode.solutions;
import java.util.*;
/*
	Problem : 2
	Number leecode problem: 1465
	https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
    Time Complexity: O(nlogn +  mlogm) 
    Space Complexity: O(1)
*/


public class MaximumAreaPieceCakeAfterHorizontalVerticalCuts{

	 public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);
		long diffH = 0, diffW = 0;
		maxH = 0;
		maxH = horizontalCuts[0];
		for(int i = 1; i < horizontalCuts.length; i++){
			maxH = Math.max(maxH,horizontalCuts[i] - horizontalCuts[i-1]);
		}
		maxH = Math.max(maxH, h - horizontalCuts[horizontalCuts.length - 1]);
		
		maxW = 0;
		maxW = verticalCuts[0];
		for(int j = 1; j < verticalCuts.length; j++){
			maxW = Math.max(maxW, verticalCuts[j] - verticalCuts[j-1]);
		}
		maxW = Math.max(maxW, w - verticalCuts[verticalCuts.length -1]);
		
		return (int)((maxH * maxW)% 1000000007); 
    }
}

