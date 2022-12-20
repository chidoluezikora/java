/**
 * 12.11.2021
 * Provides a test program.
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package testprogram;

import java.util.ArrayList;

public class TestProgram {
	private static Division division1 = new Division();
	private static ArrayList<Player> playerDivision = division1.getDivision();
	private static QuickSort quickSorter = new QuickSort(playerDivision);
	private static SelectionSort selectionSorter = new SelectionSort(playerDivision);
	private static int ssCounter = 0;
	private static int scCounter = 0;
	private static int qsCounter = 0;
	private static int qcCounter = 0;
	private static int qCounter = 0;
	private static int sCounter = 0;

	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		System.out.println("\n\t\t\t-----Quick Sort Pre-sorting-----\n");
		quickSorter.printList(playerDivision);
		
		System.out.println("\n\t\t\t-----Selection Sort Pre-sorting-----\n");
		selectionSorter.printList(playerDivision);
		
		while (sCounter <= 1000) {
			selectionSorter.start();
			sCounter++;
			ssCounter += selectionSorter.getSwaps();
			scCounter += selectionSorter.getComparisons();
		}
		
		while (qCounter <= 1000) {
			quickSorter.start();
			qCounter++;
			qsCounter += quickSorter.getSwaps();
			qcCounter += quickSorter.getComparisons();
		}
		
		System.out.println("\n\t\t\t-----Quick Sort Post-sorting-----\n");
		quickSorter.printList(playerDivision);
		System.out.println("\nQuicksort Swap counter: " + qsCounter + "\nQuicksort Comparison counter: " + qcCounter + "\nQuicksort Average Swap: "
		+ qsCounter/qCounter + "\nQuicksort Average Comparisons: "+ qcCounter/qCounter);
		
		System.out.println("\n\t\t\t-----Selection Sort Post-sorting-----\n");
		selectionSorter.printList(playerDivision);
		System.out.println("\nSelection Swap counter: " + ssCounter + "\nSelection Comparison counter: " + scCounter
				+ "\nSelection Sort Average Swap: " + ssCounter/sCounter + "\nSelection Sort Average Comparisons: "+ scCounter/sCounter);
	}
}