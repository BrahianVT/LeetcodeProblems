
package leetcode.solutions;
import java.util.*;
/*
	Problem : 27
	Number leecode problem: 135
	https://leetcode.com/problems/candy/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/

public class Candy{
	public int candy(int[] ratings) {
        int down = 0, up = 0, peak = 0, res = 0;
		for(int i = 1;  i < ratings.length; i++){
			if(ratings[i-1] < ratings[i]){
				peak = ++up;
				down = 0;
				res+=1+up;
			} else if(ratings[i-1] == ratings[i]){
				peak = up = down = 0;
				res++;
			} else {
				down++;
				up = 0;
				res+= 1 + down + (peak >= down?-1:0);
			}
		}
		return res;
    }
}