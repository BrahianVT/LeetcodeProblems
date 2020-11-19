
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 88
https://leetcode.com/problems/gray-code
    Time Complexity: O(n)
    Space Complexity: O(1)
	
*/
public class GrayCode{
	
	public List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList();
		for(int i = 0; i < 1 << n; i++){
			res.add(i^i >> 1);
		}
		
		return res;
	}
}