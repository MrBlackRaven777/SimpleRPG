package main;

import items.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Loader {
    private static Loader ourInstance = new Loader();

    private static ArrayList<String> allItems = new ArrayList<>();

    public static Loader getLoader() {
        return ourInstance;
    }

    private Loader() {
    }

    public void loadAllItems() {
        //TODO load items from xml file
        String[] tempList = {"SwordOfGreatPower", "ShieldOfGreatResponsibility", "MithrilCoat", "SlamOfGrandTournaments", "PantsOfEqualDimensions"};
        allItems.addAll(Arrays.asList(tempList));
    }

    public Items loadItem(String itemName) {
        try {
            Class tmpClass = Class.forName("items." + itemName);
            Object tmpObj = tmpClass.newInstance();
            Items item = (Items) tmpObj;
            return item;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Can't load item \"" + itemName + "\"");
            return null;
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
    }

    public Items loadRandomItem() {
        Items item = loadItem(allItems.get(new Random().nextInt(allItems.size())));
        return item;
    }
}
