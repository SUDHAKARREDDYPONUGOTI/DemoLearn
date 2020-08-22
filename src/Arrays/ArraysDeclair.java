package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArraysDeclair {

	public static void main(String[] args) {
		
		int x[] = new int[10];
		
		x[2] = 99;
		System.out.println(x[2]);
		
		int y[]= {12,22,33,55,23};
		System.out.println(y[2]);
		
		String str[] = {"Green","Red","blue","Black"};
		
		System.out.println(str[1]);
		
		System.out.println(Arrays.asList(str));
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.deepToString(str));
		
		List<String> ls = new ArrayList<>();
		Collections.addAll(ls, str);
		System.out.println("my list values " + ls);
		
		
		for (String values : ls) {
			System.out.println(values);
			
		}
		
		Arrays.asList(str).stream().forEach(s->System.out.println(" ******  " +s));
		
		Arrays.stream(str).forEach(System.out::println);
		

	}

}
