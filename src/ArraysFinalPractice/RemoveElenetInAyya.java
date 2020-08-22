package ArraysFinalPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElenetInAyya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int RM[] = {123,21,1,2,1,2,4,2};
		
		List<int[]> ls = Arrays.asList(RM);
		
		ls.remove(123);
		
		System.out.println(RM);

	}

}
