package items;
import Characters.MainCharacter;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
	
	private int weight;
	private int maxweight = 20;
	private ArrayList<Items> items = new ArrayList<>();
	
	public Inventory() {
		this.weight = 0;
	}
	
	public void add(Items item) {
        boolean aloud = this.equals(MainCharacter.getCharacter().getInventory());
//        System.out.println("aloud=" + aloud);
        if (this.weight + item.weight <= maxweight) {
            this.weight += item.weight;
            items.add(item);
            if (aloud) {
                System.out.println(item.name + " added to your inventory.");
            }

        } else {
            if (aloud) {
                System.out.println("Not enough storage.");
            }
        }
	}
	
	public void remove(Items item) {
        boolean aloud = this.equals(MainCharacter.getCharacter().getInventory());
		items.remove(item);
		this.weight -= item.weight;
        if (aloud) {
            System.out.println(item.name + " was removed from inventory.");
        }
    }
	
	public int getWeight() {
		return this.weight;
	}
	public int getMaxweight() {
		return this.maxweight;
	}

	public String toString() {
	    if (this.equals(MainCharacter.getCharacter().getInventory())) { //когда сдеаю комнату, у нее тоже сделать инвентарь и туда ссыпать предметы с монстров
            String itemNames = "";
            for (Items item : items) {
                //			itemNames += item.name + " ("+ item.type + ")";
                itemNames += item.toString();
                itemNames += ", ";
            }
            itemNames = itemNames.substring(0, itemNames.length() - 2) + ".";
            return "In your inventory: " + itemNames + " Weight: " + this.weight + "/" + maxweight + ".";
        } else {
	        return "You can't see other's inventory.";
        }
	}

	public String[] getItemList() {
		String[] itemList = new String [items.size()];
		int i=0;
		for (Items item : items) {
			itemList[i] = item.name;
			i++;
		}
		return itemList;
	}
	public boolean checkItem(String itemName){
	  return Arrays.asList(getItemList()).contains(itemName);
	}

	public Items getItem(String itemName){
		int num = -1;
		for(Items item : items){
			if(item.name.equals(itemName)){
				num=items.indexOf(item);
				}
		}
		return items.get(num);
	}
	
	public void checkWeight() {
		System.out.println("Inventory filled by " + this.weight + " of " + this.maxweight +
                ". Free space is " + (this.maxweight-this.weight) + ".");
	}

	public void test(){
        String itemNames = "";
        for (Items item : items) {
            //			itemNames += item.name + " ("+ item.type + ")";
            itemNames += item.toString();
            itemNames += ", ";
        }
        itemNames = itemNames.substring(0, itemNames.length() - 2) + ".";
        System.out.println("In monster's inventory: " + itemNames + " Weight: " + this.weight + "/" + maxweight + ".");
	}
}
