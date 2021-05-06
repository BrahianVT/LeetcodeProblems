

package leetcode.solutions;
import java.util.*;
/*
	15
	Number leecode problem: 509
	https://leetcode.com/problems/partition-list/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/
public class FibonacciNumber{
	public int fib(int n) {
		int[] res = new int[n+1];
		res[1] = 1;
		for(int i = 2; i <= n; i++){
			res[i]+= res[i-1] + res[i-2];
		}
		
		return res[n];
    }
}
