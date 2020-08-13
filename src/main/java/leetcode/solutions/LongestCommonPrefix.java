
package leetcode.solutions;
/**
 Number leecode problem: 14
https://leetcode.com/problems/longest-common-prefix/
    Time Complexity: O(n log n)
    Space Complexity: O(1)
*/

public LongestCommonPrefix{

    public String longestCommonPrefix(String[] strs) {
		
		if(strs == null || strs == null){  return ""; }
		
		int start = 0, end = strs[0].length();

		boolean longestComPre = true;
		while( start < end){
			
			int mid = (start + end) / 2;

			for(int i = 1 i < strs.length; i++){
				if(strs[i].indexOf(strs[0].substring(0, mid +1)) != 0){
					longestComPre = false; break;
				}
			}
			
			if(longestComPre){
				start = mid + 1;
			} else {  longestComPre = true;
				end = mid;
			}
		}
		
		return strs[0].substring(0, start);
	}
        	
}