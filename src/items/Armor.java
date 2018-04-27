package items;

public abstract class Armor extends Items{


    @Override
    public String toString() {
        return (this.equipped ? "(equipped)" : "") + this.name + "(Def" + chooseSign(defence) + ";HP" + chooseSign(hp) + ")";
    }
}
