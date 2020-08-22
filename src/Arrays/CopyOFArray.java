package Arrays;

import java.util.Arrays;

public class CopyOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oldx[] = {12,23,3,23,32};
		
		int newx [] = Arrays.copyOf(oldx , oldx.length);
		
		for (int i = 0; i < newx.length; i++) {
			
			System.out.println(newx[i]);
			
		}

	}

}
