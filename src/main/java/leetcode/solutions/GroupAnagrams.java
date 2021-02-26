package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 49

	https://leetcode.com/problems/group-anagrams/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class GroupAnagrams{

	public List<List<String>> groupAnagrams(String[] strs){
		int[] prime = {2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
	
		Map<Long, Integer> map = new HashMap<>();
		String[] words = new String[strs.length];
		int index = 0;
		
		long cost = 1_000_000_000_000_000_007l;
		
		List<List<String>> res = new ArrayList();
		for(String s: strs){
			long aux = 1;
			for(char c: s.toCharArray()){
				aux*= prime[c- 'a'];
				//aux%= cost;
			}
			
			if(aux.containsKey(aux)){
				res.get(aux).add(s);
			} else {
				map.put(aux, index);
				res.add(new ArrayList());
				res.get(index++).add(s);
			}
		}
		
		return res;
	}
}
