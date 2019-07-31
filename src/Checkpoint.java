

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String no=JOptionPane.showInputDialog("what is your faverit coler");	
	JOptionPane.showInputDialog(no+"is my faverit coler as well ");

	Robot sans = new Robot();
    sans.penDown();
	for (int i = 0; i < 3; i++) {
		
	
    sans.setRandomPenColor();
    sans.move(300);
    sans.turn(120);
	}
    
    
    
    
    


































}
}