/**
 * Provides Crown Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*; 

public class Crown extends Circle {
	
	public int radius() {
		return getRadius();
	}
	
	public void draw(Point rootedAt, int radius) {
		super.draw(rootedAt, radius, Color.green);
	}
}