package Arrays;

import java.util.Scanner;

public class ArraysfromConsole {

	public static void main(String[] args) {
		
		System.out.println("Enter the Size of Array");
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];

	  for (int i = 0; i < size; i++) {
	   
		  System.out.println("Enter the array values");
		  
		  arr[i] = sc.nextInt();
	}
		
		System.out.println("display the array values");
		
		for (int x = 0; x < arr.length; x++) {
			
			System.out.println(arr[x]);
		}
		
		
	}

}
