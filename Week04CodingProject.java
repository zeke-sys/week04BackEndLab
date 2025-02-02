package week04;

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
		System.out.println("1 - The results are: \na - " + result);
		
		int[] ages2 = {4, 5, 7, 54, 57, 23, 23, 67, 32};
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("b - " + result2);
		
		int totalAge = 0;
		for (int age: ages2) {
			totalAge += age;
		}
		
		System.out.println("2. The average is " + totalAge / ages2.length);
		
		/*
		 * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 * b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		
		
		
		// 3. How do you access the last element of any array?
		
		
		
		
		// 4. How do you access the first element of any array?
		  
		/* 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created
		 * names array and add the length of each name to the nameLengths array.
		 */ 
		
		
		/* 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in 
		 * the array. Print the result to the console.
		 */ 
		
		
		
		
		/* 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		 * to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */ 
		
		
		
		/* 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should 
		 * be the first and the last name as a String separated by a space).
		 */
		
		// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		
		 
		// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 
		
		
		/* 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first 
		 * array is greater than the average of the elements in the second array.
		 */
		
		
		
		
		/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */ 
		
		
		// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		

	}

}
