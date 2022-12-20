/**
 * 12.11.2021
 * Provides Player object(s).
 * @author Chidolue Zikora, Emmanuel Anokwuru
 * @version 1.0
 */

package testprogram;

public class Player implements Node {
	private int age;
	private String firstName;
	private String lastName;
	private String name;
	private int height;
	private int playerPosition;
	
	public Player(int age, int height, String firstName, String lastName, int position) {
		this.age = age;
		this.height = height;
		this.firstName = firstName;
		this.lastName = lastName;
		this.name = (firstName + " " + lastName);
		this.playerPosition = position;
	}
	
	@Override
	public int getKey() {
		return age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void printPlayerData() {
		System.out.println(name + "\t" + String.valueOf(age) + "	\t" + 
		String.valueOf(height) + "	\t" + String.valueOf(playerPosition)); 
	}
}