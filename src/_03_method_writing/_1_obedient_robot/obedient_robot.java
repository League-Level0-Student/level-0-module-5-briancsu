package _03_method_writing._1_obedient_robot;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class obedient_robot {
static Robot rob;
public static void main(String[] args) {
	rob = new Robot();
	rob.setSpeed(100);
	rob.penDown();
	
	
	String color = JOptionPane.showInputDialog("What color (R/G/B) : ");
	
	if(color.equalsIgnoreCase("R")) {
		rob.setPenColor(255,0,0);
	}
	else if(color.equalsIgnoreCase("G")) {
		rob.setPenColor(0,255,0);
	}
	else if(color.equalsIgnoreCase("B")) {
		rob.setPenColor(0,0,255);
	}
	else {
		System.out.println("Not possible.");
	}
	
	String shape = JOptionPane.showInputDialog("What shape: ");
	
	if(shape.equalsIgnoreCase("Triangle")) {
		drawTriangle(150);
	}
	else if(shape.equalsIgnoreCase("Square")) {
		drawSquare(150);
	}
	else if(shape.equalsIgnoreCase("Circle")) {
		drawCircle(150);
	}
	else {
		System.out.println("Not possible.");
	}
	
	
	
	
	
	
	
	
	
	rob.hide();	
}

public static void drawSquare(int length) {
	for(int i = 0; i < 4; i ++) {
		rob.move(length);
		rob.turn(90);
	}
}
public static void drawTriangle(int length) {
	for(int i = 0; i < 3; i++) {
		rob.move(length);
		rob.turn(120);
	}
}
public static void drawCircle(double diameter) {
	for(int i = 0; i < 360; i ++) {
		int diameter1 = (int) diameter;
		
		rob.move(diameter1/120);
		rob.turn(1);
	}
}

}
