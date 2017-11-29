import javax.swing.*;

public class Creature {

    private static double Health;
    private static int Intelligence;
    private static double Armour;
    private static int Strength;
    private static String Vulnerability;
    private static Weapon Weapon;
    private static String name;

    //Mutators
    public static void setHealth(double health) { Health = health; }
    public void setIntelligence(int intelligence) { Intelligence = intelligence; }
    public static void setArmour(double armour) { Armour = armour; }
    public void setStrength(int strength) { Strength = strength; }
    public void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }
    public static void setWeapon(Weapon weapon) { Weapon = weapon; }
    public static void setName(String name) { Creature.name = name; }

    //Accessor
    public static double getHealth() { return Health; }
    public static int getIntelligence() { return Intelligence; }
    public static double getArmour() { return Armour; }
    public static int getStrength() { return Strength; }
    public static String getVulnerability() { return Vulnerability; }
    public static Weapon getWeapon() { return Weapon; }
    public static String getName() { return name; }

    //ToString
    public String toString() {
        return "Health: " +getHealth()+ "\tArmour: " +getArmour()+ "\tStrength: "+ getStrength()+
                "\nIntelligence: "+getIntelligence()+"\tVulnerability: " +getVulnerability()+"\nWeapon: "+getWeapon();
    }

    public Creature(){
        setHealth(0);
        setIntelligence(0);
        setArmour(0);
        setStrength(0);
        setVulnerability("Unknown");
        setWeapon(Weapon);
        setName("Unknown");
    }
    public Creature(double Health,int Intelligence,double Armour,int Strength,String Vulnerability,Weapon Weapon,String name){
        setHealth(Health);
        setIntelligence(Intelligence);
        setArmour(Armour);
        setStrength(Strength);
        setVulnerability(Vulnerability);
        setWeapon(Weapon);
        setName(name);
    }

    public static void Attack(Player User){
        User.setHealth(User.getHealth() - Creature.getWeapon().getDamage());
}}