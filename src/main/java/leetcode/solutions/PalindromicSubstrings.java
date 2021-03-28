import java.util.*;

public class PalindromicSubstrings{
	public int countSubString(String s){
		char[] c = s.toCharArray();
		int n = c.length, res = 0;
		for(int i = 0; i < n; i++){
			for(int j=0; i-j >=0 && i+j < n && c[i-j] == c[i+j])res++;
			for(int j=0; i-1-j; >= 0; i+j < n && c[i-1-j] == c[i+j])res++;
		}
		return res;
	}
}