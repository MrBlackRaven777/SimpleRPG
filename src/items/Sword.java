package items;

public abstract class Sword extends Weapon {

	//static char hand;

    @Override
    public String origin() {
        return super.origin() + "Sword->" + this.name;
    }
}
