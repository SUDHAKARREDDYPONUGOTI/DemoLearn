package Arrays;

import com.java.basic1.LargeandSmallNumInArray;

public class FindSmallestLargestElementInArray {

	public static void main(String[] args) {
		
		int x[] = {32,1,44,545,99,12};
		
		int largestnum = Integer.MIN_VALUE;
		
		int Smallestnum = Integer.MAX_VALUE;
		
		for (int number : x) {
			
			if (number > largestnum) {
				
				largestnum = number;
			}
		}
		System.out.println("This is Large value : " + largestnum);
		
       for (int number : x) {
			
			if (number < Smallestnum) {
				
				Smallestnum = number;
			}
		}
		System.out.println("This is Large value : " + Smallestnum);
	   
		
	
	}
	
	

}
