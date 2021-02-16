package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1629
	https://leetcode.com/problems/slowest-key/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class SlowestKey{
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		int aux = 0, res = 0;
		char out = '_';
		char[] keys = keysPressed.toCharArray();
		for(int i = 0; i < keys.length; i++){
			int time = releaseTimes[i]- aux;
			aux = releaseTimes;
			if(time > aux){
				res = time; out = keys[i];
			}
			else if(time == aux && keys[i] > out)out = keys[i];
		}
		
		return out;
	}
	
}
