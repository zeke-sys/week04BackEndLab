package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
		System.out.println("\nThe removed string is " + sports.remove(1));
		System.out.println(sports);
		
		//Using the method get in a List
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("\n- The first number is " + numbers.get(0)); //The .get() method return the element at the specified index.
		
		System.out.println("\n- The number being removed is " + numbers.remove(1));
		System.out.println("- The remaining numbers are " + numbers);
		
		
		//COLLECTIONS - SET (HashSet, TreeSet, and LinkedHashSet)
		//java.util.HashSet and java.util.Set have to be imported similar to the imports for List
		//Unlike a list, a set is unordered and doesn't show duplicates
		//Allows null
		
		Set<String> vegetables = new HashSet<String>();
		
		vegetables.add("carrot");
		System.out.println("\n" + vegetables);
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
		//values can be duplicate but not keys (only one key)
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3,"John");
		
		System.out.println(racerPlacements);
		
		//Finding the last element in a List
		
		List<Integer> newInts = new ArrayList<>();
		newInts.add(143);
		newInts.add(-93);
		newInts.add(54992);
		newInts.add(17);

		System.out.println(newInts.get(newInts.size() - 1));
		
		//Sorting a List of integers following a Listing of the elements
		
		List<Integer> ourInts = new ArrayList<>();
		ourInts.add(894);
		ourInts.add(-1);
		ourInts.add(1077);
		ourInts.add(43);
		ourInts.add(54329);

		Collections.sort(ourInts); //Sorts the specified list into ascending order, according to the natural ordering of its elements
		System.out.println("\n- The ordered/sorted list is as follows:\n\t" + ourInts);
		
		//squaring a number in Java examples
		
		int thisNum = 5;
		System.out.println("\n- The square is " + thisNum* thisNum);
		
		System.out.println("\n- Or a double result of " + Math.pow(thisNum, 2));
		
		//alphabet exercise 
		
		List<Character> alphabet = new ArrayList<>();
		for(int i = 97; i < (97 + 26); i++){
		    alphabet.add((char)i);
		}

		alphabet.remove(0);
		System.out.println("\nThe remaining alphabet is:\n\t" + alphabet);
		
		
		//LinkedList example (good choice when frequent insertions or deletions in the middle of the List are expected.
		//whereas ArrayList is a good choice when random access to elements is important
		
		LinkedList<String> shoppingList = new LinkedList<>();
		
		shoppingList.add("apples");
		shoppingList.add("bread");
		shoppingList.add("bananas");
		shoppingList.add("milk");
		shoppingList.add("cheese");
		shoppingList.add("eggs");
		shoppingList.add("ham");
		
		System.out.println("\nThe shopping list contains " + shoppingList);
		
		//we can use a for loop as well
		for (String item: shoppingList) {
			System.out.println("- " + item);
		}
		
		//using the remove method
		shoppingList.remove(2);
		System.out.println("\nThe remaining shopping list items are " + shoppingList);
		
		//Practicing List slashed in halves
		
		List<String> listOfNames = new ArrayList<>();
		
		listOfNames.add("guy");
		listOfNames.add("janet");
		listOfNames.add("john");
		listOfNames.add("michael");
		listOfNames.add("nick");
		
		System.out.println("\n" + listOfNames);
		
		List<String> resultList = halfTheList(listOfNames);
		
		System.out.println(resultList);
		
		
		//Practice exercise with key pairs method
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Good morning", "bonjour");
		dictionary.put("After", "Apres");
		dictionary.put("abdicate", "abdiquer");
		dictionary.put("sleep", "dormir");
		dictionary.put("Alter", "changer");
		dictionary.put("arrest", "arreter");
		
		System.out.println(dictionary);
		
		List<String> keysWithA = returnValuesForKeysStartingWithA(dictionary);
		System.out.println("\nThe resulting string with all 'A' or 'a' key values is as follows\n\t " + keysWithA);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //end of main
	
	//Creating a method to use StringBuilder above
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}
	
	//another method to practice List
	
	public static List<String> halfTheList(List<String> listOfNames) {
		List<String> resultList = new ArrayList<>();
		
		for(int index = 0; index<listOfNames.size(); index++) {
			if (! (index % 2 == 0)) {
				resultList.add(listOfNames.get(index));
			}
		}
		return resultList;
	}
	
	//This method will take a parameter of type Map <String, String>, and will return a List of String that contains
	//every value of the map where the key starts with 'A' or 'a'
	
	private static List<String> returnValuesForKeysStartingWithA(Map<String, String> dictionary) {
		List<String> resultList = new ArrayList<>();
		
		Set<String> keySet = dictionary.keySet();
		for(String key: keySet) {
			if (key.toLowerCase().charAt(0) == 'a') {
				resultList.add(dictionary.get(key));
			}
		}
		return resultList;
	}

	
	
	
	

} //end of class
