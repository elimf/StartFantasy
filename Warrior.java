public class Warrior extends Archetype{
        public Warrior (String name, int damage, int pv, int initiative){
        Archetype.name = nameWarrior;
        Archetype.damage = damageWarrior;
        Archetype.pv = pvWarrior;
        Archetype.initiative = initiativeWarrior;
        Archetype.shield =shieldWarrior;
        gen =nameWarrior+" "+ damageWarrior+" "+pvWarrior+" "+initiativeWarrior+ " "+ shieldWarrior;
    }
    String nameWarrior = "Warrior";
    int damageWarrior = addDamage();
    int pvWarrior = addPv();
    int initiativeWarrior = addIniatiative();
    int shieldWarrior= addShield();
    String gen;
    

    public String toString() {
        return " name : "+ nameWarrior + " | Damage : " + damageWarrior+ " /300 |  pv : " + pvWarrior+ " /1000 | initiative : " + initiativeWarrior + " /10 | Shield "+ shieldWarrior +" /500 "; 
    }
}
