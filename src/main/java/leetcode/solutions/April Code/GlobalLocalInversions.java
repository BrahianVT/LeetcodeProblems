

package leetcode.solutions;
import java.util.*;
/*
	5
	Number leecode problem:775
	https://leetcode.com/problems/global-and-local-inversions/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/
public class GlobalLocalInversions{
	public boolean isIdealPermutation(int[] A) {
		for(int i = 0; i < A.length; i++){
			if(Math.abs(i - A[i]) > 1)return false;
		}
		return true;		
    }
}