package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class skill_practice {
	Random object = new Random();
public static void main(String[] args) {

skill_practice skills = new skill_practice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
int cents = Integer.parseInt(dimes);
cents = cents*10;

// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "you have " + cents + " cents");



// Ask the user how tall they are (inches)
String inches = JOptionPane.showInputDialog("how tall are you? (in inches)");
int height = Integer.parseInt(inches);


// If they are shorter than 36 inches, tell them to eat their Wheaties
if (height <= 36) {
	JOptionPane.showMessageDialog(null, "eat your wheaties");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
	int third = 1;
for (int i = 0; i < 30; i++) {
	if(third%3 == 0) {
	System.out.println(third);
	
}
	third = third + 1;
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console
int ranNum = object.nextInt(20-0)+0;
System.out.println(ranNum);

// Get another random number that is less than 10 and print it to the console
int numRan = object.nextInt(10-0)+0;
System.out.println(numRan);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
int diff = ranNum - numRan;
JOptionPane.showMessageDialog(null, diff + " is the difference between " + ranNum + " and " + numRan);


}

void skill4() { // In a pop-up, ask the user for the city they live in
String city = JOptionPane.showInputDialog("what city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City
if (city.equalsIgnoreCase("san diego")) {
	JOptionPane.showMessageDialog(null, "you live in the finest city of America");
}


// Otherwise, tell them to move to San Diego
else {
	JOptionPane.showMessageDialog(null, "move to San Diego nerd");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars = 3;

if (cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
// If there is 1 car, use a pop-up to display the make/model of the car
else if (cars == 1) {
	ImageIcon car = new ImageIcon("///headless/Desktop/car.jpg");
	JOptionPane.showMessageDialog(null, "", "", 0, car);
}


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
else if (cars > 1) {
	JOptionPane.showMessageDialog(null, "there's " + (cars*4) + " wheels between them");
}


}

void skill5() { // In a pop-up, ask the user for the name of their school
String school = JOptionPane.showInputDialog("what is the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
JOptionPane.showMessageDialog(null, school + " is a fantastic school");


}
}



