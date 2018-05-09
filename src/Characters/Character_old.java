package Characters;

import items.*;

public class Character_old
{


    //	static Inventory myInventory = new Inventory();
    public static String Name;
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

	private static Character_old MYCHAR = new Character_old();

    private Character_old()
	{
//        Name = name;
//        Map bodyParts = new HashMap <String, Items>();
//		Inventory myInventory = new Inventory();
//		System.out.println("Welcome to the World, " + this.name + "!");
//		Items sword = new SwordOfGreatPower();
//		myInventory.add(sword);
    }
    public static Character_old getCharacter(){
        return MYCHAR;
    }

    public boolean setCharacter(String name) {
        Name = name;
        this.hp = 10;
        this.defence = 0;
        this.damage = 2;
		return true;
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

//    public void equip(Inventory myInventory, String itemName)
//	{
//        if (myInventory.checkItem(itemName))
//		{
//            Items tempItem = myInventory.loadItem(itemName);
//			if (tempItem.equipped == false)
//			{
//				if (bodyPart(tempItem)==null)
//				{
//					String incrace = "(";
//                    if (tempItem.hp != 0)
//                        this.hp += tempItem.hp;
//                        incrace += "HP+" + tempItem.hp + ";";
//                    if (tempItem.damage != 0)
//                        this.damage += tempItem.damage;
//                        incrace += "Dmg+" + tempItem.damage + ";";
//                    if (tempItem.defence != 0)
//                        this.defence += tempItem.defence;
//                        incrace += "Def+" + tempItem.defence + ";";
//                //Опять же, как изучу словари, добавить замену пеметов в частях тела. пока что через Switch case
//
//
//					tempItem.equipped = true;
//					System.out.println("You equip " + tempItem.name + incrace);
//				}
//			}
//			else
//			{
//				System.out.println("Item " + tempItem.name + " already equipped");
//			}
//        }
//		else
//		{
//            System.out.println("You have no item named \"" + itemName + "\" in your inventory. Type \"inventory\" to see what actually you have.");
//        }
//	}
	
	public void unequip(Items item){
		if (item.equipped ==true){
			item.equipped = false;
			this.hp -= item.hp;
			this.damage -= item.damage;
			this.defence -= item.defence;
			System.out.println("Item " + item.name + " was unequiped.");
		} else {
			System.out.println(item.name + " not equipped");
		}
	}



//	private Items bodyPart(Items item)
//	{
//		//Возвращает часть тела, в которую должен встать item. в будущем надо будет заменить на map или collection, но я его пока не знаю
//		switch (item.bodyPart)
//		{
//			case 'h':
//				return this.head;
//			case 'b':
//                return this.body;
//			case 'l':
//                return this.leftHand;
//			case 'r':
//                return this.rightHand;
//			case 'o':
//                return this.leftHand;// || this.rightHand;
//			case 'g':
//                return this.legs;
//			case 't':
//                return this.belt;
//			default:
//				System.out.println("Error: item's body part not set");
//				return null;
//		}
//
//		}
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

