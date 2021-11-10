public class Thief extends Archetype {
    
    public Thief (String name, int damage, int pv, int initiative){
        this.name = name;
        this.damage = damage;
        this.pv = pv;
        this.initiative = initiative;
    }

    @Override
    public String toString() {
        return "Thief 7ATT 15PV 69INIT";
    }
}
