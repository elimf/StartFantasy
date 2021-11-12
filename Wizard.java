public class Wizard extends Archetype{
    public Wizard (String name, int damage, int pv, int initiative){
        Archetype.name = nameWizard;
        Archetype.damage = damageWizard;
        Archetype.pv = pvWizard;
        Archetype.initiative = initiativeWizard;
        Archetype.damageAmplified =damageAmplifiedWizard;
        gen =nameWizard+" "+damageWizard+" "+pvWizard+" "+ initiativeWizard+" "+damageAmplifiedWizard;
    }

    String nameWizard = "Wizard";
    int damageWizard = addDamage();
    int pvWizard = addPv();
    int initiativeWizard = addIniatiative();
    boolean damageAmplifiedWizard= addDamageAmplified();
    String gen ;
    public String toString() {
        return "  name : "+ nameWizard + " | Damage : " + damageWizard+ " /100 |  pv : " + pvWizard+ " /500 | initiative : " + initiativeWizard + "/10 | Damage Amplified :"+ damageAmplifiedWizard;
    }
    
}
