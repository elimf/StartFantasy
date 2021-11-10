public class Wizard extends Archetype{
    public Wizard (String name, int damage, int pv, int initiative){
        this.name = name;
        this.damage = damage;
        this.pv = pv;
        this.initiative = initiative;
    }

    @Override
    public String toString() {
        return "Wizard 9ATT 15PV 74INIT";
    }
    
}
