/**
 * Provides Background Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;

public class Background {
	private Sea mySea;
	private Sky mySky;
	private Island myIsland;
	private Sun mySun;
	private char condition;
	private String skyBlue = "#B3E8FF";
	private String blue = "#1338BE";
	private String yellow = "#FFD801";
	private String orange = "#FF8037";
	private String darkSkyBlue = "#93C0D0";
	private String darkOceanBlue = "#002364";
	private String darkYellow = "#E8A317";

	public Background(char condition) {
		this.condition = condition;
		mySun = new Sun();
		mySky = new Sky();
		mySea = new Sea();
		myIsland = new Island(new Point(755, 450), 200, 20);
	}

	public void draw() {
		drawCondition(condition);
	}

	private void drawCondition(char condition) {
		switch (condition) {
		case 'A':
			drawEmpty();
			break;
		case 'B':
			drawDull();
			break;
		case 'C':
			drawSunrise();
			break;
		case 'D':
			drawSunset();
			break;
		default:
			drawSunrise();
		}
	}

	private void drawEmpty() {
		mySky.draw(new Point(0, 450), Color.decode(skyBlue));
		mySea.draw(new Point(0, 768), Color.decode(blue));
		myIsland.draw(Color.decode(yellow));
	}

	private void drawDull() {
		mySky.draw(new Point(0, 450), Color.GRAY);
		mySea.draw(new Point(0, 768), Color.black);
		myIsland.draw(Color.DARK_GRAY);
		mySun.draw(new Point(70, 100), Color.WHITE);
	}

	private void drawSunrise() {
		mySky.draw(new Point(0, 450), Color.decode(skyBlue));
		mySea.draw(new Point(0, 768), Color.decode(blue));
		myIsland.draw(Color.decode(yellow));
		mySun.draw(new Point(70, 100), Color.decode(orange));
	}

	private void drawSunset() {
		mySky.draw(new Point(0, 450), Color.decode(darkSkyBlue));
		mySun.draw(new Point(70, 410), Color.decode(orange));
		mySea.draw(new Point(0, 768), Color.decode(darkOceanBlue));
		myIsland.draw(Color.decode(darkYellow));
	}
}
