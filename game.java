import java.util.Scanner;
public class game {
    public static void setGames() {
        System.out.println("The game will start now!!!!");
        create.display();
        toFinish();
    }
    public static void toFinish() {
        String last =" ";
        try {
           Scanner rt =new Scanner(System.in);
           System.out.println("Restart or quit? ");
           System.out.println("Press R to Restart ");
           System.out.println("Press Q to Quit ");
            last= rt.nextLine();
           
       } catch (Exception e) {
           System.err.println("Error TRY AGAIN");
       }
       switch (last) {
           case "R ":
               create.display();
               break;
           case "Q ":
                    choose.finalQuit();
               break;    
       
           default:
           System.out.println("Error TRY AGAIN");
           toFinish();
               break;
       }
    
        
        
    }
}
