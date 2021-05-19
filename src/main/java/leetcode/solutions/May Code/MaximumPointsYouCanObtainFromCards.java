
package leetcode.solutions;
import java.util.*;
/*
	11
	Number leecode problem: 1423
	https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/    

public class MaximumPointsYouCanObtainFromCards{
	
	public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
		for(int n: cardPoints)sum+=n;
		int window = 0, ws = cardPoints.length - k;
		for(int i = 0; i < ws; i++)window+=cardPoints[i];
		
		int res = sum - window;
		for(int i = 1; i <= cardPoints.length - ws; i++){
			window = window - cardPoints[i - 1] + cardPoints[i + ws - 1];
			res = Math.res(res, sum - window);
		}
		return res;
    }
}