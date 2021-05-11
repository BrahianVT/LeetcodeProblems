package leetcode.solutions;
import java.util.*;
/*
	27
	Number leecode problem: 326
https://leetcode.com/problems/power-of-three/
    Time Complexity: O(1) 
    Space Complexity: O(1)
*/

public class PowerThree{
	public boolean isPowerOfThree(int n){
		return n > 0 && (1162261467 % n == 0);
	}
}