package week04;

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
