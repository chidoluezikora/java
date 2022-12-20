/**
 * Provides Sun Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class Sun extends Circle {
	private int radius = 90;
	
	public void draw(Point rootedAt, Color color) {
		super.draw(rootedAt, radius, color);
	}
}