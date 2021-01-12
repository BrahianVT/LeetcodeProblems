package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 791
	https://leetcode.com/problems/custom-sort-string/
    Time Complexity: O(nlog(n))
    Space Complexity: O(nlog(n))
*/
public class CustomSortString{
	public String customSortString(String S, String T){
		int[] map = new int[26];
		int i = 0;  Arrays.fill(map, 26);
		for(char c: S.toCharArray())map[c - 'a'] = i++;
		
		String res = Arrays.stream(T.split(""))
			.sorted((o1, o2) ->{
				int a = o1.charAt(0)- 'a', b = o2.charAt(0) - 'a';
				return map[a] - map[b]; })
			.collect(Collectors.joining());
		
		return res;	
	}
}