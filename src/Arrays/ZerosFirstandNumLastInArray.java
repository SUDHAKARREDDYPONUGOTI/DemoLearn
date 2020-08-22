package Arrays;

public class ZerosFirstandNumLastInArray {

public static void main(String[] args) {
		
		int x[] = {12,0,32,0,22,0,11,12,0};
		
		int tempx[] = new int [x.length];
		
		rearrange(x,tempx);
		print(tempx);

	}

	private static void print(int[] tempx) {
		for (int i : tempx) {
			
			System.out.print(i);
			System.out.print(" ");
			
		}
		
	}

	private static void rearrange(int[] x, int[] tempx) {
		
		int j = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			if (x[i] != 0) {
				
				tempx[j] = x[i];
				
				j++;
				
			}
			
		}
		
       for (int i = 0; i < x.length; i++) {
			
			if (x[i] == 0) {
				
				tempx[j] = x[i];
				
				j++;
				
			}
			
		}
		
	}

}
