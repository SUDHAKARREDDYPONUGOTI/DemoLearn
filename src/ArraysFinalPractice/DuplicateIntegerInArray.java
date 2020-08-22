package ArraysFinalPractice;

public class DuplicateIntegerInArray {

	public static void main(String[] args) {
		// Duplicate Integer in Arrays
		
		int x[] = {11,2,32,44,55,11,12,32};
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i+1; j < x.length; j++) {
				
				if (x[i] == x[j]) {
					
					System.out.println("Duplicate values are .. " + x[i]);					
				}

			}
				
		}	
		
	}

}
