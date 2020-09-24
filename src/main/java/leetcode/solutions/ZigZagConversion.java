package leetcode.solutions;


/**
 Number leecode problem: 6
   https://leetcode.com/problems/zigzag-conversion/
    Time Complexity: O(n)
   Space Complexity: O(n)
*/
public class ZigZagConversion{
	
	public String convert(String s, int rows){
		char[] c = s.toCharArray();
		
		int  len = c.length;
		StringBuilder[] sb = new StringBuilder[rows];
		
		for(int i = 0; i< rows; i++){ sb[i] = new StringBuilder[i]; }

		int j = 0;
		
		
		// iterate over the char array
		while(j < len){
			
			// find the vertical elements
			for(int i = 0; i< rows && j< len; i++){
				sb[i].append(c[j++]);
			}
			
			// find the zigzag elements
			for(int i = rows -2; i >= 1 && j<len; i--){
				sb[i].append(c[j++]);
			}
		}
		
		// join all the elements
		for(int t = 1; t < rows; t++){
			sb[0].append(sb[t]);
		}
		
		return sb[0].toString();
	}
	
}
