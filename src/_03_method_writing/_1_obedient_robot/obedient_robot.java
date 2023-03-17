package _03_method_writing._1_obedient_robot;
import org.jointheleague.graphical.robot.Robot;
public class obedient_robot {
static Robot rob;
public static void main(String[] args) {
	rob = new Robot();
	rob.setSpeed(100);
	rob.penDown();
	drawCircle(100);
	drawSquare(100);
	
	
	
	
	
	
	
	
	
	
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
		rob.turn(60);
	}
}
public static void drawCircle(int diameter) {
	for(int i = 0; i < 360; i ++) {
		rob.move(diameter/90);
		rob.turn(1);
	}
}

}
