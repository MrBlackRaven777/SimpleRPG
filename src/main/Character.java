package main;

import items.Inventory;
import items.Items;
import items.SwordOfGreatPower;
import java.util.Scanner;

public class Character extends Inventory{
	
	static Inventory myInventory = new Inventory();
	private String name;
	
	public Character(String name) {
		this.name = name;
		System.out.println("Welcome to the World, " + this.name + "!");
		Items sword = new SwordOfGreatPower();
		myInventory.add(sword);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of your character without spaces: ");
		String tempName = scan.next();
		scan.close();
		Character myChar = new Character(tempName);
		System.out.println("In my inventory: " + myInventory.getItems());
		myInventory.checkWeight();

	}

}
