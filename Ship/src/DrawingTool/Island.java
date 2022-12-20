/**
 * Provides Island Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Path2D;

public class Island {
	private Point rootedAt;
	private int width;
	private int height;

	public Island(Point rootedAt, int width, int height) {
		this.rootedAt = rootedAt;
		this.width = width;
		this.height = height;
	}
	
	private void drawIsland() {
		Path2D.Double path = new Path2D.Double();
		path.moveTo(rootedAt.x, rootedAt.y);
		path.lineTo(rootedAt.x+width, rootedAt.y);
		path.curveTo(rootedAt.x+width*0.7, rootedAt.y-height*2, rootedAt.x+width*0.3, rootedAt.y-height*2, rootedAt.x, rootedAt.y);
		Drawing.pen().fill(path);
	}
	
	public void draw(Color color) {
		Drawing.pen().setColor(color);
		drawIsland();
	}
}