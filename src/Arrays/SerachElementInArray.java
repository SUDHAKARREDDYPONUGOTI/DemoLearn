package Arrays;

public class SerachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {21,34,554,67,34,12,33,445};
		
		int index = 34;
		
		for (int i = 0; i < x.length; i++) {
			
			if (x[i] == index) {
				
				System.out.println(i);
				
			}
			
		}
		

	}

}
