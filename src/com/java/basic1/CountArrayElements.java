package com.java.basic1;



public class CountArrayElements {

	public static void main(String[] args) {
		
		
		String str = "Helo sudha kar Reddy @ . f q r 1 3 5 Closing b a by ma n";
		
		Count(str);
	}

	private static void Count(String str) {
		
		char [] ch = str.toCharArray();
		int Letters = 0;
		int numbers = 0;
		int others = 0;
		int space = 0;
	
		for(int i = 0; i < str.length(); i++) {
			
			if(Character.isLetter(ch[i])) {
				Letters++ ;
			}
				else if (Character.isSpace(ch[i])) {
					space++ ;
					
				} else if (Character.isDigit(ch[i])) {
					
					numbers++ ;
				} else {
					others ++ ;
				}
				
				
				
			}
			
			System.out.println("The main string is " + str);
			System.out.println(" value is " + Letters);
			System.out.println(" value is " + space);
			System.out.println(" value is " + numbers);
			System.out.println(" value is " + others);
		
		
	}

}
