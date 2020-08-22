package Arrays;

import java.util.Arrays;

public class DeleteEelementInArrayFirstMethod {

	public static void main(String[] args) {
		
		int Firstarr1[] = {1,32,33,45,67,46,12};
		
		int Secondarr[] = new int[Firstarr1.length-1];
		
		int index = 2;
		
		for (int i = 0, k = 0 ; i < Firstarr1.length; i++) {
			
			if (i == index) {
				continue;
			}
			
			Secondarr[k++] = Firstarr1[i];
		}
		System.out.println("Second array value is : " + Arrays.toString(Secondarr));
		

	}

}
