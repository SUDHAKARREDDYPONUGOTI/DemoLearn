package Arrays;

import java.util.Scanner;

public class ArrayTakeFromConsole {

	public static void main(String[] args) {
		
		System.out.println("Enter values from console");
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
	
		for(int i=0; i<size; i++) {
			
			System.out.println("enter the values ");
			
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		
		
	
			 
	}

}
