package Arrays;

import java.util.Arrays;

public class SearchElement_binarySearchMethoduser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f[] = {21,32,4,56,78,99};
		
		Arrays.sort(f);
		
		for (int i : f) {
			
			System.out.print(" " + i);

		}
		
		
		System.out.print( " " + "------" + Arrays.binarySearch(f, 4));
		
	}

}
