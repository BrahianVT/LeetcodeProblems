

package leetcode.solutions;
import java.util.*;
/*
	16
	Number leecode problem: 1209
	https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/
public class RemoveAllAdjacentDuplicatesStringII{
	public String removeDuplicates(String s, int k) {
		StringBuilder res = new StringBulder(s);
		boolean isRemove = true;
		while(isRemove){
			isRemove = false;
			int i = 1, freq = 1; char c = 'a'; if(res.length() != 0) c = s.charAt(0);
			while(i < res.length()){
				if(c == res.length()){
					freq++, i++; continue;
				} else {
					if(freq == k){
						res.delete(i-k, i); isRemove = true;
						i-=k;
					}
					c = res.charAt(i); freq = 1;
				}
			}
			if(freq == k){
				res.delete(i-k,i); isRemove = true;
			}
		}
		return res.toString();
    }
}