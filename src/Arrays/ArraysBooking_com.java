package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysBooking_com {

	public static void main(String[] args) {
		
		Integer arr1[] = {1,4,7,6,8,9};
		Integer arr2[] = {12,4,17,6,2,9};
		Integer arr3[] = {11,14,7,61,2,9};
		
//		Arrays.stream(arr1).forEach(System.out::print);
//		Arrays.stream(arr2).forEach(System.out::print);
//		Arrays.stream(arr3).forEach(System.out::print);
		
		// need to print the value at least 2 arrays
		
		HashSet<Integer> h = new HashSet<>();
		
		List<Integer> ls1 = Arrays.asList(arr1);
		List<Integer> ls2 = Arrays.asList(arr2);
		List<Integer> ls3 = Arrays.asList(arr3);
		
		
		
		h.addAll(ls1);
		h.addAll(ls2);
		h.addAll(ls3);
		
		System.out.println(h);
		
		List<Integer> finallist = new ArrayList<>();
		
		for (Integer num : h) {
			
			if (ls1.contains(num) && ls2.contains(num) || 
					ls3.contains(num) && ls2.contains(num) ||
							ls1.contains(num) && ls3.contains(num)) {
				finallist.add(num);		
			}
		
		}
		
		System.out.println(finallist);	

	}

}
