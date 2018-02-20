package items;

public abstract class Items {

	static int weight;
	static String type;
	static String name;
	
	abstract void pickup();
	abstract void drop();
	abstract void putOn();
	abstract void takeOff();
	

}
