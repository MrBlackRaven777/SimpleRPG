package main;

import items.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Loader_old {
    //Class that will load content from xml, now it's just contain links for auxiliary classes
    public static ArrayList <Items> allItems = new ArrayList<>();
    private static String[] itemsList = {"SwordOfGreatPower", "ShieldOfGreatResponsibility", "MithrilCoat", "SlamOfGrandTournaments", "PantsOfEqualDimensions"};
    private int maxItems = 2;

    public void setAllItems() {

        for (int i = 0; i < maxItems; i++) {
            try {
                Class c = Class.forName("items." + itemsList[new Random().nextInt(itemsList.length)]);
                Object o = c.newInstance();
                Items item = (Items) o;
                System.out.println(item);
                allItems.add(item);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

//        try {
//            Class c = Class.forName("items.SwordOfGreatPower");
//            Object i = c.newInstance();
//            Items f = (Items) i;
//            System.out.println(f);
//        } catch (ClassNotFoundException e) {
//            e.getStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }

//        for (int i = 0; i < 3; i++) {
//            allItems.add(Class.forName("SwordOfGreatPower"));
//        }
//        for (Class i :
//                allItems) {
//            System.out.println(i.name);
//        }

//        allItems.add(new S    hieldOfGreatResponsibility());
//        allItems.add(s);
//        for (Items c:allItems) {
//            System.out.println(c.name);
//        }

    }
}
