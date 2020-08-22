package com.java.basic1;

import java.util.Scanner;

import javax.swing.text.Position.Bias;

public class AddBinaryNumbers {

	
	
	public static void main(String[] args) {
		long binary1, binary2;
		
		int reminder = 0;
		int i = 0;
		
		int sum[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary1 value is : ");
		binary1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter binary2 value is :");
		binary2 = sc1.nextInt();
		
		
	
	while (binary1 != 0 || binary2 !=  0) {
		
		sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + reminder) % 2);
		
		reminder = (int) ((binary1 % 10 + binary2 % 10 + reminder)/ 2);
		
		binary1 = binary1 / 10;
		binary2 = binary2 / 10;
	}
	
	if(reminder != 0) {
		sum[i++] = reminder;
		
	}
	--i;
	  System.out.print("Sum of two binary numbers: ");
	
	
	while (i >= 0) {
		System.out.print(sum[i--]);
		
	}
	System.out.print("\n");
}
}