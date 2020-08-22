package Arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of array : ");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter the values of array : ");
			
			arr[i] = sc.nextInt();
			
		}
		
		for (int i : arr) {
			sum = sum + i;
			
		}
		System.out.println("Sum value is : " + sum);
		
	}

}
