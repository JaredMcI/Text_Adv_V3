
import javax.swing.*;

public class Player{

    private int Charisma;
    private static int Dexterity;
    private double height;
    private static double Health;
    private static int Intelligence;
    private static double Armour;
    private static int Strength;
    private static String Vulnerability;
    private static Weapon weapon;
    private static String name;
    private static double AttackDamage;

    //Mutators
    public static void setHealth(double health) { Health = health; }
    public void setIntelligence(int intelligence) { Intelligence = intelligence; }
    public static void setArmour(double armour) { Armour = armour; }
    public void setStrength(int strength) { Strength = strength; }
    public void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }
    public static void setWeapon(Weapon Item) { weapon = Item; }
    public static void setName(String name) { name = name; }
    public static void setAttackDamage(double attackDamage) { AttackDamage = attackDamage; }

    //Accessor
    public static double getHealth() { return Health; }
    public static int getIntelligence() { return Intelligence; }
    public static double getArmour() { return Armour; }
    public static int getStrength() { return Strength; }
    public static String getVulnerability() { return Vulnerability; }
    public static Weapon getWeapon() { return weapon; }
    public static String getName() { return name; }
    public static double getAttackDamage() { return AttackDamage; }

    public void setCharisma(int charisma) { Charisma = charisma; }
    public void setHeight(double height) { this.height = height; }
    public void setDexterity(int dexterity) { Dexterity = dexterity; }


    public int getCharisma(){ return Charisma; }
    public static int getDexterity(){return Dexterity;}
    public double getHeight(){ return height;}

//    public Player(int charisma, int dexterity, float height) {
//        Charisma = charisma;
//        Dexterity = dexterity;
//        this.height = height;
//    }

    public Player(double Health, int Intelligence, double Armour, int Strength, String Vulnerability, Weapon Strike, String name, int charisma, double height) {
        Charisma = charisma;
        this.height = height;
        setHealth(Health);
        setIntelligence(Intelligence);
        setArmour(Armour);
        setStrength(Strength);
        setVulnerability(Vulnerability);
        setWeapon(Strike);
        setName(name);
        setAttackDamage(Strike.getDamage());
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nCharisma=" + Charisma +
                ", \nDexterity=" + Dexterity +
                ", \nheight=" + height;
    }

    //
//    Player(float Health,int Intelligence,float Armour,int Strength,String Vulnerability,Weapon Weapon,int Charisma,
//           int Dexterity, float height){
//        setHealth(Health);
//        setIntelligence(Intelligence);
//        setArmour(Armour);
//        setStrength(Strength);
//        setVulnerability(Vulnerability);
//        setWeapon(Weapon);
//        setCharisma(Charisma);
//        setHeight(height);
//        setDexterity(Dexterity);
//    }




}
