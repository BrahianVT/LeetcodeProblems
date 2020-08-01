

package leetcode.solutions;
/**
 Number leecode problem: 12
	https://leetcode.com/problems/integer-to-roman/
    Time Complexity: O(numbers.length() * romanNumber.length())
    Space Complexity: O(1)
*/

public class IntegerToRoman{
		
		   int[] numbers = {1000, 900, 500,400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	String[] romanNumber = {"M","CM","D","CD","C","XC","L","LX","X","IX","V","IV","I"};

	
	public String intToRoman(int num) {
		if(num <= 0) return "";
		
		int index = getIndex(num);
		
		
		return romanNumber[index] + intToRoman( num - numbers[index]);
	}
	
	
	public int getIndex(int num){

		for(int i = 0; i < numbers.length(); i++){
			if(num / numbers[i] != 0){
				return i;
			}
		}
		
		return -1;
	}
	 
}