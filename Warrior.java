public class Warrior extends Archetype{
        public Warrior (String name, int damage, int pv, int initiative){
        Archetype.name = nameWarrior;
        Archetype.damage = damageWarrior;
        Archetype.pv = pvWarrior;
        Archetype.initiative = initiativeWarrior;
        Archetype.dodge = dodgeWarrior;
        Archetype.shield =shieldWarrior;
        Archetype.damageAmplified = damageAmplifiedWarrior;
        Archetype.damageCritikal =damageCritikalWarrior;
        gen=nameWarrior+" "+damageWarrior+" "+pvWarrior+" "+initiativeWarrior+" "+dodgeWarrior+" "+shieldWarrior+" "+damageAmplifiedWarrior+" "+damageCritikalWarrior;
    }
    String nameWarrior = "Warrior";
    int damageWarrior = addDamage();
    int pvWarrior = addPv();
    int initiativeWarrior = addIniatiative();
    int dodgeWarrior =0;
    boolean shieldWarrior= addShield();
    boolean damageAmplifiedWarrior= false;
    boolean damageCritikalWarrior =false;
    String gen;
    

    public String toString() {
        return "  name : "+ nameWarrior + " | Damage : " + damageWarrior+ " /100 |  pv : " + pvWarrior+ " /500 | initiative : " +" /10 | Dodge : "+ dodgeWarrior+"/150 "+" |Shield : "+shieldWarrior+" | damage Amplified :  "+damageAmplifiedWarrior +" | Damage Critikal : "+ damageCritikalWarrior; 
    }
}
