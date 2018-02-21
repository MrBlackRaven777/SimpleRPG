package main;

import items.Inventory;
import items.Items;
import items.SwordOfGreatPower;
import java.util.Scanner;

public class Character{
	
	
//	static Inventory myInventory = new Inventory();
	public String name;
	private int hp;
	private int defence;
	private int damage;
	
	
	public Character(String name) {
		this.name = name;
//		Inventory myInventory = new Inventory();
//		System.out.println("Welcome to the World, " + this.name + "!");
//		Items sword = new SwordOfGreatPower();
//		myInventory.add(sword);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the name of your character without spaces: ");
//		String tempName = scan.next();
//		scan.close();
//		Character myChar = new Character(tempName);
//		System.out.println("In my inventory: " + myInventory.getItems());
//		myInventory.checkWeight();
//
//	}

}
