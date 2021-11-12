import java.util.Scanner;
public class choose {

  //Method to display a Rules//
  public static void displayRules() {
    System.out.println("This the rules of the Start Fantasy.");
    Scanner jk = new Scanner(System.in);
    System.out.println("Do you want to go back to the menu?(yes or press anywhere");
    String reponse = jk.nextLine();
    reponse = verifUpper(reponse);
    
    switch (reponse) {
      case "yes":
        principalMain();
        break;
      default:
      displayRules();
        break;
    }
  }
  
  //Methode convert UpperCase to LowerCase//
  public static String verifUpper(String verif) {
    String modif=verif;
    if (verif == "P" || verif == "Q") {
      verif =verif.toLowerCase();  
      modif=verif;
    }
    return modif.toLowerCase();  
  }

// Method to quit or the game //
  public static void wantQuit() {
        Scanner largo = new Scanner(System.in);
         String theChoose2;
        System.out.println("If you really want to quit ?(write yes else write no)");
        theChoose2 =largo.nextLine();
        theChoose2 = verifUpper(theChoose2);
        
        switch (theChoose2) {
        case "yes":
          System.out.println("Good Bye see you soon CHAMPIONS.");
          System.exit(1);
          break;
        case "no":
        System.out.println("You will be redirected to the menu.");
              principalMain();
          break;
      
        default:
          System.out.println("Your select is wrong please try again.");
            wantQuit();
          break;
      }
      }
     
    //Methode to display the menu
  public static void principalMain(){
    System.out.println("");
    System.out.println("Welcome to Start Fantasy");
    System.out.println("---------Principal Main----------");
    System.err.println("");
    System.out.println("Press 'p' for play at the game.");
    System.out.println("Press 'q' for to quit.");
    System.out.println("Press 'r' for to display different perso .");
    System.out.println("");
    Scanner key = new Scanner(System.in);
    String theChoose =key.nextLine();
    System.out.println("Select your option:");
    theChoose = verifUpper(theChoose);
    
    switch (theChoose) {
      case "p":
      System.out.println("The game will start in a few time");
      System.out.println("LOADING...");
      System.out.println("The game will start now!!!!");
       create.display();
       toFinish();
        break;
      case "q":
            wantQuit();
        break; 
      case "r":
        create.displayStockSave(create.saveMe);
        principalMain();
        break;
    
      default:
      System.err.println("Error Try Again");
      System.out.println("");
        principalMain();
        break;
    }

  }
   public static void toFinish() {
           Scanner rt =new Scanner(System.in);
           System.out.println("Restart or quit?Press R or Q ");
           String last= rt.nextLine();
            last = verifUpper(last);
       switch (last) {
           case "r":
               create.display();
               break;
           case "q":
                   wantQuit();
               break;    
       
           default:
           System.out.println("Error TRY AGAIN");
           toFinish();
               break;
       }
       
    }
}
