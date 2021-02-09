package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 833
	https://leetcode.com/problems/find-and-replace-in-string/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class FindReplaceString{
	public String findReplaceString(String S, int[] indexe, String[] sources, String[] targets){
		StringBuilder res = new StringBuilder();
		Map<Integer, Integer> indexes = new HashMap<>();
		for(int i = 0; i < indexe.length(); i++){
			indexes.put(indexe[i], i);
		}
		for(int i = 0; i < S.length(); i++){
			if(indexes.containsKey(i) && S.substring(i, i + sources[indexes.get(i)].length()).equals(sources[indexes.get(i)])){
				res.append(targets[i]);
				i+= sources[indexes.get(i)].length() -1;
			} else {
				res.append(S.charAt(i));
			}
		}
		
		return res.toString();
	}
}