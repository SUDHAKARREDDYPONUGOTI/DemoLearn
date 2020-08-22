package Arrays;

public class Stock_BuyAndSell_Prduct {

	public static void main(String[] args) {
		
		int x[] = {10,3,44,66,1,999,1};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < x.length; i++) {
			
			if (x[i] < min) {
				
				min = x[i];
			}
			
			if (x[i] - min>max) {
				
				max = x[i] - min;
			}
		}
		System.out.println(max);
	}

}
