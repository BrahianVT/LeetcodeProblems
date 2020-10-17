/**
 Number leecode problem: 67
	https://leetcode.com/problems/add-binary/
    Time Complexity: O(a + b)
    Space Complexity: O(a + b)
*/

public class AddBinary{
	
	public String addBinary(String a, String b){
		
		StringBuilder res = new StringNuilder();
		int i = a.length() - 1, j = b.length() -1, sum = 0;
		
		while(i >= 0 || j >= 0){
			if(i >= 0)sum+= a.charAt(i--) - '0';
			if(j >= 0)sum+= b.charAt(j--) - '0';
			res.insert(0, String.valueOf(sum%2));
			sum/=2;
		}
		
		if(sum > 0)res.insert(0, "1");
		
		return res.toString();
	}
}