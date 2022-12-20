/**
 * Provides a Sunset state.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool.graphicState;

import DrawingTool.Scene;

public class SunsetState extends State {
	private static SunsetState instance;

	private SunsetState(Scene theme) {
		this.theme = theme;
		sunset = this;
	}

	public static SunsetState getInstance(Scene theme) {
		if (instance == null) {
			instance = new SunsetState(theme);
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
		return this;
	}
}