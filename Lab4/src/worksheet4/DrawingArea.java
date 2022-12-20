/**
 * 25.01.2022
 * Provides a drawing area.
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package worksheet4;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel {
	private Graphics g;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.g = g;
		drawJuliaSet(g);
	}
	
	private void drawPoint(Point p, Color c) {
		int x1 = p.x;
		int y1 = p.y;
		int x2 = p.x;
		int y2 = p.y;
		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);
	}
	
	private void drawJuliaSet(Graphics g) {
		drawJSet();
	}
	
	private void drawJSet() {
		int screenWidth = 1440;
		int screenHeight = 900; 
		int xMin = 0;
		double yMin = -0.7;
		double a = -0.0009;
		double b = 0.71;
		double stepSize = 0.001021;
		double x = xMin;
		
		for (int s = 1; s <= screenWidth; s++) {
			double y = yMin;
			for (int z = 1; z <= screenHeight; z++) {
				double x1 = x;
				double y1 = y;
				int counter = 0;
				int maxCounter = 100;
				while (counter <= maxCounter && Math.pow(x1, 2) + Math.pow(y1, 2) < 2) {
					counter ++;
					double xx = Math.pow(x1, 2) - Math.pow(y1, 2) + a;
					y1 = 2 * x1 * y1 + b;
					x1 = xx;
				}
				paintPoint(counter, s, z);
				y = y + stepSize;
			}
			x = x + stepSize;
		}
	}
	
	private void paintPoint(int counter, int s, int z) {
		Point p = new Point(s, z);
		if (counter % 2 == 0) {
			drawPoint(p, Color.pink);
		} else { 
			drawPoint(p, Color.red);
		}
	}
}