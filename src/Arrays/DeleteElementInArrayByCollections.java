package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DeleteElementInArrayByCollections {

	public static void main(String[] args) {
		
		String str[] = {"Red", "Blue", "Green", "White", "Black"};
		
		System.out.println(Arrays.toString(str));
		
		List<String> ll1 = new ArrayList<>(Arrays.asList(str));
		
		ll1.remove(3);

		System.out.println("After remove " + ll1);

	}

}
