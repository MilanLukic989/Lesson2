package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {

		Robot r2d2 = new Robot("mini");
		r2d2.penDown();
		r2d2.setPenWidth(10);
//		r2d2.setPenColor(0,200,0);
		r2d2.setRandomPenColor();
		r2d2.setSpeed(10);

		int sides = 5;
		double angle = 360/sides;

		for (int i = 0; i < 200; i++) {
			r2d2.move(i);
			r2d2.turn(angle);
			r2d2.turn(1.0);

		}
	}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}