/**
 * Provides Trunk Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;  

public class Trunk {
	private Polygon p;
	private int width;
	private int height;
	private String brown = "#964B00";
	
	public Trunk(Point rootedAt, int width, int height) {
		this.width = width;
		this.height = height;
		int n = 4;
		int [] x = {rootedAt.x+3, rootedAt.x, rootedAt.x+width, rootedAt.x+width-3};
		int [] y = {rootedAt.y-height, rootedAt.y, rootedAt.y, rootedAt.y - height};
		p = new Polygon(x,y,n);
	}
	
	public int width() {
		return width;
	}
	
	public int height() {
		return height;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.decode(brown));
		Drawing.pen().fillPolygon(p);	
	}
}