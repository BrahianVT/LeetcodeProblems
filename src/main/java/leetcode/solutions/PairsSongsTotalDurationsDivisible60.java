
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1010
	https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class PairsSongsTotalDurationsDivisible60{
	public int numPairsDivisibleBy60(int[] time){
		int[] map = new int[60];
		for(int t : time){
			res+= map[(600 - t)%60];
			map[t%60]++;
		}
		return res;
	}
}