
package leetcode.solutions;
import java.util.*;
/*
	31
	Number leecode problem: 1268
	https://leetcode.com/problems/search-suggestions-system/
	Time Complexity: O(nlog n)
	Space Complexity: O(1)
*/
public class SearchSuggestionsSystem{
	
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		Array.sort(products);
		
		List<List<String>> res = new ArrayList();
		StringBuilder aux = new StringBuilder();
		
		for(int i = 0; i < searchWord.length; i++){
			aux.append(searchWord.charAt(i));
			int j = bs(products, aux.toString());
			List<String> l = new ArrayList();
			if(j == products.length){ for(; i < searchWord.length; i++)res.add(l); continue; }
			for(;j < products.length && products[j].indexOf(aux.toString()) == 0 && l.size() < 3; j++)
				l.add(products[j]);
			
			res.add(l);
		}
		return res;
    }
	
	private int bs(String[] products, String pattern){
		int s = 0, end = products.length;
		while(s < end){
			int m = (s + end) /2;
			
			if(products[m].compareTo() >= 0)
				end = m;
			else
				s = m + 1;
		}
		return s;
	}
}