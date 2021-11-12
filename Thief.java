public class Thief extends Archetype {
    public Thief (String name, int damage, int pv, int initiative, boolean dodge, boolean shield, boolean damageAmplified, boolean damageCritikal){
        Archetype.name = nameThief;
        Archetype.damage = damageThief;
        Archetype.pv = pvThief;
        Archetype.initiative = initiativeThief;
        Archetype.dodge = dodgeThief;
        Archetype.shield=shieldThief;
        Archetype.damageAmplified =damageAmplifiedThief;
        Archetype.damageCritikal =damageCritikalThief;
        gen=nameThief+" "+damageThief+" "+pvThief+" "+initiativeThief+" "+dodgeThief+" "+shieldThief+" "+damageAmplifiedThief+" "+damageCritikalThief;
    }
    String nameThief= "Thief";
    int damageThief= addDamage();
    int pvThief = addPv();
    int initiativeThief = addIniatiative();
    boolean dodgeThief= addDodge();
    boolean shieldThief = false;
    boolean damageAmplifiedThief=false;
    boolean damageCritikalThief= addDamageCritikal();
    String gen;

    
    public String toString() {
        return "Name : "+nameThief+"| Damage :  "+damageThief+" /300 | Pv :  "+pvThief+" /1000| Iniatiative : "+initiativeThief+ " /10 | Dodge : "+ dodgeThief+"/150 "+" |Shield : "+shieldThief+" | damage Amplified :  "+damageAmplified +" | Damage Critikal : "+ damageCritikal; 
    }
}
