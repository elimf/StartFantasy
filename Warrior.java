public class Warrior extends Archetype{

    int shield = 5;

    public Warrior (String name, int damage, int pv, int initiative){
        this.name = name;
        this.damage = damage;
        this.pv = pv;
        this.initiative = initiative;
    }

    void takeDamage(int damage_receive){
        pv -= (damage_receive - shield);
    };

    @Override
    public String toString() {
        return "Warrior 8ATT 15PV 99INIT";
    }
}