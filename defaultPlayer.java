
import java.util.Scanner;


public class defaultPlayer extends Archetype {

    public defaultPlayer (String def, String name, int damage, int pv, int initiative){
        def = defDefault;
        Archetype.name = nameDefault;
        Archetype.damage = damageDefault;
        Archetype.pv = pvDefault;
        Archetype.initiative = initDefault;
        Archetype.dodge = dodgeDefault;
        Archetype.shield =shieldDefault;
        Archetype.damageAmplified=damageAmplifiedDefault;
        Archetype.damageCritikal =damageCritikalDefault;
        gen = nameDefault+" " +damageDefault+" "+pvDefault+" "+initDefault+" "+dodgeDefault+" "+ shieldDefault+" "+damageAmplifiedDefault+" "+damageCritikalDefault;
    }
    String defDefault = setDefDefault();
    String nameDefault = addName();
    int damageDefault = addDamage();
    int pvDefault = addPv();
    int initDefault = addIniatiative();
    int dodgeDefault=addDodge();
    boolean shieldDefault = addShield();
    boolean damageAmplifiedDefault =addDamageAmplified();
    boolean damageCritikalDefault =addDamageCritikal();
    String gen;
    
    
    
    public String setDefDefault() {
        System.out.println("Now you will have to gradually fill in the attributes of your character:");
        System.out.println("Name/damage/pv/initiative");
        String defDisplay= " DefaultPlayer";

        return defDisplay;
    }
    
    public String toString() {
       
        
        return defDefault+"="  + "  name : "+ nameDefault + " | Damage : " + damageDefault+ " /300 |  pv : " + pvDefault+ " /1000 | initiative : " + initDefault+ "/10 | Dodge : "+ dodgeDefault +"/150 | Damage Amplified : "+ damageAmplifiedDefault + " | Damage Critikal : "+ damageCritikalDefault ;
    }
}

