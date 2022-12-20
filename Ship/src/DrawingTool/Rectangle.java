/**
 * Provides Rectangle Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class Rectangle {
	private Point rootedAt;
	private int width;
	private int height;
	
	public void setDimensions(Point rootedAt, int width, int height) {
		this.rootedAt = rootedAt;
		this.width = width;
		this.height = height;
	}
	
	public int getRootedAtX() {
		return rootedAt.x;
	}
	
	public int getRootedAtY() {
		return rootedAt.y;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void draw(Point rootedAt, int width, int height, Color color) {
		setDimensions(rootedAt, width, height);
		Drawing.pen().setColor(color);
		Drawing.pen().fillRect(rootedAt.x, rootedAt.y-height, width, height);
	}
}