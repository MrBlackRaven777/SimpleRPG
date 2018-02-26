package main;
import items.Inventory;

import java.util.Scanner;

public class MessageHandler
{
	private boolean flag=false;
	
	public void startHandling(Character myChar, Inventory myInventory) {
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
			System.out.println("You want to equip "+arg);
			myChar.equip(myInventory, arg);
			flag=true;
			break;
		case "walk":
			System.out.println("You want walk into "+arg);
			flag=false;
			break;
		case "pickup":
			System.out.println("You want to pickup " + arg);
			flag = true;
			break;
        case "inventory":
            myInventory.printItems();
            break;
		default:
			System.out.println("I dont know what you want");
			flag=true;
			break;
	}
	
	if (this.flag==true){
		startHandling(myChar, myInventory);
	}
}
}
