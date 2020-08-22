package Arrays;

import java.util.HashMap;
import java.util.Map;



public class MajorityElementsInArray {

	public static void main(String[] args) {
		
		// majorty = array.length /2 and element count is greater 
		
		int x[] = {12,22,12,32,12,22,12};  
		
		// total 7 elements 7/2 = 3.5, 12 element = 4 times undi 
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < x.length; i++) {
			
			map.put(x[i], map.getOrDefault(x[i], 0)+1);
			
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		
			if (entry.getValue() > x.length/2) {
				
				int result1 = entry.getKey();
				
				System.out.println(result1);			
			}
	
		}
			
		
	}

}


