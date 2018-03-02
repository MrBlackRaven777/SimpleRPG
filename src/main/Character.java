package main;

import items.Inventory;
import items.Items;
import items.SwordOfGreatPower;
import java.util.Scanner;
import items.*;

public class Character
{


    //	static Inventory myInventory = new Inventory();
    public String name;
    private int hp;
    private int defence;
    private int damage;
    private Items leftHand;
    private Items rightHand;
	private Items bothHands;
	private Items head;
	private Items body;
	private Items legs;
	private Items belt;


    public Character(String name)
	{
        this.name = name;
//		Inventory myInventory = new Inventory();
//		System.out.println("Welcome to the World, " + this.name + "!");
//		Items sword = new SwordOfGreatPower();
//		myInventory.add(sword);
    }

    public int getHp()
	{
        return hp;
    }

    public void setHp(int hp)
	{
        this.hp = hp;
    }

    public int getDefence()
	{
        return defence;
    }

    public void setDefence(int defence)
	{
        this.defence = defence;
    }

    public int getDamage()
	{
        return damage;
    }

    public void setDamage(int damage)
	{
        this.damage = damage;
    }

    public void equip(Inventory myInventory, String itemName)
	{
        if (myInventory.checkItem(itemName))
		{
            Items tempItem = myInventory.getItem(myInventory, itemName);
			if (tempItem.equiped == false)
			{
				if (checkBody(tempItem))
				{
					String incrace = "";
					switch (tempItem.type.toLowerCase())
					{
						case "weapon":
							Weapon tempWeapon = (Weapon) tempItem;
							this.damage += tempWeapon.damage;
							incrace = "(Dmg:+" + tempWeapon.damage + ")";
							if (tempWeapon.hand == 'r')
								this.rightHand = tempWeapon;
							else if (tempWeapon.hand == 'l')
								this.leftHand = tempWeapon;
							else if (tempWeapon.hand == 'o')
								this.leftHand = tempWeapon;
							this.rightHand = tempWeapon;
							break;
						case "armor":
							Armor tempArmor = (Armor) tempItem;
							this.defence += tempArmor.defence;
							incrace = "(Def:+" + tempArmor.defence + ")";
							break;
						case "potion":
							System.out.println("You used the "+tempItem.name);
					}
					tempItem.equiped = true;
					System.out.println("You equip " + tempItem.name + incrace);
				}
			}
			else
			{
				System.out.println("Item " + tempItem.name + " already equiped");
			}
        }
		else
		{
            System.out.println("You have no item named \"" + itemName + "\" in your inventory. Type \"inventory\" to see what actually you have.");
        }
	}
	
	public void unequip(Items item){
		if (item.equiped==true){
			item.equiped = false;
			this.hp -= item.hp;
			this.damage -= item.damage;
			this.defence -= item.defence;
			System.out.println("Item " + item.name + " was unequiped.");
		} else {
			System.out.println(item.name + " not equiped");
		}
	}
	
	
	
	private boolean checkBody(Items item)
	{
		Items bodyPart;
		switch (item.bodyPart)
		{
			case 'h':
				bodyPart = this.head;
				break;
			case 'b':
				bodyPart = this.body;
				break;
			case 'l':
				bodyPart = this.leftHand;
				break;
			case 'r':
				bodyPart = this.rightHand;
				break;
			case 'o':
				bodyPart = this.bothHands;
				break;
			case 'g':
				bodyPart = this.legs;
				break;
			case 't':
				bodyPart = this.belt;
				break;
			default:
				System.out.println("Error: item's body part not set");
				return false;
		}
		if (bodyPart == null)
			return true;
		else
			return false;
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

