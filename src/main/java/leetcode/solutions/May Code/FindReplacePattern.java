


package leetcode.solutions;
import java.util.*;
/*
	21
	Number leecode problem: 102
	https://leetcode.com/problems/find-and-replace-pattern/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/   
public class FindReplacePattern{
	
	public List<String> findAndReplacePattern(String[] words, String pattern) {
        
		int[] map = new int[26];
		List<String> res = new ArrayList();
		for(String w : words){
			boolean match =true; 
			Set<Integer> d = new HashSet<>();
			for(int i = 0; i < pattern.length; i++){
				int c = w.charAt(i) - 'a', p = pattern.charAt(i) - 'a';
				if(map[c] == -1 && d.add(p))map[c] = p;
				
				if(map[c] != p){ match = false; break;}
			}
			Arrays.fill(map, -1);
			if(match)res.add(w);
		}
		
		return res;
    }
}