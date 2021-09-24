
package leetcode.solutions;
import java.util.*;
/*
	Problem : 15
	Number leecode problem: 917
	https://leetcode.com/problems/reverse-only-letters/
    Time Complexity: O(n)
    Space Complexity: o(n)
*/


public class LongestTurbulentSubarray{

	  public int maxTurbulenceSize(int[] arr) {
			int inc = 1, dec = 1, res = 1;
			for(int i = 1; i < arr.length; i++){
				int aux = Integer.compare(arr[i], arr[i-1]);
				if(aux > 0){
					inc = dec + 1;
					dec = 1;
				} else if(aux < 0){
					dec = inc + 1;
					inc = 1;
				} else {
					inc = dec = 1;
				}
				
				res = Math.max(res, Math.max(dec, inc));
			}
			return ress;
	  }

}