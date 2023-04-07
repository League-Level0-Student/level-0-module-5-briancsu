package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Which color", "Evil Polygons", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Green", "Red"}, 0);
		rob.moveTo(450, 600);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 2) {
			rob.setPenColor(255,0,0);
		}
		else if(colorChoice == 1) {
			rob.setPenColor(0,255,0);
		}
		else if(colorChoice == 0) {
			rob.setPenColor(0,0,255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String x = JOptionPane.showInputDialog("How many polygons should be drawn: ");
		int y = Integer.parseInt(x);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i = 0; i < y; i ++) {
			rob.penDown();
			for(int p = 0; p < 4; p ++) {
				rob.move(50);
				rob.turn(90);
			}
			rob.penUp();
			rob.move(70);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

