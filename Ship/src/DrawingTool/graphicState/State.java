/**
 * Provides an abstract class, State.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool.graphicState;

import DrawingTool.Scene;

public abstract class State {
	protected Scene theme;
	protected static ShipsState ships;
	protected static TreesState trees;
	protected static EmptyState empty;
	protected static DullState dull;
	protected static SunriseState sunrise;
	protected static SunsetState sunset;

	public abstract State drawShips();

	public abstract State drawTrees();

	public abstract State drawEmpty();

	public abstract State drawDull();

	public abstract State drawSunrise();

	public abstract State drawSunset();
}