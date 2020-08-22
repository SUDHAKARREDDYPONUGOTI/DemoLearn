package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class First_NonRepeatedCharInString {

	public static void main(String[] args) {
			
		
		char c = NonRepeatedChar("aabbcdef");
		
		System.out.println("Non repeated char is : " + c);

	}

	private static char NonRepeatedChar(String str) {
			
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) {
			
			map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
			
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			
			if (entry.getValue() == 1) {
				
				return entry.getKey();	
			}
		}
		
		throw new RuntimeException("did not find any repeated char");			
		
	}

}
