package com.java.basic1;

public class LargeandSmallNumInArray {

	public static void main(String[] args) {
		
		int arr[] =new int[] {1,12,111,333,999,33,43,0};

		
		int Largenumber = arr[0];
		int Smallnumber = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			
			  if(arr[i] > Largenumber)
                  Largenumber = arr[i];
          else if (arr[i] < Smallnumber)
        	  Smallnumber = arr[i];
	
			}
			
			System.out.println(Largenumber);
			System.out.println(Smallnumber);

		}



}
