package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1268
	https://leetcode.com/problems/search-suggestions-system/
    Time Complexity: O(nlogn)
    Space Complexity: O(nm)
*/

public class SearchSuggestionsSystem{
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		Arrays.sort(products);
		List<List<String>> res = new ArrayList();
		StringBuilder sub = new StringBuilder();
		for(int i = 0; i < searchWord.length; i++){
			sub.append(searchWord.charAt(i));
			int start = getIndex(products, sub.toString());
			List<String> aux = new ArrayList();
			if(start == products.length){for(; i < searchWord.length; i++) res.add(new ArrayList(aux)); continue; }
			for(; start < products.length && products[start].indexOf(sub.toString()) != -1 && aux.size() < 3; start++)
				aux.add(products[start]);
			
			res.add(aux);
		}
		return res;
	}
	
	private int getIndex(String[] products, String pat){
		int s = 0, end = products.length, lenPa = products.length;
		while(s < end){
			int m = (end + s)/2;
			int lenPr =  products[m].length;
			if(products[m].substring(0, lenPr > lenPa?lenPa:lenPr).compareTo(pat) >= 0)
				end = m;
			else
				s = m + 1;
		}
		return s;
	}
}
