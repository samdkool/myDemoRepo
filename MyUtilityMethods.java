package rnd.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyUtilityMethods {
	public static void findDucplicateChars(String inputString) {
		
		char[] chacters = inputString.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : chacters) {
			if (map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else
				map.put(ch,1);
		}
		
		Set<Character> set = map.keySet();
		
		for(Character c : set) {
			if (map.get(c)>1)
			{
				System.out.println(c+" :: " +map.get(c));
			}
		}
	}
	
	public static void countDuplicateWords(String inputString) {
		String[] words = inputString.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for (String word : words) {
			if(map.containsKey(word.toLowerCase())) {
				map.put(word.toLowerCase(), map.get(word.toLowerCase())+1);
			}
			else
			{
				map.put(word.toLowerCase(), 1);
			}
		}
		
		Set<String> s = map.keySet();
		for (String word : s) {
			if(map.get(word)>1) {
				System.out.println(word+"::"+map.get(word));
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		findDucplicateChars("Hi Dear there");
		countDuplicateWords("Hello hello Its Indian Police Service Plz call 100 to get police assistance");
	}
	
}
