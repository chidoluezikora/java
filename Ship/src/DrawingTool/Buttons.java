/**
 * Provides Button Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons {
	private JButton shipsButton = new JButton("Ships");
	private JButton treesButton = new JButton("Trees");
	private JButton emptyButton = new JButton("Empty Scene");
	private JButton dullButton = new JButton("Dull Scene");
	private JButton sunriseButton = new JButton("Sunrise");
	private JButton sunsetButton = new JButton("Sunset");
	private JLabel label = new JLabel("Click as you wish ;)");

	public void addActionListener(ActionListener listener) {
		shipsButton.addActionListener(listener);
		treesButton.addActionListener(listener);
		emptyButton.addActionListener(listener);
		dullButton.addActionListener(listener);
		sunriseButton.addActionListener(listener);
		sunsetButton.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));
		shipsButton.setToolTipText("click to draw ships");
		treesButton.setToolTipText("click to draw trees");
		emptyButton.setToolTipText("click to draw an empty scene");
		dullButton.setToolTipText("click to draw a dull scene");
		sunriseButton.setToolTipText("click to draw sunrise");
		sunsetButton.setToolTipText("click to draw sunset");
		menu.add(label);
		menu.add(shipsButton);
		menu.add(treesButton);
		menu.add(emptyButton);
		menu.add(dullButton);
		menu.add(sunriseButton);
		menu.add(sunsetButton);
		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getShipsButton() {
		return shipsButton;
	}

	public JButton getTreesButton() {
		return treesButton;
	}

	public JButton getSunriseButton() {
		return sunriseButton;
	}
	
	public JButton getSunsetButton() {
		return sunsetButton;
	}
	
	public JButton getEmptyButton() {
		return emptyButton;
	}
	
	public JButton getDullButton() {
		return dullButton;
	}
}