/**
 * Provides a Trees state.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool.graphicState;

import DrawingTool.Scene;

public class TreesState extends State {
	private static TreesState instance;

	private TreesState(Scene theme) {
		this.theme = theme;
		trees = this;
	}

	public static TreesState getInstance(Scene theme) {
		if (instance == null) {
			instance = new TreesState(theme);
		}
		return instance;
	}

	@Override
	public State drawShips() {
		theme.clear();
		theme.showShips();
		return ShipsState.getInstance(theme);
	}

	@Override
	public State drawTrees() {
		theme.clear();
		theme.showTrees();
		return this;
	}

	@Override
	public State drawEmpty() {
		theme.clear();
		theme.showEmpty();
		return EmptyState.getInstance(theme);
	}

	@Override
	public State drawDull() {
		theme.clear();
		theme.showDull();
		return DullState.getInstance(theme);
	}

	@Override
	public State drawSunrise() {
		theme.clear();
		theme.showSunrise();
		return SunriseState.getInstance(theme);
	}

	@Override
	public State drawSunset() {
		theme.clear();
		theme.showSunset();
		return SunsetState.getInstance(theme);
	}
}