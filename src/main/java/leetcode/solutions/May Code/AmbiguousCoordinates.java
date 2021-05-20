
package leetcode.solutions;
import java.util.*;
/*
	13
	Number leecode problem: 816
https://leetcode.com/problems/ambiguous-coordinates/
	Time Complexity: O(nm)
	Space Complexity: O(nm)
*/    
public class AmbiguousCoordinates{
	public List<String> ambiguousCoordinates(String s){
		
		List<String> res = new ArrayList();
		for(int i = 1; i < s.length() - 2; i++){
			List<String> a = getSub(s.substring(1, i + 1));
			List<String> b = getSub(s.substring(i+1, s.length() -1));
			for(String c: a){
				for(String d : b){
					res.add('(' + c + ", " + d + ')');
				}
			}
		}
		
		return res;
	}
	
	
	private List<String> getSub(){
		List<String> aux = new ArrayList();
		if(sub.length() == 0 || (sub.length() > 1 && sub.charAt(0) == '0' && sub.charAt(sub.length() - 1) == '0'))return aux;
		
		if(sub.length() > 1 && sub.startsWith("0")){ aux.add("0." + sub.substring(1)); return aux; }
		
		aux.add(sub);
		
		if(sub.length() == 1 || sub.charAt(sub.length() - 1) == '0'){ return aux; }
		
		for(int i = 1; i < sub.length(); i++){
			aux.add(sub.substring(0,i) + '.' + sub.substring(i));
		}
		return aux;
	}
}