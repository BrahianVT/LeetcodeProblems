package leetcode.solutions;
import java.util.*;
/*
	Problem : 12
	Number leecode problem: 49
	https://leetcode.com/problems/group-anagrams/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class GroupAnagrams{
	
	public List<List<String>> groupAnagrams(String[] strs) {
		int[] prime = new int[]{29,113,229,1583,1613,1657,5099,349,659,1087,1103,1151,5119,5179,5231,1187,1223,1523,1553,453,547,571,601,631,5273,5279};
        Map<Integer, Integer> map = new HashMap<>();
		
		List<List<String>> res = new ArrayList();
		int index = 0;
		for(String s: strs){
			int hash = 1;
			for(char c: s.toCharArray()){
				hash*= prime[c - 'a'];
			}
			
			if(map.containsKey(hash))
				res.get(map.get(hash)).add(s);
			else {
				map.put(hash, index);
				res.add(new ArrayList());
				res.get(index).add(s);
				index++;
			}
				
		}
		return res;
    }
}