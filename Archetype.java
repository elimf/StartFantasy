import java.util.Scanner;
public class Archetype {
    protected static String name;
    protected static int damage;
    protected static int pv;
    protected static int initiative;
    protected static  int dodge;
    protected static int shield;
    protected static int damageCritikal;

    static int takeDamage(int damage_receive,int pv){
         pv -= damage_receive;
        return pv;
    };
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        Archetype.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        Archetype.damage = damage;
    }
    public int getPv() {
        return pv;
    }
    public void setPv(int pv) {
        Archetype.pv = pv;
    }
    public int getInitiative() {
        return initiative;
    }
    public void setInitiative(int initiative) {
        Archetype.initiative = initiative;
    }
    public int getDodge (){
            return dodge;
    }
    public void setDodge (int dodge){
        Archetype.dodge =dodge;
    }
    public int getShield(){
        return shield;
    }
    public void setShield(int shield){
        Archetype.shield=shield;
    }
     public  String addName() {
        String Default;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a name:");
         Default = sc.nextLine();
         
        
       return Default; 
    }
    public int addDamage() {
        int numbers;
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value between 0 to 300 of Damage:");
        numbers = cq.nextInt();
        
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("0<Damage>300");
            numbers=addDamage();
        }
        while((numbers <= 0) || (numbers > 300) ){
        try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value between 0 to 300 of Damage:");
        numbers = cq.nextInt();
        
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("0<Damage>300");
            numbers=addDamage();
        }
        }
        return numbers;
    }
    public int addPv() {
        int numbers;
         try {
              Scanner cq = new Scanner(System.in);
              System.out.println("Write a value between 0 and 500 of Pv:");
              numbers = cq.nextInt();
            } catch (Exception e) {
                 System.err.println("error input");
                 System.err.println("0< Pv >1000");
                 numbers=addPv();
                }
                while ((numbers <= 0) || (numbers > 1000) ){
                    try {
                        Scanner cq = new Scanner(System.in);
                        System.out.println("Write a value between 0 and 500 of Pv:");
                        numbers = cq.nextInt();
                    } catch (Exception e) {
                        System.err.println("error input");
                        System.err.println("0< pv >1000");
                        numbers=addPv();
                    }
                }
                return numbers;
            }
    public int addIniatiative() {
                int numbers;
                try {
                    Scanner cq = new Scanner(System.in);
                    System.out.println("Write a value between 0 and 10 of initiative:");
                    numbers = cq.nextInt(); 
                } catch (Exception e) {
                     System.err.println("error input");
                     System.err.println("0<Iniative>10");
                     numbers=addIniatiative();
                     }
                     while ((numbers <= 0) || (numbers > 10) ){  
                         try {
                             Scanner cq = new Scanner(System.in);
                             System.out.println("Write a value between 0 and 10 of initiative:");
                             numbers = cq.nextInt();
                             } catch (Exception e) {
                                  System.err.println("error input");
                                  System.err.println("0<Iniative>10");
                                  numbers=addIniatiative();
                                }   
                            }
                            return numbers;
                        }
    public int addDodge(){
        int numbers;
                try {
                    Scanner cq = new Scanner(System.in);
                    System.out.println("Write a value between 0 and 150 of dodge:");
                    numbers = cq.nextInt(); 
                } catch (Exception e) {
                     System.err.println("error input");
                     System.err.println("0<Dodge>150");
                     numbers=addDodge();
                     }
                     while ((numbers <= 0) || (numbers > 150) ){  
                         try {
                             Scanner cq = new Scanner(System.in);
                             System.out.println("Write a value between 0 and 150 of dodge:");
                             numbers = cq.nextInt();
                             } catch (Exception e) {
                                  System.err.println("error input");
                                  System.err.println("0<Dodge>150");
                                  numbers=addDodge();
                                }   
                            }
                            return numbers;
                        }
public int addShield(){
    int numbers;
    try {
        Scanner cq = new Scanner(System.in);
        System.out.println("Write a value between 0 and 500 of shield:");
        numbers = cq.nextInt();
        } catch (Exception e) {
                     System.err.println("error input");
                     System.err.println("0<Shlied>500");
                     numbers=addShield();
                     }
                     while ((numbers <= 0) || (numbers > 500) ){  
                         try {
                             Scanner cq = new Scanner(System.in);
                             System.out.println("Write a value between 0 and 500 of shield:");
                             numbers = cq.nextInt();
                             } catch (Exception e) {
                                  System.err.println("error input");
                                  System.err.println("0<Shield>500");
                                  numbers=addDodge();
                                }   
                            }
                            return numbers;
                        }
   
}
