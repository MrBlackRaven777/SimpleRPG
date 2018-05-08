package items;
import Characters.*;

public abstract class Items {

	public int weight;
	public int hp;
	public int damage;
	public int defence;

	public String name;
	public boolean equipped;
	public BodyParts bodyPart;

//	public abstract Items getInstance();

//	abstract void pickup();
//	abstract void drop();

    public String origin() {
		return "Item->";
	}

	protected String chooseSign(Object number) {
    	try {
			if ((Integer) number >= 0) {
				return "+" + number;
			} else {
				return "" + number;
			}
		} catch (Exception e) {
			System.out.println("Exception:" + e);
    		return "+" + number;
			}
	}

}
