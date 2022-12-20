/**
 * Provides BackJib Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;
import java.awt.geom.Path2D;

public class BackJib {
	private Point rootedAt;
	private int width;
	private int height;
	private int deviation = 10;

	public BackJib(Point rootedAt, int width, int height) {
		this.rootedAt = rootedAt;
		this.width = width;
		this.height = height;
	}

	private void fillJib() {
		Path2D.Double path = new Path2D.Double();
		path.moveTo(rootedAt.x, rootedAt.y);
		path.lineTo(rootedAt.x, rootedAt.y-height);
		path.lineTo(rootedAt.x-width, rootedAt.y-deviation*2);
		path.lineTo(rootedAt.x, rootedAt.y-deviation);
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fill(path);
	}
	
	public void draw() {
		fillJib();
		Drawing.pen().setColor(Color.black);
		Drawing.pen().drawLine(rootedAt.x, rootedAt.y, rootedAt.x, rootedAt.y-height);
		Drawing.pen().drawLine(rootedAt.x, rootedAt.y-height, rootedAt.x-width, rootedAt.y-deviation*2);
		Drawing.pen().drawLine(rootedAt.x-width, rootedAt.y-deviation*2, rootedAt.x, rootedAt.y-deviation);
	}
}