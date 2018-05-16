package Characters;

import items.Inventory;
import items.Items;
import main.Loader;

public abstract class Monster extends Person implements Cloneable{

    private int maxItems = 3;
    private Inventory monsterInventory = new Inventory();

    @Override
    public Inventory getInventory() {
        return monsterInventory;
    }

    @Override
    public Monster clone() throws CloneNotSupportedException {
        return new MonsterTemplate(this.Name, this.hp, this.damage, this.defence);
    }

    protected void equipMonster() {
        for (int i = 0; i < maxItems; i++) {
            monsterInventory.add(Loader.getLoader().loadRandomItem());
        }
        for (String item :
                monsterInventory.getItemList()) {
            if (monsterInventory.getItem(item).equipped == false) {
                this.equip(item);
            }
        }
    }

    public void equip(String itemName) {
        if (monsterInventory.checkItem(itemName)) {
            Items tempItem = monsterInventory.getItem(itemName);
            this.damage += tempItem.damage;
            this.defence += tempItem.defence;
            this.hp += tempItem.hp;
            tempItem.equipped = true;
            bodyParts.put(tempItem.bodyPart, tempItem);
        } else {
            System.out.println("No item in monster's inventory");
        }
    }

    public void unequip(String itemName) {
        if (monsterInventory.checkItem(itemName)) {
            Items tempItem = monsterInventory.getItem(itemName);
            if (tempItem.equipped) {
                this.damage += tempItem.damage;
                this.defence += tempItem.defence;
                this.hp += tempItem.hp;
                tempItem.equipped = true;
                bodyParts.put(tempItem.bodyPart, tempItem);
            } else {
                System.out.println("Item " + tempItem.name + " is not equipped.");
            }
        } else {
            System.out.println("There is no item named " + itemName + " in monster's inventory.");
        }
    }
}
