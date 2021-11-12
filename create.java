
import java.util.ArrayList;
import java.util.Scanner;

public class create extends Archetype{
     static ArrayList<defaultPlayer> saveMe = new ArrayList<defaultPlayer>();
     static int indexSave = 0;
    private static String def;
    

    public static void display() {
        String perso1;
        String perso2;

        System.out.println("First player it's yourn turn to choose a fighter. ");
        perso1 =setPlayerToGame();
        System.out.println(" ");
        System.out.println("Second player it's your turn to choose a fighter. ");
        perso2=setPlayerToGame();
        System.err.println(" ");
        System.out.println("The Game starts...");
         fight(perso1,perso2);
    }
    public static ArrayList<defaultPlayer> saveDefaultPerso(int i, defaultPlayer persoToSave ) {
        ArrayList<defaultPlayer> stock = new ArrayList<defaultPlayer>();
        stock.add(i,persoToSave);
        return stock;   
    }
    public static int addMore(int i){
        i +=1;
        return i;
    }
    public static ArrayList<defaultPlayer> displayStockSave( ArrayList<defaultPlayer> showMe ) {
        for (int i = 0; i < showMe.size(); i++) {
            System.out.println(i+":"+showMe.get(i));
        }
        return showMe;   
    }

    public static String setPlayerToGame() {
        int man = 78 ;
       String type="" ;
    
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
        saveMe=saveDefaultPerso(indexSave,player);
        indexSave=addMore(indexSave);
        type =player.gen;
        break;
    case 2 :
        Warrior war = new Warrior(Warrior.name, Warrior.damage , Warrior.pv,Warrior.initiative );
        System.out.println(war);
       type =war.gen;
        
        break;
    case 3 :
        Wizard wiz = new Wizard(Wizard.name,Wizard.damage,Wizard.pv,Wizard.initiative);
        System.out.println(wiz);
        type =wiz.gen;
        break;
    case 4 :
        Thief th = new Thief(Thief.name, Thief.damage,Thief.pv, Thief.initiative);
        type=th.gen;
        break;

    default:
            System.err.println("Try again");
            setPlayerToGame();
        break;
     }     
        return type;
        
    }
   
    public static void  fight(String player1, String player2){
       String namePlayer1 =selectName(player1);
       String namePlayer2 =selectName(player2);
       int Damage1 =selectDamage(player1);
       int Damage2 =selectDamage(player2);
       int playerPv1 = selectPv(player1);
       int playerPv2 =selectPv(player2);
       int playerInit1 =selectInitiative(player1);
       int playerInit2 =selectInitiative(player2);
       int it=0;
       
       if (playerInit1>playerInit2) {  
            System.out.println(namePlayer1+" You start !");
       } else {

           System.out.println(namePlayer2+" You start !");
       }
       System.out.println(" ");
       do {   
           do {
            it=compteur(it);  
            System.out.println("Round: "+ it);
            System.out.println(" ");

            System.out.println(namePlayer1+" is attacking. ");
            playerPv2= takeDamage(Damage1,playerPv2);
            System.out.println(namePlayer2+" your pv:"+playerPv2+"after the phenomenal attack. ");
            System.out.println(" ");
           } while (playerPv2 == 0);
           do {
               it=compteur(it);  
               System.out.println("Round: "+ it);
               System.out.println(" ");
           
               System.out.println(namePlayer2+" is attacking. ");
               playerPv1= takeDamage(Damage2,playerPv1);
               System.out.println("Your pv: "+playerPv1+"after the phenomenal attack. ");
               
           } while (playerPv1 == 0);    
       } while ((playerPv1 == 0) ||( playerPv2 == 0));
      
       System.out.println(namePlayer1+ " Your Pv : "+playerPv1+".");
       System.out.println(namePlayer2+ " Your Pv : "+playerPv2+".");
       if ((playerPv1==0 )&& (playerPv2 !=0)) {
           System.out.println(namePlayer2+" Congrat You win!!! "+"rest of pv"+playerPv2);
       } else if((playerPv2 == 0 ) && (playerPv1 !=0)) {
           System.out.println(namePlayer1+" Congrat You win!!! "+"rest of pv"+playerPv1);
       }else {
           System.out.println("equality in the game nobody wins this game");
       }
       
       
       
    }
     
    public static int compteur(int nb) {
        
        return nb+=1;
    }
    public static int selectInitiative(String toSepare ) {
        String regex =" ";
       String mot[]=toSepare.split(regex);
       for (int i = 0; i < 4; i++) {
           
       }
   
     int result = Integer.parseInt(mot[3]);
       return result;
    }
    public static int selectPv(String toSepare) {
       String regex =" ";
       String mot[]=toSepare.split(regex);
       for (int i = 0; i < 4; i++) {
            
       }
   
     int result = Integer.parseInt(mot[2]);
       return result; 
    }

    public static int selectDamage(String toSepare) {
        String regex =" ";
       String mot[]=toSepare.split(regex);
       for (int i = 0; i < 4; i++) {
            
       }
   
     int result = Integer.parseInt(mot[1]);
       
     return result;
    }
    public static String selectName(String toSepare) {
        String regex =" ";
       String mot[]=toSepare.split(regex);
       for (int i = 0; i < 4; i++) {
            
       }
       String result =mot[0];
     
       
     return result;
    }
}
    