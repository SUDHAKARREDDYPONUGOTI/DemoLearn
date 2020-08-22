package ArraysFinalPractice;

import java.util.Scanner;

public class TakeInputsFromConsole {
	
	public static void main(String[] args) {
		
	

	System.out.println("Enter the size from console ");
	
	Scanner sc = new Scanner(System.in);
	
	int size  = sc.nextInt();
	
	int arr[] = new int [size];
	
	for (int i = 0; i < size; i++) {
		
		System.out.println("Enter the arrays values ");
		
		arr[i] = sc.nextInt();
		
	}
	
	sc.close();
	
	System.out.println("Array Values are ...");
	for (int i = 0; i < arr.length; i++) {
		  
		    System.out.println(arr[i]);
	}
	
	}
}
