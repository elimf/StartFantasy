public class Wizard extends Archetype{
    public Wizard (String name, int damage, int pv, int initiative){
        Archetype.name = nameWizard;
        Archetype.damage = damageWizard;
        Archetype.pv = pvWizard;
        Archetype.initiative = initiativeWizard;
        Archetype.dodge=dodgeWizard;
        Archetype.shield =shieldWizard;
        Archetype.damageAmplified =damageAmplifiedWizard;
        Archetype.damageCritikal=damageCritikalWizard;gen=nameWizard+" "+damageWizard+" "+pvWizard+" "+initiativeWizard+" "+dodgeWizard+" "+shieldWizard+" "+damageAmplifiedWizard+" "+damageCritikalWizard;
    }

    String nameWizard = "Wizard";
    int damageWizard = addDamage();
    int pvWizard = addPv();
    int initiativeWizard = addIniatiative();
    int dodgeWizard =0;
    boolean shieldWizard = false;
    boolean damageAmplifiedWizard= addDamageAmplified();
    boolean damageCritikalWizard =false;
    String gen ;
    public String toString() {
        return "  name : "+ nameWizard + " | Damage : " + damageWizard+ " /100 |  pv : " + pvWizard+ " /500 | initiative : " +" /10 | Dodge : "+ dodgeWizard+"/150 "+" |Shield : "+shieldWizard+" | damage Amplified :  "+damageAmplifiedWizard +" | Damage Critikal : "+ damageCritikalWizard; 
    }
    
}
