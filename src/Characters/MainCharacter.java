package Characters;

import items.Inventory;

public class MainCharacter extends Person{
    private static MainCharacter myChar = new MainCharacter();
    private static Inventory myInventory;

    public static MainCharacter getCharacter() {
        return myChar;
    }

    private MainCharacter() {
    }

    public static void setMyChar(String name) {
        myChar.Name = name;
        myChar.hp = 10;
        myChar.damage = 2;
        myChar.defence = 5;
        myInventory = new Inventory();
    }

    public Inventory getInventory() {
        return myInventory;
    }

    @Override
    public String toString() {
        return "--------\nMy name is " + Name + " and i don't know what's happening.\nHP: " + hp + ";\nDamage: " + damage
                + ";\nDefence: " + defence + ";\nInventory: " + myInventory.getWeight() + "/" + myInventory.getMaxweight()
                + " (" + myInventory.getItemList().length + " item" + (myInventory.getItemList().length > 1 ? "s" : "") + ").\n------";
    }

    public void equip(String itemName) {
        super.equip(itemName, myInventory);
    }

    public void unequip(String itemName) {
        super.unequip(itemName, myInventory);
    }
}
