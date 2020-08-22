package Strings;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String s = "hi baga vg jsbsu bdjj sbdjbsdb";
		
		int count = WordCount(s);
		System.out.println("no of words in string is " +count);

	}

	private static int WordCount(String s) {
		
		int count = 0;
		
		if (s.charAt(0) != ' ') {
			
			count++;	
		}
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				
				count++;
			}
				
		}
		return count;

	}

}
