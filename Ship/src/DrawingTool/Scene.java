/**
 * Provides Scene Object(s).
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import DrawingTool.graphicState.*;

public class Scene {
	private ArrayList<Ship> ships = null;
	private ArrayList<Tree> trees = null;
	private Background background;
	private static State graphicState;
	private Color darkOrange = new Color(255, 45, 23);

	public Scene() {
		ships = new ArrayList<Ship>();
		trees = new ArrayList<Tree>();
		background = new Background('Ç');
		placeShips(Color.red);
		placeTrees();
		graphicState = SunriseState.getInstance(this);
	}

	public void getShips() {
		graphicState = graphicState.drawShips();
	}

	public void getTrees() {
		graphicState = graphicState.drawTrees();
	}

	public void getEmpty() {
		graphicState = graphicState.drawEmpty();
	}

	public void getDull() {
		graphicState = graphicState.drawDull();
	}

	public void getSunrise() {
		graphicState = graphicState.drawSunrise();
	}

	public void getSunset() {
		graphicState = graphicState.drawSunset();
	}

	private boolean vacantShip(Ship newShip) {
		boolean anyIntersection = false;
		for (Ship s : ships)
			anyIntersection = anyIntersection || s.intersects(newShip);
		return !anyIntersection;
	}

	private boolean vacantTree(Tree newTree) {
		boolean anyIntersection = false;
		for (Tree t : trees)
			anyIntersection = anyIntersection || t.intersects(newTree);
		return !anyIntersection;
	}

	private void addShip(Point location, int width, int height, Color color) {
		Ship newShip = new Ship(location, width, height, color);
		if (vacantShip(newShip))
			ships.add(newShip);
	}

	private void addTree(Point location, int width, int height, int radius) {
		Tree newTree = new Tree(location, width, height, radius);
		if (vacantTree(newTree))
			trees.add(newTree);
	}

	private void placeShips(Color color) {
		Point ship1Position = new Point(120, 480);
		int ship1Width = RandomNumber.between(160, 240);
		int ship1Height = RandomNumber.between(250, 350);
		addShip(ship1Position, ship1Width, ship1Height, color);

		Point ship2Position = new Point(420, 480);
		int ship2Width = RandomNumber.between(160, 240);
		int ship2Height = RandomNumber.between(250, 350);
		addShip(ship2Position, ship2Width, ship2Height, color);

		Point ship3Position = new Point(1020, 480);
		int ship3Width = RandomNumber.between(160, 200);
		int ship3Height = RandomNumber.between(250, 350);
		addShip(ship3Position, ship3Width, ship3Height, color);
	}

	private void placeTrees() {
		Point tree1Position = new Point(820, 425);
		int tree1Width = RandomNumber.between(5, 10);
		int tree1Height = RandomNumber.between(18, 27);
		int tree1Radius = RandomNumber.between(14, 20);
		addTree(tree1Position, tree1Width, tree1Height, tree1Radius);

		Point tree2Position = new Point(850, 420);
		int tree2Width = RandomNumber.between(5, 10);
		int tree2Height = RandomNumber.between(18, 27);
		int tree2Radius = RandomNumber.between(14, 20);
		addTree(tree2Position, tree2Width, tree2Height, tree2Radius);

		Point tree3Position = new Point(880, 425);
		int tree3Width = RandomNumber.between(5, 10);
		int tree3Height = RandomNumber.between(18, 27);
		int tree3Radius = RandomNumber.between(14, 20);
		addTree(tree3Position, tree3Width, tree3Height, tree3Radius);
	}

	private void drawShips(Color color) {
		for (Ship ship : this.ships) {
			ship.draw();
		}
	}

	private void drawTrees() {
		for (Tree tree : this.trees) {
			tree.draw();
		}
	}

	public void clear() {
		background = null;
		trees.clear();
		ships.clear();
	}

	public void draw() {
		if (background != null)
			background.draw();
		drawShips(Color.red);
		drawTrees();
	}

	public void showShips() {
		trees.clear();
		background = null;
		if (ships.isEmpty())
			placeShips(Color.red);
	}

	public void showTrees() {
		ships.clear();
		background = null;
		if (trees.isEmpty())
			placeTrees();
	}

	public void showEmpty() {
		ships.clear();
		trees.clear();
		background = new Background('A');
	}

	public void showDull() {
		background = new Background('B');
		placeShips(Color.LIGHT_GRAY);
	}

	public void showSunrise() {
		background = new Background('C');
		placeShips(Color.red);
		placeTrees();
	}

	public void showSunset() {
		background = new Background('D');
		placeShips(darkOrange);
		placeTrees();
	}
}