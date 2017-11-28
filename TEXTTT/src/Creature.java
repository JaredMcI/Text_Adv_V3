import javax.swing.*;

public class Creature {

    private static double Health;
    private static int Intelligence;
    private static double Armour;
    private static int Strength;
    private static String Vulnerability;
    private static Weapon Weapon;

    //Mutators
    public static void setHealth(double health) { Health = health; }
    public void setIntelligence(int intelligence) { Intelligence = intelligence; }
    public static void setArmour(double armour) { Armour = armour; }
    public void setStrength(int strength) { Strength = strength; }
    public void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }
    public static void setWeapon(Weapon weapon) { Weapon = weapon; }

    //Accessor
    public static double getHealth() { return Health; }
    public static int getIntelligence() { return Intelligence; }
    public static double getArmour() { return Armour; }
    public static int getStrength() { return Strength; }
    public static String getVulnerability() { return Vulnerability; }
    public static Weapon getWeapon() { return Weapon; }

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
    }
    public Creature(double Health,int Intelligence,double Armour,int Strength,String Vulnerability,Weapon Weapon){
        setHealth(Health);
        setIntelligence(Intelligence);
        setArmour(Armour);
        setStrength(Strength);
        setVulnerability(Vulnerability);
        setWeapon(Weapon);
    }

    public void Attack(Player User){
        double AttackMultiplier = 0;
        if (Creature.getWeapon().getDamage_Type() == User.getVulnerability()){
            AttackMultiplier += 0.15;
        }
        if (Creature.getIntelligence() >  User.getIntelligence()){
            AttackMultiplier += 0.1;

        }
        AttackMultiplier += Creature.getStrength()* 0.05;

        User.setHealth((User.getHealth() + (User.getHealth()*User.getArmour())) - Creature.getWeapon().getDamage()*AttackMultiplier);
        if(User.getHealth() < 0){
            JOptionPane.showMessageDialog(null, "Your Opponent slayed you");
        }
        else
            JOptionPane.showMessageDialog(null, "You have" + User.getHealth() + " HP remaining.");

    }

}