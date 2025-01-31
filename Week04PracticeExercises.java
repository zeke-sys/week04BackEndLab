package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04PracticeExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Example of a StringBuilder
		
		String firstName = "Bob";
		String lastName = "Brown";
		String middleName = "B";
		String space = " ";
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		StringBuilder fullName = new StringBuilder();
		
		//use append() to dynamically create a String using StringBuilder
		fullName.append(firstName);
		fullName.append(space);
		fullName.append(lastName);
		System.out.println(fullName.toString());
		
		//Add a middle initial by using StringBuilder insert
		fullName.insert(firstName.length()+1, middleName + space);
			
		System.out.println(fullName.toString());
		
		//Use StringBuilder concat
		System.out.println("- StringBuilder concat - " + firstName.concat(lastName));
		
		//because strings are immutable, if we simply concat the last name to first name and print it, the first name won't change
		//we need to first reassign the firstName to change the value of the String in memory
		firstName.concat(lastName);
		System.out.println(firstName);
		
		firstName = firstName.concat(lastName);
		System.out.println("The new first name is - " + firstName);
		
		
		//Using the method
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		//Note - strings are useful but if the value is set to change occasionally, it's better to use a StringBuilder
		
		//Using charAt to find positions of specific characters in a string
		System.out.println("The character is " + fullName.charAt(9));
		
		//Using deleteCharAt to delete specific characters
		//System.out.println(fullName.deleteCharAt(2));
		
		//Using indexOf to look for where a character is located
		System.out.println(fullName.indexOf("ro"));
		
		//Using replace
		System.out.println(fullName.replace(0, 3, "Tim"));
		
		//Using reverse
		System.out.println(fullName.reverse());
		
		
		//--------------------------------------
		
		//LISTS (Comparing an Array to a List)
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//List<E> reads a list of E (the type of data that will be inserted)
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		
		System.out.println("\n- Using an enhanced for loop, the sports listed are:");
		
		for (String sport : sports) { //enhanced for loop
			System.out.println(sport);
		}
		
		//using normal for loop (have to use size() to find the length of the arraylist and get() to print it out)
		System.out.println("\n- Using a regular for loop, we get:");
		for (int i=0; i<sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		//To remove a string from a list, we use remove and the index number of the String
		System.out.println("The removed string is " + sports.remove(1));
		System.out.println(sports);
		
		
		//COLLECTIONS - SET (HashSet, TreeSet, and LinkedHashSet)
		//java.util.HashSet and java.util.Set have to be imported similar to the imports for List
		//Unlike a list, a set is unordered and doesn't show duplicates
		//Allows null
		
		Set<String> vegetables = new HashSet<String>();
		
		vegetables.add("carrot");
		System.out.println(vegetables);
		vegetables.add("onion");
		System.out.println(vegetables);
		vegetables.add("broccoli");
		System.out.println(vegetables);
		vegetables.add("carrot"); //if a duplicate is added, it doesn't get stored
		System.out.println(vegetables);
		
		vegetables.add(null);
		System.out.println(vegetables);
		
		//finding the size of the HashSet collection.
		System.out.println("The size of the HashSet collection is " + vegetables.size());
		
		
		//Collections - MAP (HashMap, ...)
		//key value pairs (as in a dictionary)
		//values can be duplicate but not keys (only oneKw
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3,"John");
		
		System.out.println(racerPlacements);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //end of main
	
	//Creating a method to use StringBuilder above
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}
	
	//another method to practice StringBuilder

	
	
	
	

} //end of class
