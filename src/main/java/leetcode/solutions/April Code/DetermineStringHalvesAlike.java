package leetcode.solutions;
import java.util.*;
/*
	7
	Number leecode problem:1704
	https://leetcode.com/problems/determine-if-string-halves-are-alike/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/
public class DetermineStringHalvesAlike{
	public boolean halvesAreAlike(String s) {
		char[]c = s.toCharArray();
		int a = 0, b = 0;
		int j = s.length/2;
		for(int i = 0; i < c.length/2; i++){
			char aux = Character.toLowerCase(c[i]);
			char aux2 = Character.toLowerCase(c[i + j]);
			if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u')a++;
			if(aux2 == 'a' || aux2 == 'e' || aux2 == 'i' || aux2 == 'o' || aux2 == 'u')b++;
		}
		
		return a == b;
	}
}