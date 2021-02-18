package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1451
	https://leetcode.com/problems/rearrange-words-in-a-sentence/
    Time Complexity: O(n log n)
    Space Complexity: O(n)
*/

public class RearrangeWordsSentence{	
	public String arrageWords(String text){
		String[] arr = text.split(" ");
		arr[0] = Character.toLowerCase(arr[0].charAt(0)) + arr[0].substring(1, arr[0].length());
		Arrays.sort(arr, (p1, p2) -> p1.length() - p2.length());
		arr[0] = Character.toUpperCase(arr[0].charAt(0)) + arr[0].substring(1, arr[0].length());
		String res = String.join(" ", arr);
		return res;
	}
}