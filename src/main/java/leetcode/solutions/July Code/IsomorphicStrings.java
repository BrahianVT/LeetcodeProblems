
package leetcode.solutions;
import java.util.*;
/*
	Problem : 12
	Number leecode problem: 205
	https://leetcode.com/problems/isomorphic-strings/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/


class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        boolean[] map = new boolean[256];
		int[] map2 = new int[265];
		Arrays.fill(map2, -1)
		
		for(int i = 0; i < s.length(); i++){
			char a = s.charAt(i), b = t.charAt(i);
			
			if(!map[b] && map2[a] == -1){
				map[b] = true; map2[a] = b;
			}
			if(map2[a]!= b)return false;
		}
		
		return true;
    }
}