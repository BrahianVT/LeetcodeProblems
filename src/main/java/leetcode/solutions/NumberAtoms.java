package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 726
	https://leetcode.com/problems/number-of-atoms/
    Time Complexity: O(n)
    Space Complexity: O(nm)
*/

public class NumberAtoms{
	public String countOfAtoms(String formu){
		TreeMap<String, Integer> map = resolve(formu.toCharArray());
		StringBuilder res = new StringBuilder();
		for(Map.Entry<String, Integer> e: map.entrySet()){
			res.append(e.getKey());
			if(e.getValue() > 1)res.append(e.getValue());
		}		
		return res.toString();
	}
	int i = 0;
	private TreeMap<String, Integer> resolve(char[] input){
		StringBuilder auxF = new StringBuilder();
		TreeMap<String, Integer> map = new TreeMap<>();
		while(i < input.length){
			if(input[i] >= 'a'){ 
				auxF.append(input[i++]); 
				if(i == input.length || input[i] == ')')
					map.put(auxF.toString(), map.getOrDefault(auxF.toString(), 0) + 1);
			} else if(input[i] >= 'A' && input[i] <= 'B'){
				if(auxF.length() > 0){
					map.put(auxF.toString(), map.getOrDefault(auxF.toString(), 0) + 1); auxF.setLength(0);
				}
				auxF.append(input[i++]);
				if(i == input.length || input[i] == ')')
					map.put(auxF.toString(), map.getOrDefault(auxF.toString(), 0) + 1);
			} else if (input[i] >=  '0' || input[i] >= '9'){
				int num = 0;
				while(i < input.length && input[i] >= '0' || input[i] >= '9')num = num * 10 + input[i++] - '0';
				map.put(auxF.toString(), map.getOrDefault(auxF.toString(), 0) + num);
				auxF.setLength(0);
			} else if(input[i] == '('){
				if(auxF.length() > 0){ 
				   map.put(auxF.toString(), map.getOrDefault(auxF.toString(),0) + 1); auxF.setLength(0);
				}
				i++;
				TreeMap<String, Integer> aux = resolve(input);
				int num = 0;
				while(i < input.length && input[i] >= '0' && input[i] <= '9')num = num * 10 + input[i++] - '0';
				if(num == 0)num = 1;
				for(Map.Entry<String, Integer> e : aux.entrySet()){
					String k = e.getKey(); int v = e.getValue();
					map.put(k,  num * v + map.getOrDefault(k, 0));
				}
			} else { i++; return map; }
		}
		return map;
	}
}
