

import java.time.temporal.ValueRange;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class defaultPlayer extends Archetype {

    public defaultPlayer (String def, String name, int damage, int pv, int initiative){
        def = defDefault;
        Archetype.name = nameDefault;
        Archetype.damage = damageDefault;
        Archetype.pv = pvDefault;
        Archetype.initiative = initDefault;
    }
    String defDefault = setDefDefault();
    String nameDefault = setDefaultPlayer();
    int damageDefault = setDamageDefaultPlayer();
    int pvDefault = setPvDefaultPlayer();
    int initDefault = setInitDefaultPlayer();
    
    public String setDefDefault() {
        System.out.println("Now you will have to gradually fill in the attributes of your character:");
        System.out.println("Name/damage/pv/initiative");
        String defDisplay= " DefaultPlayer";

        return defDisplay;
    }
    
    public  String setDefaultPlayer() {
        String Default;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a name:");
         Default = sc.nextLine();
        
       return Default; 
    }
    public int setDamageDefaultPlayer() {
        int numbers;
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value of Damage:");
        numbers = cq.nextInt();
        } catch (Exception e) {
            System.err.println("error input");
            numbers=setDamageDefaultPlayer();
        }
        while((numbers <= 0) || (numbers >= 100) ){
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value of Damage:");
        numbers = cq.nextInt();
        } catch (Exception e) {
            System.err.println("error input");
            numbers=setDamageDefaultPlayer();
        }
        }
        return numbers;
    }
    public int setPvDefaultPlayer() {
        int numbers;
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value of Pv:");
        numbers = cq.nextInt();
           
       } catch (Exception e) {
           System.err.println("error input");
           numbers=setPvDefaultPlayer();
       }   
    while ((numbers <= 0) || (numbers > 500) ){
    try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value of Pv:");
        numbers = cq.nextInt();
           
       } catch (Exception e) {
           System.err.println("error input");
           numbers=setPvDefaultPlayer();
       }   
   }
        return numbers;
    }
    public int setInitDefaultPlayer() {
        int numbers;
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value of initiative:");
        numbers = cq.nextInt(); 
       } catch (Exception e) {
           System.err.println("error input");
           numbers=setInitDefaultPlayer();
       }   
    while ((numbers <= 0) || (numbers > 10) ){  
    try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value of initiative:");
        numbers = cq.nextInt();
           
        } catch (Exception e) {
           System.err.println("error input");
           numbers=setInitDefaultPlayer();
        }   
    }
   return numbers;
    }
    public String toString() {
       
        return defDefault+":"  + "name : "+ nameDefault + " / Damage : " + damageDefault+ " /100;  pv : " + pvDefault+ " /500; initiative : " + initDefault+ "/10.";
    }
}

