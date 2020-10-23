
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 75
 https://leetcode.com/problems/sort-colors/
 
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class SortColors{
	public void sortColors(int[] num){
		int start = 0, mid = 0, end = num.length - 1;
		while(mid <= end){
			if(num[mid] == 0){
				int aux = num[mid]; num[mid++] = num[start];
				num[start++] = aux; 
			} else if(num[mid] == 1) mid++;
			else {
				int aux = num[mid]; num[end--] = num[mid];
				num[mid] = aux;
			}
		}
	}
}