/**
 * Provides Hull Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Path2D;

public class Hull {
	private Point rootedAt;
	private int width;
	private int height;

	public Hull(Point rootedAt, int width, int height) {
		this.rootedAt = rootedAt;
		this.width = width;
		this.height = height;
	}
	
	private void drawSemiCircle() {
		Path2D.Double path = new Path2D.Double();
		path.moveTo(rootedAt.x, rootedAt.y-height);
		path.lineTo(rootedAt.x+width, rootedAt.y-height);
		path.curveTo(rootedAt.x+width*0.9, rootedAt.y+height*0.2, rootedAt.x+width*0.1, rootedAt.y+height*0.2, rootedAt.x, rootedAt.y-height);		
		Drawing.pen().fill(path);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().draw(path);
	}
	
	public void draw(Color color) {
		Drawing.pen().setColor(color);
		drawSemiCircle();
	}
}