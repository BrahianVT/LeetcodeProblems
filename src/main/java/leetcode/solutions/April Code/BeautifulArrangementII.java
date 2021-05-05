
package leetcode.solutions;
import java.util.*;
/*
	11
	Number leecode problem:329
	https://leetcode.com/problems/beautiful-arrangement-ii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/
public class BeautifulArrangementII{
	
	public int[] constructArray(int n, int k) {
		int i = 1, j = n;
		int[] res = new int[n];
		for(int i = 0; i < n; i++){
			res[i] = k%2==0?i++:j--;
		}
		return res;
	}
}