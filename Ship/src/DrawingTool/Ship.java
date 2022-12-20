/**
 * Provides Ship Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class Ship implements LocatedRectangle {
	private ShipHead head;   
	private ShipBody body;    
	private Point rootedAt;
	private int width;
	private int height;
	private Color color;

	public Ship(Point rootedAt, int width, int height, Color color) {
		this.rootedAt = rootedAt;
		this.width = width;
		this.height = height;
		this.color = color;
		head = new ShipHead(new Point(rootedAt.x, rootedAt.y), width, height);
		body = new ShipBody(new Point(rootedAt.x, rootedAt.y), width, height);
	}

	public void draw() {
		head.draw();
		body.draw(color);
	}

	public Point address() {
		return rootedAt;
	}
	
	public int width() {
		return width;
	}
	
	public int height() {
		return height;
	}
}