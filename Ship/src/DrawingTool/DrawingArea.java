/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.*;
import javax.swing.JPanel;

public class DrawingArea extends JPanel { 
	private static final long serialVersionUID = 1L; 
	private Scene myScene = new Scene();

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Graphics2D pen2d = (Graphics2D) pen;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
		pen2d.setRenderingHints(rh);
		Drawing.set(pen2d);
		myScene.draw();
	}
	
	public Scene getScene() {
		return myScene;
	}
}