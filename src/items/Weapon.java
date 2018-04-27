package items;

public abstract class Weapon extends Items {

	@Override
	public String origin() {
		return super.origin() + "Weapon->";
	}

	@Override
	public String toString() {
		return (this.equipped ? "(equipped)" : "") + this.name + "(Dmg" + chooseSign(damage) + ";HP" + chooseSign(hp) + ")";
	}
}
