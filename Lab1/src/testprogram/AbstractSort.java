/**
 * 12.11.2021
 * Provides AbstractSort object(s).
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package testprogram;

import java.util.ArrayList;

public abstract class AbstractSort {
	protected int swaps = 0;
	protected int comparisons = 0;

	public void swap(ArrayList<Player> division, int left, int right) {
		Player temp = division.get(left);
		division.set(left, division.get(right));
		division.set(right, temp);
	}

	public void printList(ArrayList<Player> division) {
		System.out.println("Name" + "   \t\t\t" + "Age" + "   \t\t" + "Height" + "   	" + "Position\n");
		for (Player player : division) {
			player.printPlayerData();
		}
	}

	public void start() {
		swaps = 0;
		comparisons = 0;
		sortAlgorithm();
	}

	public abstract void sortAlgorithm();

	public int getSwaps() {
		return swaps;
	}

	public int getComparisons() {
		return comparisons;
	}

}
