package main;

import java.util.Scanner;

import items.Inventory;
import items.SwordOfGreatPower;
import main.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("You are woke up in dark place. Wet stone walls around you blicking in the light of one candle standing in the middle o the room.");
		System.out.println("Suddenly black shadow stepped into light cirle. It was an old man in black mantle. His voice sounds like an old rusty door on a wind. He said:");
		System.out.println("- Hello, stranger. I'm an old magician Lortermpunkel. What is your name?");
		System.out.print("- ");
		String tempName = scan.next();
		Character myChar = new Character(tempName);
		System.out.println("- Nice to meet you, " + tempName + ". Welcome to my dungeon. I liked playing there when was a little boy.\n"
				+ "In this room I've cast my first fireball! But now it's very lonely here. Thats why i invited you to my place.\n"
				+ "I'm the host and you are my hostage HA-HA-HA... wait, wrong word... oh, right, GUEST, you are my GUEST, of course!\n"
				+ "Anyway, I want you to go to the another room. There are some items, that can be usefull there.");
		//TODO Type "pickup" to picking up the loot.
		Inventory myInventory = new Inventory();
		myInventory.add(new SwordOfGreatPower());
		System.out.println("You looked into the bag");
		//TODO Type "invent" to look into your inventory
		myInventory.printItems();
		myInventory.checkWeight();
	}

}
