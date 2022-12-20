/**
 * 08.12.2021
 * Provides Player object(s).
 * @author Emmanuel Anokwuru, Chidolue Zikora
 * @version 1.0
 */

package binaryTrees;

public class Player extends Node {
	private String lastName;
	private int age;

	public Player(String lastName, int age) {
		super(age);
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void printNodeData(int key) {
		System.out.println("Id : " + getName() + ", Age: " + getAge());
	}
}
