
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 66
	https://leetcode.com/problems/plus-one/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class PlusOne{
	
	public int[] plusOne(int[] digits){
		int[] res;
		boolean oneMore = true;
		for(int n: digits){ if(n != 9){ oneMore = false; break; } }
		res = (oneMore)?new int[digits.length + 1]:new int[digits.length];
		
		int sum = 1;
		int indexR = res.length - 1;
		for(int i = digits.length - 1; i >= 0; i--){
			sum[i]+= digits[i];
			res[indexR--] = sum%10;
			sum/=10;
		}
		
		if(sum > 0){ res[0] = 1; }
		return res;
	}
}