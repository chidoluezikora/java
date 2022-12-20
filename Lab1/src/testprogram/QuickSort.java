/**
 * 12.11.2021
 * Provides QuickSort object(s).
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package testprogram;

import java.util.ArrayList;

public class QuickSort extends AbstractSort {
	private ArrayList<Player> division;

	public QuickSort(ArrayList<Player> division) {
		this.division = division;
	}

	public void quickSort(ArrayList<Player> division, int start, int end) {
		if (start < end) {
			int right = start;
			int left = end;
			moveTowards(division, right, left);
			quickSort(division, start + 1, left);
			quickSort(division, right + 1, end - 1);
		}
	}

	public void moveTowards(ArrayList<Player> division, int right, int left) {
		int median = getMedian(division);
		Player mid = division.get(median);
		while (right < left) {
			while (division.get(right).getKey() < mid.getKey()) {
				comparisons++;
				right = right + 1;
			}
			while (division.get(left).getKey() > mid.getKey()) {
				comparisons++;
				left = left - 1;
			}
			if (right <= left) {
				comparisons++;
				swap(division, right, left);
				swaps++;
				right = right + 1;
				left = left - 1;
			}
			comparisons++;
		}
	}
	
	public void swap(ArrayList<Player> division, int left, int right) {
		Player temp = division.get(left);
		division.set(left, division.get(right));
		division.set(right, temp);
	}

	public void printList() {
		System.out.println("Name   \t\t\tAge   \t\tHeight   	Position\n");
		for (Player player : division) {
			player.printPlayerData();
		}
	}
	
	public int getMedian(ArrayList<Player> division) {
		int median = (division.size() - 1) / 2;
		return median;
	}

	public int getComparisons() {
		return comparisons;
	}
	
	public int getSwaps() {
		return swaps;
	}

	@Override
	public void sortAlgorithm() {
		quickSort(division, 0, division.size() - 1);
	}
}
