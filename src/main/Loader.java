package main;

import Characters.Monster;
import Characters.MonsterTemplate;
import items.Items;

import java.util.*;

import static java.lang.Thread.sleep;

public class Loader implements Runnable{
    private static Loader ourInstance = new Loader();

    private static ArrayList<String> allItems = new ArrayList<>();

    private static Map allMonsters = new HashMap<String, Monster>();

    public static Loader getLoader() {
        return ourInstance;
    }

    private Loader() {
    }

    @Override
    public void run() {
        Thread bar = new Thread(new loadingBar(Thread.currentThread()));
        bar.start();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loadAllItems();
        loadAllMonsters();
        System.out.println("Game was loaded");
    }

    private class loadingBar implements Runnable {
        Thread parentThread;
        loadingBar(Thread loadingThread) {
            parentThread = loadingThread;
        }

        @Override
        public void run() {
            System.out.print("Loading");
            while (parentThread.isAlive()) {
                System.out.print(".");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
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

    public void loadAllMonsters() {
        String[][] monstersSpecs = {{"Giant Orc", "20", "7", "5"}, {"Hobgoblin", "12", "5", "4"}};
        for (int i = 0; i < monstersSpecs.length; i++) {
            allMonsters.put(monstersSpecs[i][0], new MonsterTemplate(monstersSpecs[i][0], Integer.parseInt(monstersSpecs[i][1]),
                    Integer.parseInt(monstersSpecs[i][2]), Integer.parseInt(monstersSpecs[i][3])));
        }
    }

    public Monster getMonster(String monsterName) {
        if (!allMonsters.containsKey(monsterName)) {
            System.out.println("There is no monster called \"" + monsterName + "\"");
            return null;
        }
        try {
            return ((Monster) allMonsters.get(monsterName)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
