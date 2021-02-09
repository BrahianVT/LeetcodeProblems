package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 836
	https://leetcode.com/problems/rectangle-overlap/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class RectangleOverlap{
	public boolean isOverlap(int[] rec1, int[] rec2){
		boolean x = false, y = false;
		if(Math.max(rec1[0], rec2[0]) < Math.min(rec1[2],rec2[2]))
			x = true;
		if(Math.max(rec1[1], rec2[1]) < Math.min(rec1[3], rec2[3]))
			y = true;
		
		return x & y;
	}
}