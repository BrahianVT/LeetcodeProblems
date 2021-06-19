

package leetcode.solutions;
import java.util.*;
/*
	Problem : 13
	Number leecode problem: 336
	https://leetcode.com/problems/palindrome-pairs/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/


public class PalindromePairs{
	
	public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList();
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < words.length; i++)map.put(words[i], i);
		
		for(int i = 0; i < words.length; i++){
			int l = 0, r = 0, len = words[i].length();
			while(l <= r){
				String aux =  new StringBuilder(words[i].substring(l, r)).reverse().toString();
				Integer index = map.get(aux);
				if(index != null && index != i){
					if(l == 0 && isPal(words[i].substring(r, len)))
						res.add(Arrays.asList(new Integer[]{i, j}));
					else if(r == len && isPal(words[i].substring(0,l)))
						res.add(Arrays.asList(bew Integer[]{j,i}));
				}
				if(r < len) r++;
			else ++l;
			}	
		}
		return res;
    }
	
	private boolean isPal(String a){
		for(int i = 0; i < a.length()/2; i++){
			if(a.charAt(i) != a.charAt(a.length() - 1- i))return false;
		}
		return true;
	}
}