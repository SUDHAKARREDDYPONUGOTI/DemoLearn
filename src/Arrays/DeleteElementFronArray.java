package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class DeleteElementFronArray {

	public static void main(String[] args) {
			
		int x[]= {12,21,22,43,5,67,43};
		
		int Element = 5;  //  Removed element '5'
		
		for (int i = 0; i < x.length; i++) {
			
			if (x[i] == Element) {
				
				continue;
			}
			
			System.out.println(x[i]);
		}
	}
}

class SecondMethod{
	
	public static void main(String[] args) {
		
		int y[] = {33,43,5,6,7,8,90,12,224};
		
		System.out.println("Original Array + " + Arrays.toString(y));
		
		int index = 4;
		
		int[] yy = IntStream.range(0, y.length).filter(s->s!=index).map(s->y[s]).toArray();
		
		System.out.println("Updated Array is : " + Arrays.toString(yy));

	}
	
}
