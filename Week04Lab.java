package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Week04Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Why would we use a StringBuilder instead of a String? - We use a StringBuilder to build a String dynamically; in other words, we want to have the flexibility to change at any point in time #mutability
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
		
		StringBuilder num = new StringBuilder();
		
		num.append(0);
		num.append(-1);
		num.append(-2);
		num.append(-3);
		num.append(-4);
		num.append(-5);
		num.append(-6);
		num.append(-7);
		num.append(-8);
		num.append(-9);
		System.out.println("1- StringBuilder: " + "\n" + "\t" + num);
		
		
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
		
		List <String> stringList = new ArrayList<String>();
		
		stringList.add("Mornings"); //making sure it's a different length
		stringList.add("Afternoon");
		stringList.add("Evening");
		stringList.add("Yesterday");
		stringList.add("Tomorrow");
		
		System.out.println("2 - List of Strings: " + "\n" + "\t" + stringList);

				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
		
		System.out.println("3 - The shortest string is " + shortestString(stringList));
		
		//another way to test 
		
		List<String> list1 = new ArrayList<>();
		list1.add("apple");
		list1.add("kiwi");
		list1.add("pear");
		list1.add("mango");	
		System.out.println("Test 2 - " + shortestString(list1));
		
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
		
		System.out.println("4 - " + getFirstAndLast(list1));

				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		
		System.out.println("5 - " + concatenatedList(stringList));
		

				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
		
		System.out.println("6 - " + combinedStrings(stringList, "Midday"));
		
		
		
		
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		List<Integer> testList = List.of(2, 3, 5, 6, 7, 10, 15);
		
		//List<List<Integer>> result = getReturnedList(testList);
		
		System.out.println("7 - " + getReturnedList(testList));
		
		

				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
		
		List<Integer> thisResult = getIntegerList(list1); //using the list in question 3
		
		System.out.println("8 - " + thisResult);
		
		
				
				// 9. Create a set of strings and add 5 values
		
		Set<String> vegetables = new HashSet<String>();
		
		vegetables.add("Carrot");
		vegetables.add("Onion");
		vegetables.add("Zuccini");
		vegetables.add("Asparagus");
		vegetables.add("Broccoli");
		vegetables.add("BrusselSprouts");
		
		System.out.println("9 - " + vegetables);
		

				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
		
		char ch = 'B';
		
		Set<String> returnedStrings = getSetOfStrings(vegetables, ch);
		
		System.out.println("10 - " + returnedStrings);
		

				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
		
		Set<String> carMakes = new HashSet<String>();
		
		carMakes.add("Ford");
		carMakes.add("Toyota");
		carMakes.add("Nissan");
		carMakes.add("Honda");
		carMakes.add("Audi");
		
		List<String> setToList = getConvertedSet(carMakes);
		
		System.out.println("11 - " + setToList);
			
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
		
		Set<Integer> numberSet = Set.of(1, 2, 4, 5, 6, 8, 10, 11, 12, 16);
		
		System.out.println("12 - " + getEvenNumbers(numberSet));
		


				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
		
		Map<String,String> stringMap = new HashMap<String, String>();
		
		stringMap.put("plane", "flying engine");
		stringMap.put("basketball", "bouncing ball");
		stringMap.put("water", "Liquid");
		stringMap.put("helicopter", "copter with flying blades");
		
		System.out.println("13 - " + stringMap);

			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
		
		String wordGiven = "helicopter";
		
		System.out.println("14 - " + getValue(stringMap, wordGiven));


				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
		
		List<String> thisTestList = List.of("apple", "aroma", "alright", "banana", "cherry", "cat", "dog", "elephant");
		
		
		System.out.println("15 - " + getStringCount(thisTestList));
		
		

		
		
		//------------------------------------
		
		
				

			} //end of main
	
	
			// Method 3
	
	public static String shortestString(List<String> strings) {
		String shortest = strings.get(0);
		for (String str : strings) {
			if (str.length() < shortest.length()) {
				shortest = str;
			}
	}
		return shortest;
}
	
			// Method 4
	
	public static List<String> getFirstAndLast (List<String> strings) {
		
		if (strings.size() == 1) {
			return new ArrayList<>(strings);
		}
				
		List<String> resultList = new ArrayList<>();
		resultList.add(strings.get(0));
		resultList.add(strings.get(strings.size() - 1));
		
		return resultList;
	}
	
			// Method 5:
	
	public static String concatenatedList(List<String> strings) {
		String concatList = "";
		for (String str: strings) {
			concatList += str + ",";
		}
		return concatList;
	}
	
			// Method 6:
	
	public static List<String> combinedStrings(List<String> strings, String string) {
		strings.add(string);
		return strings;
	}
	
	
			// Method 7:
	
	public static List<List<Integer>> getReturnedList (List<Integer> lists) {
		List<List<Integer>> returnedList = new ArrayList<>();
		List<Integer> divisibleByTwo = new ArrayList<>();
		List<Integer> divisibleByThree = new ArrayList<>();
		List<Integer> divisibleByFive = new ArrayList<>();
		List<Integer> notDivisible = new ArrayList<>();
		
		for (int num : lists) {
			
			if (num % 2 == 0) divisibleByTwo.add(num);
		    
			if (num % 3 == 0) divisibleByThree.add(num);
			
			if (num % 5 == 0) divisibleByFive.add(num);
			
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) notDivisible.add(num);
		
		}
		
		returnedList.add(divisibleByTwo.isEmpty() ? new ArrayList<>() : divisibleByTwo); //Add an empty list if no number is divisible by 2
		
		returnedList.add(divisibleByThree);
		
		returnedList.add(divisibleByFive);
		
		returnedList.add(notDivisible);
		
		return returnedList;
		
		
	}
	
	
			// Method 8:
	
	public static List<Integer> getIntegerList(List<String> stringList) {
		List<Integer> integerList = new ArrayList<Integer>();
		
		for (String str : stringList) {
			integerList.add(str.length());
		}
		return integerList;
	}
	
	
			// Method 10:
	
	public static Set<String> getSetOfStrings (Set<String> strings, char character) {
		Set<String> returnedStringSet = new HashSet<String>();
		
		for (String str : strings) {
			if (str.charAt(0) == character) {
				returnedStringSet.add(str);
			}
		}
		return returnedStringSet;
	}
	
			// Method 11:
	
	public static List<String> getConvertedSet (Set<String> strings) {
		List<String> convertedSet = new ArrayList<>();
		
		for (String str : strings) {
			convertedSet.add(str);
		}
		return convertedSet;
	}
	
			// Method 12:
	
	public static Set<Integer> getEvenNumbers (Set<Integer> numbers) {
		Set<Integer> evenNumbers = new HashSet<Integer>();
		
		for(int num : numbers) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			}	
		}
		return evenNumbers;
	}

					
			// Method 14:
	
	public static String getValue (Map<String, String> dictionary, String word) {
		return dictionary.get(word); //Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key.
		
	}
			
			
			
			// Method 15:
	
	public static Map<Character, Integer> getStringCount (List<String> stringList) {
		Map<Character, Integer> result = new HashMap<>();
		
		for (String str : stringList) {
			char firstChar = str.charAt(0);
			
			result.put(firstChar, result.getOrDefault(firstChar, 0) + 1); //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
			
			}
		
		return result;
	}
			

			
			//----------------------------
			

			

} //end of class
