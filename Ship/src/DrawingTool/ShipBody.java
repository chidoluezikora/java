/**
 * Provides ShipBody Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class ShipBody {
	private Hull hull1;   				
	private CannonOutlet cannonOutlet1;	    
	private CannonOutlet cannonOutlet2;		
	private CannonOutlet cannonOutlet3;		
	private CannonOutlet cannonOutlet4;		
	private int width;
	private int height;
	private Point rootedAt;
	
	public ShipBody(Point rootedAt, int width, int height) {
		this.width = width;
		this.rootedAt = rootedAt;
		this.height = height;
		Point hull1Position = new Point(rootedAt.x, rootedAt.y);
		hull1 = new Hull(hull1Position, width, (int)(height*0.3));
		cannonOutlet1 = new CannonOutlet();	
		cannonOutlet2 = new CannonOutlet();
		cannonOutlet3 = new CannonOutlet();
		cannonOutlet4 = new CannonOutlet();
	}

	private void drawCannonOutlets() {
		Point cannonOutlet1Position = new Point((int)(rootedAt.x+width*0.18), (int)(rootedAt.y-height*0.27));
		Point cannonOutlet2Position = new Point((int)(rootedAt.x+width*0.38), (int)(rootedAt.y-height*0.27));
		Point cannonOutlet3Position = new Point((int)(rootedAt.x+width*0.58), (int)(rootedAt.y-height*0.27));
		Point cannonOutlet4Position = new Point((int)(rootedAt.x+width*0.78), (int)(rootedAt.y-height*0.27));
		cannonOutlet1.draw(cannonOutlet1Position, (int)(width*0.05), Color.blue);
		cannonOutlet2.draw(cannonOutlet2Position, (int)(width*0.05), Color.blue);
		cannonOutlet3.draw(cannonOutlet3Position, (int)(width*0.05), Color.blue);
		cannonOutlet4.draw(cannonOutlet4Position, (int)(width*0.05), Color.blue);
	}
	
	public void draw(Color color) {
		hull1.draw(color);
		drawCannonOutlets();
	}
}