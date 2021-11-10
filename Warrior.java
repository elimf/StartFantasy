public class Warrior extends Archetype{

    public Warrior (String name, int damage, int pv, int initiative){
        this.name = name;
        this.damage = damage;
        this.pv = pv;
        this.initiative = initiative;
    }

    @Override
    public String toString() {
        return "Warrior 8ATT 15PV 99INIT";
    }
}