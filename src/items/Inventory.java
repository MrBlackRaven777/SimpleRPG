package items;
import java.util.ArrayList;

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
	
	public int getWeight() {
		return weight;
	}
	public static int getMaxweight() {
		return maxweight;
	}
	public String getItems() {
		String itemNames = "";
		for (Items item : items) {
			itemNames += item.name + " ("+ item.type + ")";
			itemNames += ", ";
		}
		itemNames = itemNames.substring(0, itemNames.length()-2) + ".";
		return itemNames;
	}
	
	public void checkWeight() {
		System.out.println("Inventory filled by "+this.weight + " of "+this.maxweight+". "
				+ "Free space is " + (this.maxweight-this.weight) + ".");
	}
}
