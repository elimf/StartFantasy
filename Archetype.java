public class Archetype {
    protected static String name;
    protected static int damage;
    protected static int pv;
    protected static int initiative;

    void takeDamage(int damage_receive){
        pv -=damage_receive;
    };
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getPv() {
        return pv;
    }
    public void setPv(int pv) {
        this.pv = pv;
    }
    public int getInitiative() {
        return initiative;
    }
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    
}
