
package leetcode.solutions;
import java.util.*;
/*
	Problem : 6
	Number leecode problem: 1338
	https://leetcode.com/problems/reduce-array-size-to-the-half/
    Time Complexity: O(n log n) 
    Space Complexity: O(n)
*/


public class ReduceArraySizeHalf{
	
	 public int minSetSize(int[] arr) {
		Arrays.sort(arr);
		int l = 0 ,r = 0 , n = arr.length;
		Integer[] len = new Integer[n];
		int iLen = 0;
		
		for(; r < n; r++){
			if(arr[r] != arr[l]){
				len[iLen++] = r - l;
				l = r;
			}
		}
		len[iLen++] = r - l;
		
		for(; iLen < n; iLen++)len[iLen] = 0;
		
		Arrays.sort(len, (p1, p2) -> p2 - p1);
		int cont = n;;
		iLen = 0;
		while(cont > n/2){
			cont-= len[iLen++];
		}
		
		return iLen;
     }
	
}
