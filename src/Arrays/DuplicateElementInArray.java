package Arrays;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		String arr[] = {"hello","hell3","hell2","hello","hell1"};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
			
		}

	}

}
