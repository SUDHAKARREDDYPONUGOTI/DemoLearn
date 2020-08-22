package com.java.basic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class convertArraysToArrayList {

	public static void main(String[] args) {
		
		// array to Array.asList
		//  add method
		// Collection.addall 
		
		
		String [] color = {"Red", "Black", "white", "Green"};
		
		System.out.println("value is " + Arrays.toString(color));
		
		System.out.println("the valye of arrays is " + Arrays.asList(color));
		
		Arrays.stream(color).forEach(System.out::println);
		
		Arrays.asList(color).forEach(s-> System.out.println("This is values" + s));
		
	//	System.out.println(color);
		
		//List<String> list = Arrays.asList(color);
		
	  //System.out.println(list);
		
		List<String> l = new ArrayList<>();
		//Collections.addAll(l, color);
		//System.out.println(l);
		
//		for (String string : color) {
//			
//			l.add(string);
//			
//		}
//		System.out.println(l);
	}

}
