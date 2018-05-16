package Characters;

public class MonsterTemplate extends Monster{
    public MonsterTemplate(String name, int hp, int damage, int defence) {
        this.Name = name;
        this.hp = hp;
        this.damage = damage;
        this.defence = defence;
        this.alive = true;
        equipMonster();
    }
}
