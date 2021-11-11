
import java.util.ArrayList;
import java.util.Scanner;

public class create extends Archetype{

    private static String def;
    public static void display() {
        String perso1;
        String perso2;
        System.out.println("First player it's yourn turn");
        perso1 =setPlayerToGame();
        System.out.println(" ");
        System.out.println("Second player it's your turn.");
        perso2=setPlayerToGame();
        System.err.println(" ");
        System.out.println("summary of the players chosen Players1:"+ perso1 + "Players2:" +perso2 );
        
    }
    
    public static String setPlayerToGame() {
        int man = 78 ;
        String type= "vide" ;
        try {
        Scanner choosePerso = new Scanner(System.in);
        System.out.println("Choose your perso");
        System.out.println("Press 1 to create default perso");
        System.out.println("Press 2 for Warrior");
        System.out.println("Press 3 for Wizard ");
        System.out.println("Press 4 for Thief");
        man = choosePerso.nextInt();
        } catch (Exception e) {
            System.err.println("Error TRY AGAIN");
            setPlayerToGame();
        }
        
        switch (man) {
    case 1 :
        defaultPlayer player = new defaultPlayer(def, name, damage, pv, initiative);
        System.out.println(player);
        type = "Default";
            
        
        break;
    case 2 :
        Warrior war = new Warrior("Mathias", 8 , 15 ,99 );
        System.out.println(war);
        type = "Warrior";
        
        break;
    case 3 :
        Wizard wiz = new Wizard("Gabriel", 9 , 15 ,74 );
        System.out.println(wiz);
        type = "Wizard";
        break;
    case 4 :
        
        break;

    default:
            System.err.println("Try again");
            setPlayerToGame();
        break;
}
        return type;
    }
    public void store(){

        ArrayList<Archetype> character = new ArrayList<Archetype>();

        Warrior war = new Warrior(this.name, this.damage, this.pv, this.initiative);
        character.add(war);  

        Wizard wiz = new Wizard(this.name, this.damage, this.pv, this.initiative);
        character.add(wiz);
    }
    
}
