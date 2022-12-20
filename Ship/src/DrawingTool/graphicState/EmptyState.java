/**
 * Provides an Empty state.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool.graphicState;

import DrawingTool.Scene;

public class EmptyState extends State {
	private static EmptyState instance;

	private EmptyState(Scene theme) {
		this.theme = theme;
		empty = this;
	}
	
	public static EmptyState getInstance(Scene theme) {
		if ( instance == null ) {
			instance = new EmptyState(theme);
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
		return TreesState.getInstance(theme);
	}

	@Override
	public State drawEmpty() {
		theme.clear();
		theme.showEmpty();
		return this;
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