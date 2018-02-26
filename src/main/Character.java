package main;

import items.Inventory;
import items.Items;
import items.SwordOfGreatPower;
import java.util.Scanner;
import items.*;

public class Character {


    //	static Inventory myInventory = new Inventory();
    public String name;
    private int hp;
    private int defence;
    private int damage;
    private String leftHand;
    private String rightHand;


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

    public void equip(Inventory myInventory, String itemName) {
        if (myInventory.checkItem(itemName)) {
            Items tempItem = myInventory.getItem(myInventory, itemName);
            String incrace = "";
            switch (tempItem.type.toLowerCase()) {
                case "weapon":
                    Weapon tempWeapon = (Weapon) tempItem;
                    this.damage += tempWeapon.damage;
                    incrace = "(Atk:+" + tempWeapon.damage + ")";
                    if (tempWeapon.hand == 'r')
                        this.rightHand = tempWeapon.name;
                    else if (tempWeapon.hand == 'l')
                        this.leftHand = tempWeapon.name;
                    else if (tempWeapon.hand == 'b')
                        this.leftHand = tempWeapon.name;
                    this.rightHand = tempWeapon.name;
                    break;
                case "armor":
                    Armor tempArmor = (Armor) tempItem;
                    this.defence += tempArmor.defence;
                    incrace = "(Def:+" + tempArmor.defence + ")";
                    break;
            }
            System.out.println("You equip " + tempItem.name + incrace);
        } else {
            System.out.println("You have no item named \"" + itemName + "\" in your inventory. Type \"inventory\" to see what actually there.");
        }

    }
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

