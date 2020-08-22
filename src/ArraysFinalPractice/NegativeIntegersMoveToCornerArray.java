package ArraysFinalPractice;

public class NegativeIntegersMoveToCornerArray {

	public static void main(String[] args) {
		// {1,4,6,8,-1,-4,-3}
		
		int arr[] = {-1,12,32,-8,-9,33,54};
		
		int [] temparr = new int[arr.length];
		
		
		Rearrangearray(arr , temparr);
		
		print(temparr);

	}

	private static void print(int[] temparr) {
		// TODO Auto-generated method stub
		
		for (int i : temparr) {
			
			System.out.print(i);
			
			System.out.print(" ");
			
		}
		
	}

	private static void Rearrangearray(int[] arr, int[] temparr) {
		
		int j = 0;
		
		for (int i = 0; i < temparr.length; i++) {
			
			if (arr[i] > 0) {
				
				temparr[j] = arr[i];
				j++;
			}		
		}
		
		for (int i = 0; i < temparr.length; i++) {
			
			if (arr[i] < 0) {
				
				temparr[j] = arr[i];
				
				j++;
				
			}
			
		}
		
		System.out.println();
		
	}

	}



