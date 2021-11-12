import java.util.Scanner;
public class Archetype {
    protected static String name;
    protected static int damage;
    protected static int pv;
    protected static int initiative;
    protected static  int dodge;
    protected static boolean shield;
    protected static boolean damageCritikal;
    protected static boolean damageAmplified;

    static int takeDamage(int damage_receive,int pv, Boolean shield){
         if (shield) {
             pv -= (damage_receive-(damage_receive*0.5)); 
             
         } else {
             pv -= damage_receive;
         }
        
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
    public boolean getShield(){
        return shield;
    }
    public void setShield(Boolean shield){
        Archetype.shield=shield;
    }
    public boolean getDamageCritikal(){
        return damageCritikal;
    }
    public void setDamageCritikal(boolean damageCritikal){
        Archetype.damageCritikal=damageCritikal;
    }
    public boolean getDamageAmplified(){
        return damageAmplified;
    }
    public void setDamageAmplified(){
        Archetype.damageAmplified= damageAmplified;
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
    public boolean addShield(){
    boolean DamageCri;
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Shield? Write true or false :");
         DamageCri = sc.nextBoolean();
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("Entry true or false");
            DamageCri=addShield();
        }
        while(DamageCri== true || DamageCri == false){
            try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Shield? Write true or false :");
         DamageCri = sc.nextBoolean();
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("Entry true or false");
            DamageCri=addShield();
        }
    }
    return DamageCri; 
}
    public  boolean addDamageCritikal() {
        boolean DamageCri;
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Damage Critikal? Write true or false :");
         DamageCri = sc.nextBoolean();
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("Entry true or false");
            DamageCri=addShield();
        }
        while(DamageCri== true || DamageCri == false){
            try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Damage Critikal? Write true or false :");
         DamageCri = sc.nextBoolean();
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("Entry true or false");
            DamageCri=addShield();
        }
    }
    return DamageCri; 
}
    public boolean addDamageAmplified(){
            boolean DamageCri;
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Damage Amplified? Write true or false :");
         DamageCri = sc.nextBoolean();
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("Entry true or false");
            DamageCri=addDamageAmplified();
        }
        while(DamageCri== true || DamageCri == false){
            try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Damage Amplified? Write true or false :");
         DamageCri = sc.nextBoolean();
        } catch (Exception e) {
            System.err.println("error input");
            System.err.println("Entry true or false");
            DamageCri=addDamageAmplified();
    }
    
}
return DamageCri; 
} 
}
