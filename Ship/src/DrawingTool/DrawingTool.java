/**
 * Provides a test application window with a panel "DrawingArea" and some "Buttons".
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private Buttons buttons = new Buttons();

	public DrawingTool(String title) {
		super(title);
		setLayout(new BorderLayout());
		constructButtonMenu();
		constructDrawingArea();
		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void constructButtonMenu() {
		buttons.addButtonsToAPanel(this);
		buttons.addActionListener(this);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing, BorderLayout.CENTER);
	}

	private void tidyUpDrawingArea() {
		drawing.removeAll();
		drawing.revalidate();
		drawing.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons.getShipsButton()) {
			drawing.getScene().getShips();
			tidyUpDrawingArea();
		} else if (e.getSource() == buttons.getTreesButton()) {
			drawing.getScene().getTrees();
			tidyUpDrawingArea();
		} else if (e.getSource() == buttons.getEmptyButton()) {
			drawing.getScene().getEmpty();
			tidyUpDrawingArea();
		} else if (e.getSource() == buttons.getDullButton()) {
			drawing.getScene().getDull();
			tidyUpDrawingArea();
		} else if (e.getSource() == buttons.getSunriseButton()) {
			drawing.getScene().getSunrise();
			tidyUpDrawingArea();
		} else if (e.getSource() == buttons.getSunsetButton()) {
			drawing.getScene().getSunset();
			tidyUpDrawingArea();
		}
	}

	public static void main(String[] args) {
		new DrawingTool("Modern Pyrate Ship");
	}
}