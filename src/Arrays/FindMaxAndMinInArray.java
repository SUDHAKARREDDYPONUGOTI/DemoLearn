package Arrays;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		
		int x[] = {10,23,43,33,145,6,4};
		
		int Max,Min,n;
		 Max = x[0];
		 Min = x[0];
		
		for (int i = 0; i < x.length; i++) {
			
			if (x[i] > Max) {
				
				Max = x[i];
			}

		}
		
          for (int i = 0; i < x.length; i++) {
			
			if (x[i] < Min) {
				
				Min = x[i];
			}

		}
          
          System.out.println("Minimum Value is : " +Min);
          System.out.println("Maximum value is : " +Max);


	}

}
