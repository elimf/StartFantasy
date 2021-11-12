public class Wizard extends Archetype{
    public Wizard (String name, int damage, int pv, int initiative){
        Archetype.name = nameWizard;
        Archetype.damage = damageWizard;
        Archetype.pv = pvWizard;
        Archetype.initiative = initiativeWizard;
        gen =nameWizard+" "+damageWizard+" "+pvWizard+" "+ initiativeWizard;
    }

    String nameWizard = "Wizard";
    int damageWizard = 90;
    int pvWizard = 200;
    int initiativeWizard = 4;
    String gen ;
    public String toString() {
        return "  name : "+ nameWizard + " | Damage : " + damageWizard+ " /100 |  pv : " + pvWizard+ " /500 | initiative : " + initiativeWizard + "/10.";
    }
    
}
