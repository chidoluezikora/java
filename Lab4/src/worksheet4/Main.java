/**
 * 25.01.2022
 * Provides main.
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package worksheet4;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class Main extends JFrame {
	private DrawingArea drawing;

	public Main(String title) {
		super(title);
		
		setLayout(new BorderLayout());

		constructDrawingArea();

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		setVisible(true);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new Main("Draw a Julia set");
	}
}