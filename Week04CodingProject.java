package week04;

import java.util.Arrays;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 * a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		 * (i.e. do not use ages[7] in your code). Print the result to the console.  
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		 * i. Make sure that there are 9 elements of type int in this new array.  
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 
		 * from the last element of ages2). 
		 * iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		 * c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("1 -\na. " + result);
		
		int[] ages2 = {4, 5, 7, 54, 57, 23, 23, 67, 32};
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("b. " + result2);
		
		int totalAge = 0;
		for (int age: ages2) {
			totalAge += age;
		}
		
		System.out.println("c. The average is " + totalAge / ages2.length);
		
		
		/*
		 * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 * b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int totalNumber = 0; //initializing variable
		for (String name: names) {
			totalNumber += name.length();	
		}
		
		int avgLetter = totalNumber / names.length; //applying average formula
		System.out.println("\n2 - \na. " + avgLetter);
		
		String concatNames = ""; //concatNames initialized
		for (String name: names) {
			 concatNames += (name + " ");
		}
		System.out.println("b. " + concatNames);
		
		
		
		// 3. How do you access the last element of any array?
		
		System.out.println("\n3. To access the last element of an array, we apply 'variable[variable.length - 1]', as seen below:");
		
		String lastElement = names[names.length - 1];
		System.out.println("- Last element of the array names is " + lastElement);
		
		
		
		// 4. How do you access the first element of any array?
		
		System.out.println("\n4 - To access the first element of an array, we appy 'variable[0]', as seen below:");
		
		String firstElement = names[0];
		System.out.println("- First element is " + firstElement);
		
		  
		/* 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created
		 * names array and add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[6];
		int index = 0;
		
		System.out.println("\n5 - The new array printed:");
				
		for (String name: names) {
			System.out.println("\t" + name.length()); //we can print the array or
			
			nameLengths[index++] = name.length(); //or add the ints, using an iterating index, to the new array and see below
		}
		System.out.println("- In Array form " + Arrays.toString(nameLengths)); //use the Arrays.toString from java util to print the int array
		
		/* 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in 
		 * the array. Print the result to the console.
		 */ 
		
		int thisResult = 0;
		for (int nameLength: nameLengths) {
			thisResult += nameLength;
		}
		
		System.out.println("\n6 - The Sum of the elements is " + thisResult);
		
		
		
		/* 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		 * to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */ 
		
		String word = "Hello";
		int num = 5;
		
		String concatPhrase = getConcatWord(word, num);
		
		System.out.println("\n7 - The word concatenated is " + concatPhrase);
		
	
		
		/* 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should 
		 * be the first and the last name as a String separated by a space).
		 */
		
		String firstName = "Zeke";
		String lastName = "Isaac";
		
		System.out.println("\n8 - The full name is " + getFullName(firstName, lastName));
		
		
		
		// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int[] sum9 = {10, 15, 20, 50, 45, 25, 30};
		
		System.out.println("\n9 - The sum of all the ints is greater than 100: " + checkIfTrue(sum9));
		
		
		 
		// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] allElements = {3.0, 5.3, 6.7, 50.4, 43.5, 5.6};
		
		System.out.println("\n10 - The average of all elements is " + getAvgElement(allElements));
		
		
		/* 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first 
		 * array is greater than the average of the elements in the second array.
		 */
		
		double[] array1 = {4.0, 20.3, 8.2, 3,6 +5.75, 6.4};
		double[] array2= {5.5, 6.4, 6.4, 4.8, 6.4};
		
		System.out.println("\n11 - Array1 avg is greater than array2: " + checkAveragesIfTrue(array1, array2));
		
	
		
		/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		
		boolean isHotOutside = false;
		double moneyInPocket = 35.25;
		
		System.out.println("\n12 - I will buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		
		// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		boolean isTrashDay = true;
		boolean trashCanFull = true;
		
		System.out.println("\n13 - I will take the garbage out: " + willTakeGarbageOut(isTrashDay, trashCanFull)); //Print whether or not I will take the garbage out.
		
		

	
	
	
	
	
	} //end of main
	
	
	//------------------------------------------------------------------------
	
	
	
	//Methods
	
	//Method 7
	
	public static String getConcatWord (String word, int n) {
		String concatWord = "";
		for (int i = 0; i < n; i++) {
			concatWord += word;
		}
		return concatWord;
	}
	
	//Method 8
	
	public static String getFullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	//Method 9
	
	public static boolean checkIfTrue (int[] integers) {
		int sum = 0;
		for (int integer: integers) {
			sum += integer;
		}
		return sum > 100;
		}
	
	//Method 10
	
	public static double getAvgElement (double[] allElements) {
		double sum = 0.0;
		for(double element: allElements) {
			sum += element;
		}
		return sum / allElements.length;
	}
	
	//Method 11
	
	public static boolean checkAveragesIfTrue (double[] array1, double[] array2) {
		double sum1 = 0.0;
		for (double arr1: array1) {
			sum1 += arr1;
		}
		
		double sum2 = 9.0;
		for (double arr2:array2) {
			sum2 += arr2;
		}
		
		return sum1/array1.length > sum2/array2.length;
	}
	
	
	//Method 12
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	
	//Method 13
	
	public static boolean willTakeGarbageOut(boolean isTrashDay, boolean trashCanFull) { //this method takes two booleans and returns a boolean
		if (isTrashDay || trashCanFull) { //I will take the trash out if it's trash day or if the trash can is full
			return true; //if either variable is true, return true
		}
		return false; //otherwise return false
	}
	
	
	
	
	
	

	
	
	
	
} //end of class
