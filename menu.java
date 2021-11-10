import java.util.Scanner;
public class menu {

  //Method to display a Rules//
  public static void displayRules() {
    System.out.println("This the rules of the Start Fantasy.");
    Scanner jk = new Scanner(System.in);
    System.out.println("Do you want to go back to the menu?(yes or press anywhere");
    String reponse = jk.nextLine();
    reponse = verifUpper(reponse);
    switch (reponse) {
      case "yes":
        choose();
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
              choose();
          break;
      
        default:
          System.out.println("Your select is wrong please try again.");
            wantQuit();
          break;
      }
      }
    //Methode to display
  public static void choose(){
    System.out.println("");
    System.out.println("Welcome to Start Fantasy");
    System.out.println("---------Principal Main----------");
    System.err.println("");
    System.out.println("Press 'p' for play at the game.");
    System.out.println("Press 'q' for to quit.");
    System.out.println("Press 'r' for to display the rules.");
    System.out.println("");
    Scanner key = new Scanner(System.in);
    System.out.println("Select your option:");
    String theChoose =key.nextLine();

    theChoose = verifUpper(theChoose);
    
    switch (theChoose) {
      case "p":
      System.out.println("The game will start in a few time");
      System.out.println("LOADING...");
        
        break;
      case "q":
            wantQuit();
        break; 
      case "r":
        displayRules();
        break;
    
      default:
      System.err.println("Error Try Again");
      System.out.println("");
        choose();
        break;
    }
  }
}
