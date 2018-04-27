package main;
import Characters.Character;
import Characters.MainCharacter;
import items.Inventory;

import java.util.Scanner;

public class MessageHandler
{
    private boolean flag=false;

    public void startHandling(Inventory myInventory) {
        MainCharacter myChar = MainCharacter.getCharacter();
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        String arg = "";
        if (command.contains(" ")) {
            arg = command.substring(command.indexOf(" ")).trim();
            command = command.substring(0, command.indexOf(" "));
        }
        //System.out.println("Command - " + command + "; Arg - " + arg);
        switch (command){
            case "equip":
                System.out.println("You want to equip " + arg);
                myChar.equip(arg, myInventory);
                flag=true;
                break;
            case "walk":
                System.out.println("You want walk into " + arg);
                flag=false;
                break;
            case "pickup":
                System.out.println("You want to pickup " + arg);
                flag = true;
                break;
            case "inventory":
                System.out.println(myInventory);
                flag = true;
                break;
            default:
                System.out.println("I dont know what you want");
                flag=true;
                break;
        }

        if (this.flag==true){
            startHandling(myInventory);
        }
    }
}
