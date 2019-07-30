package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		
	
	Robot no = new Robot();
	no.penDown();
	no.setRandomPenColor();
	no.setSpeed(100);
	no.move(200);
	no.turn(90);
	for (int i = 0; i < 180; i++) {
		no.move(2);
		no.turn(1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}