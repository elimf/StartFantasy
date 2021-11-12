
import java.util.Scanner;


public class defaultPlayer extends Archetype {

    public defaultPlayer (String def, String name, int damage, int pv, int initiative){
        def = defDefault;
        Archetype.name = nameDefault;
        Archetype.damage = damageDefault;
        Archetype.pv = pvDefault;
        Archetype.initiative = initDefault;
        gen = nameDefault+" " +damageDefault+" "+pvDefault+" "+initDefault;
    }
    String defDefault = setDefDefault();
    String nameDefault = setDefaultPlayer();
    int damageDefault = setDamageDefaultPlayer();
    int pvDefault = setPvDefaultPlayer();
    int initDefault = setInitDefaultPlayer();
    String gen;
    
    
    
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
        System.out.println("Write a value between 0 to 100 of Damage:");
        numbers = cq.nextInt();
        
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("0<Damage>100");
            numbers=setDamageDefaultPlayer();
        }
        while((numbers <= 0) || (numbers > 100) ){
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value between 0 to 100 of Damage:");
        numbers = cq.nextInt();
        
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("0<Damage>100");
            numbers=setDamageDefaultPlayer();
        }
        }
        return numbers;
    }
    public int setPvDefaultPlayer() {
        int numbers;
         try {
              Scanner cq = new Scanner(System.in);
              System.out.println("Write a value between 0 and 500 of Pv:");
              numbers = cq.nextInt();
            } catch (Exception e) {
                 System.err.println("error input");
                 System.err.println("0< Pv <=500");
                 numbers=setPvDefaultPlayer();
                }
                while ((numbers <= 0) || (numbers > 500) ){
                    try {
                        Scanner cq = new Scanner(System.in);
                        System.out.println("Write a value between 0 and 500 of Pv:");
                        numbers = cq.nextInt();
                    } catch (Exception e) {
                        System.err.println("error input");
                        System.err.println("0< pv <=500");
                        numbers=setPvDefaultPlayer();
                    }
                }
                return numbers;
            }
            public int setInitDefaultPlayer() {
                int numbers;
                try {
                    Scanner cq = new Scanner(System.in);
                    System.out.println("Write a value between 0 and 10 of initiative:");
                    numbers = cq.nextInt(); 
                } catch (Exception e) {
                     System.err.println("error input");
                     System.err.println("0<Iniative>10");
                     numbers=setInitDefaultPlayer();
                     }
                     while ((numbers <= 0) || (numbers > 10) ){  
                         try {
                             Scanner cq = new Scanner(System.in);
                             System.out.println("Write a value between 0 and 10 of initiative:");
                             numbers = cq.nextInt();
                             } catch (Exception e) {
                                  System.err.println("error input");
                                  System.err.println("0<Iniative>10");
                                  numbers=setInitDefaultPlayer();
                                }   
                            }
                            return numbers;
                        }
    public String toString() {
       
        
        return defDefault+"="  + "  name : "+ nameDefault + " | Damage : " + damageDefault+ " /100 |  pv : " + pvDefault+ " /500 | initiative : " + initDefault+ "/10.";
    }
}

