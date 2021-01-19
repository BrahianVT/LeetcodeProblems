package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 819
	https://leetcode.com/problems/most-common-word/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class MostCommonWord{
	public String mostCommonWord(String paragraph, String[] banned){
		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		for(String ban: banned)set.add(ban);
		char[] p = paragraph.toCharArray();
		StringBuilder word = new StringBuilder();
		String max = ""; int maxFreq = 0;
		
		for(int i = 0; i < p.length; i++){
			char aux = Character.toLowerCase(p[i]);
			if(aux >= 'a' && aux <= 'z')word.append(aux);
			else if(word.length() > 0 && !set.contains(word.toString())){
				int freq = map.getOrDefault(word.toString(), 0) + 1;
				if(freq > maxFreq){ maxFreq = freq; max = word.toString(); }
				map.put(word.toString(), freq);
				word.setLength(0);
			} else word.setLength(0); 
		}
		
		return max.length() == 0?word.toString():max;
	}
}