import java.util.Scanner;

public class Archetype {
    protected static String name;
    protected static int damage;
    protected static int pv;
    protected static int initiative;
    protected static  boolean dodge;
    protected static boolean shield;
    protected static boolean damageCritikal;
    protected static boolean damageAmplified;

    static int takeDamage(int damage_receive,int pv, Boolean shield, boolean dodge, boolean Dc, boolean Da){
         
        if (Dc== true) {
            damage_receive*=2;
        } else { 
            damage_receive=damage_receive + 0;
        }
         if (Da==true) {
            damage_receive +=(damage_receive/2);
        } else {
            damage_receive=damage_receive;
        }
        if (shield== true) {
             pv -= (damage_receive-(damage_receive*0.5)); 
             
         } else if (dodge == true) {
             Dodge(dodge);
             if (dodge == true ){
                 return pv;
                 }else{
                 System.out.println("no dodge");
             }

             } else {
             pv -= damage_receive;
         }
        
        return pv;
    }

    static boolean Dodge(Boolean dodge){
        int passage = 23;
        int min =23*0;
        int max= 150;

        passage= (int) (Math.random() * (max - min));
       if (passage%2 == 0) {
           dodge= true;
       } else {
           dodge=false;
       }
       return dodge;
        
    }
    
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
    public boolean getDodge (){
            return dodge;
    }
    public void setDodge (Boolean dodge){
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
    public  boolean addDodge(){
        boolean numbers;
                try {
                    Scanner cq = new Scanner(System.in);
                    System.out.println("Write a true or false for use Dodge:");
                    numbers = cq.nextBoolean(); 
                } catch (Exception e) {
                     System.err.println("error input");
                     System.err.println(" true or false");
                     numbers=addDodge();
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
            DamageCri=addDamageCritikal();
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
return DamageCri; 
} 
}
