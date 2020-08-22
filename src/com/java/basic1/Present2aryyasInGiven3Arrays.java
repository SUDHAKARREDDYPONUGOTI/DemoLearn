package com.java.basic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Present2aryyasInGiven3Arrays {

	public static void main(String[] args) {
		Integer ar1[] = {1,5,12,33,7,4,5};
		Integer ar2[] = {1,5,12,8,10,9,4};
		Integer ar3[] = {12,7,12,8,10,5,19};
		
		HashSet<Integer> h = new HashSet<>();
		List<Integer> ls1 = Arrays.asList(ar1);
		List<Integer> ls2 = Arrays.asList(ar2);
		List<Integer> ls3 = Arrays.asList(ar3);
		h.addAll(ls1);
		h.addAll(ls2);
		h.addAll(ls3);
		
		List<Integer> finallist = new ArrayList<Integer>();
		
		for (Integer number : h) {
			
			if((ls1.contains(number) && ls2.contains(number)) || (ls2.contains(number) && ls3.contains(number))
					
					|| (ls1.contains(number) && ls3.contains(number))) {
				
				finallist.add(number);
			}
		}
		
		System.out.println(finallist);
	}

}
