

package leetcode.solutions;
import java.util.*;
/*
	Problem : 14
	Number leecode problem: 791
	https://leetcode.com/problems/custom-sort-string/
    Time Complexity: O(n log n) 
    Space Complexity: O(n)
*/


public class CustomSorString{
	public String customSorting(String order, String s){
		Character[] array = new Character[s.length()];
		int[] map = new int[26];
		Arrays.fill(map, 27);
		for(int i = 0 , j = 0; i < s.length(); i++){
			array[i] = s.charAt(i);
			if(i < order.length()) map[ order.charAt(i) - 'a'] = i;
		}
		
		Arrays.sort(array, (p1, p2) -> map[p1 - 'a'] - map[p2 - 'a']);
		
		String res = Stream.of(array).
						map(String::valueOf).collect(Collectors.joining());
		return res;
	}
}
