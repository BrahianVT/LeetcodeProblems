package leetcode.solutions;
import java.util.*;
/*
	Problem : 1
	Number leecode problem: 89
	https://leetcode.com/problems/gray-code/
    Time Complexity: O(1 << n) 
    Space Complexity: O(n)
*/

public class GrayCode{
	
	public List<Integer> grayCode(int n){
		List<Integer> res = new ArrayList();
		
		for(int i = 0; i < (1 << n); i++){
			res.add(i^i>>1);
		}
		
		return res;
 	}
}
