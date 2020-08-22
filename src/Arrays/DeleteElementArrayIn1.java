package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteElementArrayIn1 {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,6,7,12,44,55};
		
		System.out.println("Original Array " + Arrays.toString(array));
		
		int index = 4;
		
		int newarray[] = IntStream.range(0, array.length).filter(i->i!=index).map(i->array[i]).toArray();
		
		System.out.println("New Array is " +Arrays.toString(newarray));

	}

}
