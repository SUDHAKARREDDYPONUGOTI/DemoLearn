package Arrays;

public class CopyArraysFromOneArrayToAnother {

	public static void main(String[] args) {
		
		int oldx[] = {23,4,2,1,112,32};
		
		int newx[] = new int [oldx.length];
		
		for (int i = 0; i < oldx.length; i++) {
			
			newx[i] = oldx[i];
			
		}
		for (int i = 0; i < newx.length; i++) {
			
			System.out.println(newx[i]);
		}

	}

}
