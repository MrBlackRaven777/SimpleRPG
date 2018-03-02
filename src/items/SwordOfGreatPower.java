package items;
import main.Character;
import items.Inventory;

public class SwordOfGreatPower extends Sword {

	public SwordOfGreatPower() {
//		Items SwordOfGreatPower = new SwordOfGreatPower();
		type = "Weapon";
		weaponType = "Sword";
		name = "Sword of Great Power";
		hand = 'r';

		damage = 10;
		weight = 5;
	}

	@Override
	void pickup() {
		System.out.println("You're picked up the " + name);
		
	}

	@Override
	void drop() {
		System.out.println("You're droped the " + name);

	}

	@Override
	void putOn() {
		// TODO Auto-generated method stub

	}

	@Override
	void takeOff() {
		// TODO Auto-generated method stub

	}

}
