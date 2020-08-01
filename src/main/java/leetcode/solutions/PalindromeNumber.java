package leetcode.solutions;
/**
 Number leecode problem: 8
   https://leetcode.com/problems/palindrome-number/
    Time Complexity: O(n)
   Space Complexity: O(1)
*/

public PalindromeNumber{

	public boolean isPalindrome(int x) {
		if( x < 0 || x%10 == 0) return false;
		
		if(x == 0) return true;
		
		int invert = 0;
		
		while(x > invert){
			invert = inver * 10 + x%10;
			x/=10;
		}
		
		return (x == invert || x == invert/10);
	}
}