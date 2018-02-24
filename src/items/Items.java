package items;

public abstract class Items {

	public int weight;
	public String type;
	public String name;
	
	abstract void pickup();
	abstract void drop();
	abstract void putOn();
	abstract void takeOff();
	

}
