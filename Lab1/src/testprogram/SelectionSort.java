/**
 * 12.11.2021
 * Provides SelectionSort object(s).
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package testprogram;

import java.util.ArrayList;

public class SelectionSort extends AbstractSort {
	private ArrayList<Player> division;
	
	public SelectionSort(ArrayList<Player> division) {
		this.division=division;
	}
	
	public void selectionSort(ArrayList<Player> division) {
		for(int i=0; i < division.size(); i++) {
			int minIndex = i;
			int minValue = division.get(i).getKey();
			
			for(int j = i + 1; j < division.size(); j++) {
				if (division.get(j).getKey() < minValue) {
					minIndex = j;
					minValue = division.get(j).getKey();
					comparisons++;
				}
			}
			swap(division, i ,minIndex);
			swaps++;
		}
	}

	@Override
	public void sortAlgorithm() {
		selectionSort(division);
		
	}
	
}
