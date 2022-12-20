/**
 * Provides Circle Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;

public class Circle {
	private Point rootedAt;
	private int radius;
	
	public void setDimensions(Point rootedAt, int radius) {
		this.rootedAt = rootedAt;
		this.radius = radius;
	}

	public int getRootedAtX() {
		return rootedAt.x;
	}
	
	public int getRootedAtY() {
		return rootedAt.y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void draw(Point rootedAt, int radius, Color color) {
		setDimensions(rootedAt, radius);
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(rootedAt.x, rootedAt.y, radius, radius);
	}
}