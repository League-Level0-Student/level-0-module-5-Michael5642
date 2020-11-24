package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String userName = JOptionPane.showInputDialog("enter a name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(userName.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
int carNext = 0;
int carNext2 = 0;
for (int i = 0; i < userName.length(); i++) {
	carNext = carNext + 1;
	if(carNext%2==0) {
		userName.toUpperCase();
		char evenChars = Character.toUpperCase(userName.charAt(carNext2));
		goofyName = goofyName + evenChars;
	}
	else {
		
		
		char oddChars = Character.toLowerCase(userName.charAt(carNext2));
		goofyName = goofyName + oddChars;
	}
	carNext2 = carNext2 + 1;
}
JOptionPane.showMessageDialog(null, "your goof name is: " + goofyName);
				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
	
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	}
}

