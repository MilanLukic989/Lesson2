package optional;

import org.jointheleague.graphical.robot.Robot;

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		Robot.setWindowSize(1280, 960);
		
		robot.setSpeed(8);
		
		int x = 10;
		int y = 950;
		int starSize = 25;
		
		for (int i = 0; i < 30; i++) {
			robot.setPenWidth(i);
			robot.setPos(x, y);
			drawStar(starSize);
			x += starSize;
			y -= starSize;
			starSize += 20;
			robot.turn(12.0);
			robot.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {

           robot.penDown();
           
           for (int i = 0; i < 5; i++) {
        	   robot.move(starSize);
        	   robot.turn(144.0);
           }
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





