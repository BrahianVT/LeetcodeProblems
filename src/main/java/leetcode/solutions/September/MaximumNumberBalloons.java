
package leetcode.solutions;
import java.util.*;
/*
	Problem : 13
	Number leecode problem: 882
	https://leetcode.com/problems/reachable-nodes-in-subdivided-graph/
    Time Complexity: O(n)
    Space Complexity: o(n)
*/

public class MaximumNumberBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] map = ne int[26];
		for(char c : text.toCharArray())map[c - 'a']++;
		
		int res = Math.min(map['b' -'a'], map['a', 'a']);
		res = Math.min(res, map['a' - 'n']);
		
		if(res == 0) return 0;
		res = Math.min(res, map['l' - 'a']/2);
		res = Math.min(res, map['o' - 'a']/2);
		
		return res;
    }
}