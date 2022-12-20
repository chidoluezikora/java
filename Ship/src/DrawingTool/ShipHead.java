/**
 * Provides ShipHead Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Point;

public class ShipHead {
	private Flag flag1;			
	private Mast mast1;			
	private Mainsail mainsail1;	
	private Mainsail mainsail2;	
	private FrontJib frontJib1;	
	private BackJib backJib1;	
	private int width;
	private int height;
	private Point rootedAt;

	public ShipHead(Point rootedAt, int width, int height) {
		this.width = width;
		this.height = height;
		this.rootedAt = rootedAt;
		Point flag1Position = new Point((int)(rootedAt.x+width*0.5), (int)(rootedAt.y-height*0.945));
		Point frontJib1Position = new Point((int)(rootedAt.x+width*0.77), (int)(rootedAt.y-height*0.3));
		Point backJib1Position = new Point((int)(rootedAt.x+width*0.23), (int)(rootedAt.y-height*0.3));
		flag1 = new Flag(flag1Position, (int)(width*0.15), (int)(height*0.044));
		frontJib1 = new FrontJib(frontJib1Position, (int)(width*0.2), (int)(height*0.5));
		backJib1 = new BackJib(backJib1Position, (int)(width*0.2), (int)(height*0.5));
		mast1 = new Mast();
		mainsail1 = new Mainsail();
		mainsail2 = new Mainsail();
	}
	
	private void drawMastAndMainsails() {
		Point mast1Position = new Point((int)(rootedAt.x+width*0.5), (int)(rootedAt.y-height*0.295));
		Point mainsail1Position = new Point((int)(rootedAt.x+width*0.37), (int)(rootedAt.y-height*0.35));
		Point mainsail2Position = new Point((int)(rootedAt.x+width*0.37), (int)(rootedAt.y-height*0.6));
		mast1.draw(mast1Position, (int)(width*0.02), (int)(height*0.7));
		mainsail1.draw(mainsail1Position, (int)(width*0.3), (int)(height*0.2));
		mainsail2.draw(mainsail2Position, (int)(width*0.3), (int)(height*0.2));
	}

	public void draw() {
		drawMastAndMainsails();
		flag1.draw();
		frontJib1.draw();
		backJib1.draw();
	}
}