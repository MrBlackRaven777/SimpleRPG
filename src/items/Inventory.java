package items;
import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
	
	private int weight;
	private static int maxweight = 20;
	private ArrayList<Items> items = new ArrayList<>();
	
	public Inventory() {
		this.weight = 0;
	}
	
	public void add(Items item) {
		if (this.weight+item.weight>maxweight) {
			System.out.println("Not enough storage.");
		}
		else {
			this.weight += item.weight;
			items.add(item);
			System.out.println(item.name + " added to inventory.");
		}
	}
	
	public void remove(Items item) {
		items.remove(item);
		this.weight -= item.weight;
		System.out.println(item.name + " was removed from inventory.");
	}
	
//	public int getWeight() {
//		return weight;
//	}
//	public static int getMaxweight() {
//		return maxweight;
//	}

	public String toString() {
		String itemNames = "";
		for (Items item : items) {
//			itemNames += item.name + " ("+ item.type + ")";
			itemNames += item.toString();
			itemNames += ", ";
		}
		itemNames = itemNames.substring(0, itemNames.length()-2) + ".";
		return "In your inventory: " + itemNames;
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
}
