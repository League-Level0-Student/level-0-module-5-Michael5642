package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	static Robot xenon = new Robot();
public static void main(String[]args) {
	int shape = JOptionPane.showOptionDialog(null, "what shape do you want?", null, 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] 
			{"Square", "Triangle", "Circle"}, 0);
	if (shape == 0) {
		drawSquare(50);
	} 
	else if (shape == 1) {
		drawTriangle(50);
	}
	else if (shape == 2) {
		drawCircle(2);
	}
	
	
	
	
}

static void drawSquare(int squDistance) {
	xenon.penDown();
	xenon.setSpeed(10);
	for (int i = 0; i < 4; i++) {
		xenon.move(squDistance);
		xenon.turn(90);
	}
}
static void drawTriangle(int triDistance) {
	xenon.penDown();
	xenon.setSpeed(10);
	xenon.turn(30);
	for (int i = 0; i < 3; i++) {
		xenon.move(triDistance);
		xenon.turn(120);
	}
}
static void drawCircle(int cirDistance) {
	xenon.penDown();
	xenon.setSpeed(100);
	for (int i = 0; i < 10;i = i++) {
		xenon.move(cirDistance);
		xenon.turn(1);
	}
}










	
}
