package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 405
	https://leetcode.com/problems/convert-a-number-to-hexadecimal/
    Time Complexity: O(n/2^4)
    Space Complexity: O(1)
*/

public class ConvertNumberHexadecimal{
	/**
		To convert binary to Hex, each digit of a hexadecimal number "maps" to four bits of a binary value
		1 Split nunber in groups of four, starting in the mostright side (n &15)
		2 Check the map to match the hexvalue
		3 concatenaing at start and remove the 4 mostright digits and repeat.
	*/
	public String toHex(int num){
		if(num == 0)return "0";
		char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		StringBuilder res = new StringBuilder();
		while(num != 0){
			res.insert(0, map[num&15]);
			num >>>= 4;
		}
		
		
		return res.toString();
	}
}