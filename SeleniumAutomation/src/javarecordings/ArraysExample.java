package javarecordings;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		/*
		 * Declaring the Array
		 * 1. Creating Array
		 * 2. Define Array
		 * 3. Assign Array
		 */
		
		// 1. Creating Array
		// dataType arrname[];
		int arrNum[];
		
		// 2. Define Arrays
		// arrayName = new  datatype[size]
		arrNum = new int[4];
		
		// 3. Assign the values
		arrNum[0] = 100;
		arrNum[1] = 200;
		arrNum[2] = 300;
		arrNum[3] = 400;

		// Displaying the array element as per the index - Also try value out of range 
		System.out.println(arrNum[3]); 
			
		 // Alternative way of declaring the array	
		 int [] arrNum2 = {10,20,30};
		 //System.out.println(arrNum2[2]);
		 System.out.println(arrNum2[1]);
		 
		// Print all the array values (i - iteration; Arr - Array)
		 String iArr = Arrays.toString(arrNum);
		 System.out.println(iArr);
		
		// Arrays with String 
		 String[] arrName = {"Vinoth","Anand","Pranav"};
		 System.out.println(arrName[1]);
		 
		// Print all the array values
		 String iArrN = Arrays.toString(arrName);
		 System.out.println(iArrN);
		
		 // To find the string is present in arrays
		 boolean word = Arrays.asList(arrName).contains("Anand");
		 System.out.println(word);
		 
	}

}
