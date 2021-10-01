
package leetcode.solutions;
import java.util.*;
/*
	Problem : 24
	Number leecode problem: 1137
	https://leetcode.com/problems/n-th-tribonacci-number/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/



public class NthTribonacciNumber{
	
	public int tribonacci(int n) {
		int t1 = 0; if(n < 2) n ==1?1:t1;
		int t2 = 1; if(n == 2)return t1 + t2;
		int t3 = t1 + t2 + 1;
		t1 = t2;
		t2 = 1;
		for(int i = 4; i <= n; i++){
			int aux = t3;
			t3 = t3 + t2 + t1;
			t1 = t2;
			t2 = aux;
		}
		
		return t3;
    }
}