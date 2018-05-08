package main;

import java.util.Scanner;

import Characters.Character;
import Characters.MainCharacter;
import items.Inventory;
import items.Items;
import items.ShieldOfGreatResponsibility;
import items.SwordOfGreatPower;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		// todo loading scripts from txt files

	}
	public static void main(String[] args) {

	    Loader loadGame = new Loader();
	    loadGame.setAllItems();

//		Scanner scan = new Scanner(System.in);
//        System.out.println("what's your name?");
//        MainCharacter.setMyChar(scan.nextLine());
//        MainCharacter myCharacter = MainCharacter.getCharacter();
//
//        myCharacter.getInventory().add(new SwordOfGreatPower());
//        System.out.println(myCharacter);
//        myCharacter.equip("Sword of Great Power");
//        System.out.println(myCharacter);
//        System.out.println(myCharacter.getInventory());
//
//        myCharacter.getInventory().add(new ShieldOfGreatResponsibility());
//        System.out.println(myCharacter.getInventory());
//        myCharacter.equip("Shield of Great Responsibility");
//        System.out.println(myCharacter);
//        System.out.println(myCharacter.getInventory());
//
//        myCharacter.unequip("Sword of Great Power");
//        System.out.println(myCharacter);
//        System.out.println(myCharacter.getInventory());




//		System.out.println("You are woke up in dark place. Wet stone walls around you blinking in the light of one candle standing in the middle o the room.");
//		System.out.println("Suddenly black shadow stepped into light cirle. It was an old man in black mantle. His voice sounds like an old rusty door on a wind. He said:");
//		System.out.println("- Hello, stranger. I'm an old magician Lortermpunkel. What is your name?");
//		System.out.print("- ");
//		String tempName = scan.next();
//		Character myChar = new Character(tempName);
//		System.out.println("- Nice to meet you, " + tempName + ". Welcome to my dungeon. I liked playing there when was a little boy.\n"
//				+ "In this room I've cast my first fireball! But now it's very lonely here. Thats why i invited you to my place.\n"
//				+ "I'm the host and you are my hostage HA-HA-HA... wait, wrong word... oh, right, GUEST, you are my GUEST, of course!\n"
//				+ "Anyway, I want you to go to the another room. There are some items, that can be usefull there.");
//		//TODO Type "pickup" to picking up the loot.
//		Inventory myInventory = new Inventory();
//		myInventory.add(new SwordOfGreatPower());
//		System.out.println("You looked into the bag");
//		//TODO Type "invent" to look into your inventory
//		myInventory.printItems();
//		myInventory.checkWeight();
//		System.out.println("Oh, great, now you have a sword! Equip them!");
//	 //TODO Type "equip ItemName" to equp item
////	    myChar.equip(myInventory, "Sword of Great Power");
//		System.out.println("Type equip <Item Name> to equip item from your inventory.");
//		MessageHandler msgHndl = new MessageHandler();
//		msgHndl.startHandling(myChar, myInventory);
//		System.out.println("Wow! You walk out!");
	}
}
