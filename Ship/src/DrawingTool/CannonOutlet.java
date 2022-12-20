/**
 * Provides CannonOutlet Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;

public class CannonOutlet extends Circle {

	public void draw(Point rootedAt, int radius, Color color) {
		super.draw(rootedAt, radius, color);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().drawOval(getRootedAtX(), getRootedAtY(), getRadius(), getRadius());
	}
}