package Strings;

import java.util.Scanner;

public class NumOfOccuranceInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string ");
		
		String str = sc.nextLine();
		
		int flenght = str.length();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter char ");
		String str1 = sc1.next();
		
		str = str.replace(str1, "");
		
		int fflen = str.length();
		
		System.out.println("no of occurance is " +str1+ " " +(flenght - fflen));

	}

}
