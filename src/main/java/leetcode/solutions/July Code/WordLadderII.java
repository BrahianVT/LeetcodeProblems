
package leetcode.solutions;
import java.util.*;
/*
	Problem : 24
	Number leecode problem: 126
	https://leetcode.com/problems/word-ladder-ii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class WordLadderII{
	 public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        
		List<List<String>> res = new arrayList();
		
		Set<String> eles = new HashSet<>();
		for(String w: wordList)eles.add(w);
		
		if(!eles.constains(endWord)) return res;
		Map<String, List<String>> graph = new HashMap<>();
		Set<String> curLevel = new HashSet<>();
		
		curLevel.add(beginWord);
		boolean end = false;
		while(!curLevel.isEmpty() && !end){
			eles.removeAll(curLevel);
			Set<String> next = new HashSet();
			for(String s: curLevel){
				graph.put(s, new ArrayList());
				char[] cur = s.toCharArray();
				for(int i = 0; i < cur.length; i++){
					char c = cur[i];
					for(char a = 'a'; a <= 'z'; a++){
						if(a == c)continue;
						String aux = String.valueOf(cur);
						if(eles.contains(aux)){
							graph.get(s).add(aux);
							next.add(aux);
							if(aux.equals(endWord))end = true;
						}
					}
					cur[j] = c;
				}
			}
			curLevel = next;
		}
		
		if(!end) return res;
		List<String> list = new ArrayList();
		list.add(beginWord);
		addPath(beginWord, endWord, res, graph, list);
		
		return res;
    }
	
	
	
	
	private void addPath(String from, String to, List<List<String>> res, Map<String, List<String>> graph, List<String> list){
		if(from.equals(to)){
			res.add(new ArrayList(list)); return;
		}
		
		if(!graph.containsKey(to))return;
		
		for(String next: graph.get(from)){
			list.add(next);
			addPath(next, to, res, graph, list);
			list.remove(list.size() -1);
		}
	}
}