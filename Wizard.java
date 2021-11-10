public class Wizard extends Archetype {

    double boostMagic = 0.6 ;

    public Wizard (String name, int damage, int pv, int initiative){
        this.name = name;
        this.damage = damage;
        this.pv = pv;
        this.initiative = initiative;
    }

    void magicDamage (int magic_damage){
        damage += magic_damage * boostMagic;
    }

    @Override
    public String toString() {
        return "Wizard 9ATT 15PV 74INIT";
    }
}
