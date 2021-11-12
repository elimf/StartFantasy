public class Thief extends Archetype {
    public Thief (String name, int damage, int pv, int initiative){
        Archetype.name = nameThief;
        Archetype.damage = damageThief;
        Archetype.pv = pvThief;
        Archetype.initiative = initiativeThief;
        Archetype.dodge = dodgeThief;
        Archetype.damageCritikal =damageCritikalThief;
        gen=nameThief+" "+damageThief+" "+pvThief+" "+initiativeThief+" "+dodgeThief+" "+damageCritikalThief;
    }
    String nameThief= "Thief";
    int damageThief= addDamage();
    int pvThief = addPv();
    int initiativeThief = addIniatiative();
    int dodgeThief= addShield();
    boolean damageCritikalThief= addDamageCritikal();
    String gen;

    
    public String toString() {
        return "Name : "+nameThief+"| Damage :  "+damageThief+" /300 | Pv :  "+pvThief+" /1000| Iniatiative : "+initiativeThief+ " /10 | Dodge : "+ dodgeThief+"/150 "+" | Damage Critikal : "+ damageCritikal; 
    }
}
