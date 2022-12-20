/**
 * Provides Tree Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool; 

import java.awt.*;

public class Tree implements LocatedRectangle {
	private Point rootedAt;
	private Trunk trunk;  
	private Crown crown;
	private int radius;
	private int width;
	private int height;
	
	public Tree(Point rootedAt, int width, int height, int radius) {
		this.rootedAt = rootedAt;
		this.trunk = new Trunk(rootedAt, width, height);
		this.radius = radius;
		this.width = width;
		this.height = height;
		crown = new Crown();
	}
	
	public void draw() {  
		trunk.draw();
		int x = rootedAt.x+(width/2)-(radius/2);
		int y = rootedAt.y-height-radius+1;
		Point crownPos = new Point(x,y);
		crown.draw(crownPos, radius);
	}

	public Point address() {
		return rootedAt;
	}

	public int width() {
		return Math.max(trunk.width(), crown.radius());
	}

	public int height() {
		return trunk.height() + crown.radius();
	}

	public int radius() {
		return crown.radius();
	}
}