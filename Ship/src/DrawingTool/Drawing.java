/**
 * Provides a pen which can be used for drawing.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;
 
public class Drawing { 
	private static Graphics2D pen = null;
	
	public static void set(Graphics2D pen) { 
		Drawing.pen = pen;
	}
	
	public static Graphics2D pen() { 
		return Drawing.pen;
	}
}