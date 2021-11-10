import java.util.ArrayList;
import java.util.Scanner;

public class create extends Archetype {

    public static void display() {

        Scanner scanner = new Scanner(System.in);
        // Affiche " creation des personnages "
        System.out.print("Create your character : ");

        //creation du scanner perso
        int character = scanner.nextInt();

        // Affiche le perso saisit par l'utilisateur
        System.out.println(character);
        
    }
    public void store(){

        ArrayList<Archetype> character = new ArrayList<Archetype>();

        Warrior war = new Warrior(this.name, this.damage, this.pv, this.initiative);
        character.add(war);  

        Wizard wiz = new Wizard(this.name, this.damage, this.pv, this.initiative);
        character.add(wiz);
    }

}
