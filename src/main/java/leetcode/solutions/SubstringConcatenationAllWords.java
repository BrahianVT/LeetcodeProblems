

package leetcode.solutions;
/**
 Number leecode problem: 30
	https://leetcode.com/problems/substring-with-concatenation-of-all-words/
    Time Complexity: O(sizeWord * s.length() - sizeWord)
    Space Complexity: O(sizeWord * s.length())
*/

public class SubstringConcatenationAllWords{
	
	
	    public List<Integer> findSubstring(String s, String[] words) {
			
			List<Integer> res = new ArrayList();
			
			if(s == null || words.length == 0){ return res; }
			
			Map<String, Integer> wordFreq = new HashMap<String,Integer>();
			
			for(String word: words){
				wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
			}
			
			String[] arrayString = new String[s.length()];
			int sizeWord = words[0].length();
			
			for(int i = 0; i < sizeWord; i++){
				
				int size = 0; int start = i; 
				
				Map<String, Integer> cur = new HaspMap();
				for(int j = i; j <= s.length() - sizeWord; j+=sizeWord){
					arrayString[j] = s.substring(j, j+sizeWord);
					start = start == -1?j:start;
					
					if(wordFreq.containsKey(arrayString[i])){
						cur.put(arrayString[i], cur.getOrDefault(arrayString[i],0)+1);
						size++; 
						if(size == word.length){
							if(wordFreq.equals(cur)){ res.add(start); }
								
							cur.put(arrayString[start], cur.get(arrayString[start], 0)- 1);
							size--; start+=sizeWord;
						}
					}else {
						start = -1; cur.clear(); size = 0;
					}
				}
			}
		}
}