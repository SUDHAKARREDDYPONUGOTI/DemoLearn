package Strings;

public class ReverseStringByUsingRecusion {

	public static void main(String[] args) {
			
		String str = "PONUGOTI";
		
		System.out.println(RecursionString(str));
	
	}
	
	public static String RecursionString(String str) {
		
		if (str == null ||+ str.length() <= 1) {
			
			return str;
			
		}
		
		return RecursionString(str.substring(1)) + str.charAt(0);
		
		
	}

}
