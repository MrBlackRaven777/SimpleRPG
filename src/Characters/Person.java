package Characters;

import items.*;

import java.util.HashMap;
import java.util.Map;

//Может быть когда-нибудь попробовать сделать инвентарь не с map, а с enum

public abstract class Person {
    protected String Name;
    protected int hp;
    protected int defence;
    protected int damage;
    private static Map<BodyParts, Items> bodyParts = new HashMap<>();

    public Person() {
//        String[] parts = {"head", "body", "leftHand", "rightHand", "bothHands", "legs", "belt"};
        for (BodyParts p: BodyParts.values()) {
            bodyParts.put(p, null);
        }
    }

    public void equip(String itemName, Inventory charInventory) {
        if (charInventory.checkItem(itemName)) {
            Items tempItem = charInventory.getItem(itemName);
            if (bodyParts.get(tempItem.bodyPart) == null) {
                if (!tempItem.equipped) {
                    String crutch = tempItem.toString();//костыль нужен, чтобы при выводе на консоль только что надетого предмета, перед ним еще не писалось equipped, мне так не красиво
                    this.damage += tempItem.damage;
                    this.defence += tempItem.defence;
                    this.hp += tempItem.hp;
                    tempItem.equipped = true;
                    bodyParts.put(tempItem.bodyPart, tempItem);
                    System.out.println(crutch + " was equipped.");
                } else {
                    System.out.println("Item \"" + tempItem.name + "\" has already equipped");
                }
            } else {
                System.out.println("You have already item \"" + bodyParts.get(tempItem.bodyPart) + "\" there.");
            }

        } else {
            System.out.println("No item \"" + itemName + "\" into inventory.");
        }
    }

    public void unequip(String itemName, Inventory charInventory) {
        if (charInventory.checkItem(itemName)) {
            Items tempItem = charInventory.getItem(itemName);
            if (tempItem.equipped) {
                this.damage -= tempItem.damage;
                this.defence -= tempItem.defence;
                this.hp -= tempItem.hp;
                tempItem.equipped = false;
                bodyParts.put(tempItem.bodyPart, null);
                System.out.println(tempItem + " was unequipped.");
            } else {
                System.out.println("Item \"" + tempItem.name + "\" has already unequipped");
            }
        } else {
            System.out.println("No item \"" + itemName + "\" into inventory.");
        }
    }
}
