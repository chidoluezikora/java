/**
 * 08.12.2021
 * Provides main.
 * @author Emmanuel Anokwuru, Chidolue Zikora
 * @version 1.0
 */

package binaryTrees;

import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		Random random = new Random();
		SortedBinaryTree<Node> tree = new SortedBinaryTree<Node>();
		SortedBinaryTree<Node> tree1 = new SortedBinaryTree<Node>();

		while (number <= 101) {
			int randomAge = random.nextInt(100)+1;
			Player player = new Player("Emma", randomAge);
			tree.insert(player);
			System.out.println(number + ":" + player.getName() + " " + player.getAge());
			number++;
		}
		System.out.println("\n Tree2");
		number = 1;
		while (number <= 10) {
			int randomAge1 = random.nextInt(500) + 1;
			Player player1 = new Player("Emmanuel", randomAge1);
			tree1.insert(player1);
			System.out.println(number + ":" + player1.getName() + " " + player1.getAge());
			number++;
		}
		System.out.println("\n iterator Start For node tree");
		Iterator<Node> ptree = tree.iterator();
		Iterator<Node> ptree1 = tree1.iterator();

		int counter = 1;


		System.out.println("\n -----For first twenty of -----");
		number = 1;
		while (ptree.hasNext()) {
			if (counter <= 20) {
				Node player = ptree.next();
				System.out.print(number + ":" + player.getKey() + ",");
				number++;
			} else {
				ptree.next();
			}
			counter++;
		}
		ptree = tree.iterator();
		System.out.println("\n-----For each fifths -----");
		counter = 1;
		while (ptree.hasNext()) {
			if (counter % 5 == 0) {
				Node player = ptree.next();
				System.out.print(number + ":" + player.getKey() + ",");
			} else {
				ptree.next();
			}
			counter++;
			number++;
		}
		ptree = tree.iterator();
		System.out.println("\n-----For the last twenty -----");
		counter = number= 1;
		while (ptree.hasNext()) {
			if (counter > 80) {
				Node player = ptree.next();
				System.out.print(number + ":" + player.getKey() + ",");
			} else {
				ptree.next();
			}
			counter++;
			number++;
		}
		System.out.println("\n-----Second Tree -----");
		counter=1;
		while (ptree1.hasNext()) {
			if (counter <= 20) {
				Node player = ptree1.next();
				System.out.print( player.getKey() + ",");

				number++;
			} else {
				ptree1.next();
			}
			counter++;
		}
		tree.addTree(tree1);
		System.out.println("\n-----Printing first tree after merging -----");
		counter=1;
		ptree = tree.iterator();
		while (ptree.hasNext()) {
			if (counter <= 120) {
				Node player = ptree.next();
				System.out.print( player.getKey() + ",");
			} else {
				ptree.next();
			}
			counter++;
		}
		
	}

}
