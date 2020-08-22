package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("Hello");
		list.add('c');
		list.add(12.10);

		System.out.println("Before reverse : " +list);
		
		Collections.reverse(list);
		
		System.out.println("After reverse : " +list);
		

	}

}
