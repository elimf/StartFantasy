public class Archetype {
    protected static String name;
    protected static int damage;
    protected static int pv;
    protected static int initiative;

    static int takeDamage(int damage_receive,int pv){
         pv -= damage_receive;
        return pv;
    };
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        Archetype.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        Archetype.damage = damage;
    }
    public int getPv() {
        return pv;
    }
    public void setPv(int pv) {
        Archetype.pv = pv;
    }
    public int getInitiative() {
        return initiative;
    }
    public void setInitiative(int initiative) {
        Archetype.initiative = initiative;
    }
    
}
