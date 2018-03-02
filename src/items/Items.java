package items;

public abstract class Items {

	public int weight;
	public int hp;
	public int damage;
	public int defence;
	
	public String type;
	public String name;
	public boolean equiped;
	public char bodyPart;//where item equiped, 'h'-head, 'b'-body, 'l'-left hand, 'r'-right hand, 'o'-bOth hands, 'g'-leGs, 't'-on belT(e.g. potions)
	
	abstract void pickup();
	abstract void drop();
	abstract void putOn();
	abstract void takeOff();
	

}
