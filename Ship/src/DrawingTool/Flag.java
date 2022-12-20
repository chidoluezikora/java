/**
 * Provides Flag Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Path2D;

public class Flag {
	private Point rootedAt;
	private int width;
	private int height;

	public Flag(Point rootedAt, int width, int height) {
		this.rootedAt = rootedAt;
		this.width = width;
		this.height = height;
	}

	private void drawFlag() {
		Path2D.Double path = new Path2D.Double();
		path.moveTo(rootedAt.x, rootedAt.y-height);
		path.lineTo(rootedAt.x+width, rootedAt.y-height);
		path.lineTo(rootedAt.x+width*0.7, rootedAt.y-height*0.5);
		path.lineTo(rootedAt.x+width, rootedAt.y);
		path.lineTo(rootedAt.x, rootedAt.y);
		path.lineTo(rootedAt.x, rootedAt.y-height);
		Drawing.pen().fill(path);
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.black);
		drawFlag();
	}
}