package ArraysFinalPractice;

import java.util.Scanner;

public class MissingNumberInInteger {

	public static void main(String[] args) {

		int arr1[] = {1,2,3,5,6};
		int sum = 0, sum1 = 0 ;


		for (int i = 0; i < arr1.length; i++) {
			
			 sum = sum + arr1[i];
		}
		
		for (int i = 1; i <= 6; i++) {
			
			 sum1 = sum1 + i;
		}
		
		System.out.println("The final value is .. " + (sum1-sum));
		
	}
	
}


