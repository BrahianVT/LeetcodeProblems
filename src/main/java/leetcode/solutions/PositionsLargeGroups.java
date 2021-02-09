
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 830
	https://leetcode.com/problems/positions-of-large-groups/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class PositionsLargeGroups {
	public List<List<Integer>> largeGroupPosition(String S){
		List<List<Integer>> res = new ArrayList();
		char[] s = S.toCharArray();
		char aux = s[0];
		int count = 1, a = 0, i = 1;
		for(; i < s.length; i++){
			if(aux == s[i]){
				count++;
			} else {
				if(count >= 3) res.add(Arrays.asList(a, i-1));
				aux = s[i]; count = 1; a = 1;
			}
		}
		if(count >=3)res.add(Arrays.asList(a, i-1));
		
		return res;
	}
	
}