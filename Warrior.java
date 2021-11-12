public class Warrior extends Archetype{
        public Warrior (String name, int damage, int pv, int initiative){
        Archetype.name = nameWarrior;
        Archetype.damage = damageWarrior;
        Archetype.pv = pvWarrior;
        Archetype.initiative = initiativeWarrior;
        gen =nameWarrior+" "+ damageWarrior+" "+pvWarrior+" "+initiativeWarrior;
    }
    String nameWarrior = "Warrior";
    int damageWarrior = 100;
    int pvWarrior = 400;
    int initiativeWarrior = 6;
    String gen;
    

    public String toString() {
        return " name : "+ nameWarrior + " | Damage : " + damageWarrior+ " /100 |  pv : " + pvWarrior+ " /500 | initiative : " + initiativeWarrior + "/10.";
    }
}
