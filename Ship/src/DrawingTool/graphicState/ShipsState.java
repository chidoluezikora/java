/**
 * Provides a Ships state.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool.graphicState;

import DrawingTool.Scene;

public class ShipsState extends State {
	private static ShipsState instance;

	private ShipsState(Scene theme) {
		this.theme = theme;
		ships = this;
	}
	
	public static ShipsState getInstance(Scene theme) {
		if ( instance == null ) {
			instance = new ShipsState(theme);
		}
		return instance;
	}

	@Override
	public State drawShips() {
		theme.clear();
		theme.showShips();
		return this;
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