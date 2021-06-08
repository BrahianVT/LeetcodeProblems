package leetcode.solutions;
import java.util.*;
/*
	18
	Number leecode problem: 609
	https://leetcode.com/problems/find-duplicate-file-in-system/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/   

public class FindDuplicateFileSystem{
	
 public List<List<String>> findDuplicate(String[] paths) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String p : paths){
            String[] w = p.split(" ");
            for(int i = 1; i < w.length; i++){
                int j = w.indexOf("(");
                String aux = w.substring(j+1, w[i].length - 1);
                
                map.computeIfAbsent(aux, v -> new ArrayList()).add(w[0] + "/" + w[i].substring(j));
            }
        }
        
        List<List<String>> res = new ArrayList();
        
        for(Map.Entry<String, List<String>> e : map.entrySet())
            res.add(e.getValue());
        
        return res;
    }
}
