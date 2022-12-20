/**
 * 12.11.2021
 * Provides Division object(s).
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package testprogram;

import java.util.ArrayList;

public class Division {
	
	private ArrayList <Player> division;
	
	public Division () {
		division = new ArrayList <Player>();
		addPlayers();
	}
	
	public void add(Player player) {
		division.add(player);
	}
	
	public void printList() {
		System.out.println("Name" + "   \t\t\t" + "Age" + "   \t\t" + 
				"Height"+  "   	" + "Position\n");
		for(Player player: division) {
			player.printPlayerData();
		}
	}
	
	public Player get(int number) {
		return division.get(number);
	}

	public int size() {		
		return division.size();
	}
	
	public void addPlayers() {
		Player player1 = new Player(15, 178, "Mohammad", "Salman   ", 11);
		Player player2 = new Player(19, 183,  "Chidolue", "Zikora   ", 4);
		Player player3 = new Player(25, 182, "Ebere", "Nwabiora   ", 5);
		Player player4 = new Player(22, 176, "Nihat", "Hasanli   ", 7);
		Player player5 = new Player(20, 172, "Fabiane", "Mendes   ",9);
		Player player6 = new Player(17, 174, "Raisul", "Hasan    ", 8);
		Player player7 = new Player(23, 167, "Rediet", "Franco   ", 6);
		Player player8 = new Player(23, 180, "Emmanuel", "Anokwuru", 2);
		Player player9 = new Player(33, 177, "Celestine", "Machucha", 1);
		Player player10 = new Player(24, 170, "Eliyas", "Tadasse   ", 3);
		Player player11 = new Player(18, 171, "Quan", "Phan        ", 10);
		division.add(player1);
		division.add(player2);
		division.add(player3);
		division.add(player4);
		division.add(player5);
		division.add(player6);
		division.add(player7);
		division.add(player8);
		division.add(player9);
		division.add(player10);
		division.add(player11);
	}
	
	public int indexOf(Player player) {
		return division.indexOf(player);
	}
	
	public ArrayList<Player> getDivision() {
		return division;
	}
	
	public Division getDivisionDivForm() {
		return this;
	}
}