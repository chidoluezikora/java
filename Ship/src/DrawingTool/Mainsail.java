/**
 * Provides Mainsail Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class Mainsail extends Rectangle {
	
	public void draw(Point rootedAt, int width, int height) {
		super.draw(rootedAt, width, height, Color.white);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().drawRect(getRootedAtX(), getRootedAtY()-getHeight(), getWidth(), getHeight());
	}
}