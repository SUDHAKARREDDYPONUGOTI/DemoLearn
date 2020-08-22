package Arrays;

import java.util.Arrays;

public class FindSecondLargestEelementInArray {

	public static void main(String[] args) {
		
		int arr[] = {12,323,54,56,77,78,123,44};
		
		Arrays.sort(arr);
		
		System.out.println("Second largest Eelemet is : " + arr[arr.length-2]);
		
		System.out.println("Second largest Eelemet is : " + arr[arr.length-1]);

	}

}
