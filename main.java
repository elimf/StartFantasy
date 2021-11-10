
public class Main  {

    public static void main(String[] args) {
        System.out.println("Application has Started");
        
        menu.choose();
        Warrior perso1 = new Warrior("Mathias", 8 , 15 ,99 );
        Wizard perso2 = new Wizard("Gabriel", 9 , 15 ,74 );

        System.out.println(perso1);
        System.out.println(perso2);
    }

    
}