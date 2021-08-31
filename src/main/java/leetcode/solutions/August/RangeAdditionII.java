
package leetcode.solutions;
import java.util.*;
/*
	Problem : 30
	Number leecode problem: 598
	https://leetcode.com/problems/range-addition-ii/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class  RangeAdditionII{
	
	 public int maxCount(int m, int n, int[][] ops) {
        int minX = m, minY = n;
		
		for(int o[]: ops){
			minX = Math.min(minX, o[0]);
			minY = Math.min(minY, o[1|]);
		}

		return minX * minY;		
    }
}