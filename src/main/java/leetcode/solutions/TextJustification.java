
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 68
	https://leetcode.com/problems/text-justification/
   
*/
public class TextJustification{
	
	public List<String> fullJustify(String[] words, int maxWidth){
		List<String> res = new ArrayList();
		int n = words.length, index = 0;
		
		while(index < n){
			int totalChar = words[index].length;
			int last = index + 1;
			while(last < n){
				if(totalChar + words[last] + 1 > maxWidth)break;
				totalChar+=words[last].length() + 1;
				last++;
			}
			int gaps = last - index - 1;
			StringBuilder aux = new StringBuilder();
			
			if(gaps == 0 || last == n){
				for(int i = index; i < last; i++){
					aux.append(words[i]);
					aux.append(" ");
				}
				aux.deleteCharAt(aux.length() - 1);
				while(aux.size() < maxWidth){ aux.append(" "); }
			} else {
				int spaces = (maxWidth - totalChar) / gaps;
				int remaining = (maxWidth - totalChar) % gaps;
				
				for(int i = index; i < last - 1; i++){
					aux.append(words[i]);
					aux.append(" ");
					
					for(int j = 0; j < spaces + (i - index < remaining?1:0); j++)
						aux.append(" ");
				}
				aux.append(words[last -1]);
			}
			index = last
			res.add(aux.toString());
		}
		return res;
	}
}