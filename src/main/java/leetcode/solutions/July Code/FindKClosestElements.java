
package leetcode.solutions;
import java.util.*;
/*
	Problem : 2
	Number leecode problem: 658
	https://leetcode.com/problems/find-k-closest-elements/
    Time Complexity: O(n log n) 
    Space Complexity: O(n)
*/


public class FindKClosestElements{
	 public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
		int s = 0, end = arr.length - k;
		
		while(s < end ){
			int m = (s + end) / 2;	
			if(x - arr[m] >  arr[m + k] - x)
				s = m +1;
			else
				end = m;
				
		}
		
		return Arrays.stream(arr, s, s + k).boxed().collect(Collectors.toList());
    }
}