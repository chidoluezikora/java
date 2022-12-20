/**
 * Provides Sky Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class Sky extends Rectangle {
	private int width = 1366;
	private int height = 450;

	public void draw(Point rootedAt, Color color) {
		super.draw(rootedAt, width, height, color);
	}
}