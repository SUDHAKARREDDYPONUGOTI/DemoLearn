package ArraysFinalPractice;

public class SumArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x [] = {1,12,6,11,10,12,2,6};
		
		int index = 12;
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i+1; j < x.length; j++) {
				
				if (x[i] + x[j]  == index ) {
					
					System.out.println(x[i] + ", " + x[j]);
					
				}
				
			}

		}

	}

}
