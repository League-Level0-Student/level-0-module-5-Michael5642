package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit.Parser;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	static Robot jeremy = new Robot();
	public static void main(String[] args) {
		
		//1. Create a new Robot

		//2. Set the speed to 100
jeremy.setSpeed(10);
jeremy.penDown();
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color", "Color Choice", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			jeremy.setPenColor(255,0,0);
		}
		else if(colorChoice == 1) {
			jeremy.setPenColor(0,255,0);
		}
		else {
			jeremy.setPenColor(0,0,255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String numPoly = JOptionPane.showInputDialog("How many shapes do you want?");
		int polyNumber = Integer.parseInt(numPoly);	
		//5. Use the robot to draw the number of polygons the user requested.
		jeremy.setX(25);
		for (int i = 0; i < polyNumber; i++) {
			jeremy.setX(i*100);
			polyShape(i);
			
			//jeremy.setX(100*i);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
static void polyShape(int shapeType){
	if(shapeType == 0) {
		for (int i = 0; i < 4; i++) {
			jeremy.move(50);
			jeremy.turn(90);	
			}
		
		}
	//Triangle
	else if(shapeType == 1) {
		for (int i = 0; i < 3; i++) {
			jeremy.move(50);
			jeremy.turn(120);
			}
		}
	else if(shapeType == 2) {
		for (int i = 0; i < 6; i++) {
			jeremy.move(50);
			jeremy.turn(60);
			}
		}
	else if(shapeType > 3) {
		JOptionPane.showMessageDialog(null, "That's all the shapes I know");
		}
	}
}

