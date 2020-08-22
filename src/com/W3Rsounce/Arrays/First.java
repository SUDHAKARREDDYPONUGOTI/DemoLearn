package com.W3Rsounce.Arrays;

import java.util.Arrays;

import com.java.basic1.convertArraysToArrayList;



public class First {

	public static void main(String[] args) {
		
		// 1. Write a Java program to sort a numeric array and a string array. Go to the editor
		
		int s[] = {3,21,535,4,543,887,996,123,1,124,345,456};
		
		Arrays.sort(s);
		
		System.out.println("After Sort order : " +Arrays.toString(s));

	}

}

// ---------------------------------------------------------------------------------------- 

class SumvaluesOfArray{
	
	public static void main(String[] args) {
		
		int sm[] = {3,21,535,4,543,887,996,123,1,124,345,456};
		
		int sum = 0;
		
		for (int i = 0; i < sm.length; i++) {
			
			 sum = sum + sm[i];		
		}
		
//		for (int i : sm) {
//			
//			sum += i;
//			
//		}
		
		System.out.println("Sum values of Arrays " + sum);
	}
}

// ------------------------------------------------------------------------------------------------

class printgrid{
	
	public static void main(String[] args) {
		
		String str = "--------------------";
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str);	
		}	
	}	
}

//---------------------------------------------------------------------------------------------------

class grid{
	
	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				System.out.printf("%2d " , a[i][j]);
			}
			
			System.out.println();	
		}
	}
}

// --------------------------------------------------------------------------------------------------

class Contansvalue{
	 public static void main(String[] args) {
		int xx[] = {32,43,54,12,34,667,87,44,657,89,23,9};
		
		System.out.println(contains(xx,34));
		
	}

	private static boolean contains(int[] xx, int i) {
		
		for (int i1 : xx) {
			
			if (i1 == i) {
				
				return true;
			}
			
		}
		return false;
	}

}

