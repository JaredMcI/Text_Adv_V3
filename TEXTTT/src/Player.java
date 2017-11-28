
import javax.swing.*;

public class Player extends Creature {

    private int Charisma;
    private static int Dexterity;
    private double height;
    private String name;



    public void setCharisma(int charisma) { Charisma = charisma; }
    public void setHeight(double height) { this.height = height; }
    public void setDexterity(int dexterity) { Dexterity = dexterity; }
    public void setName(String name) { this.name = name; }

    public int getCharisma(){ return Charisma; }
    public static int getDexterity(){return Dexterity;}
    public double getHeight(){ return height;}
    public String getName() { return name; }
//    public Player(int charisma, int dexterity, float height) {
//        Charisma = charisma;
//        Dexterity = dexterity;
//        this.height = height;
//    }

    public Player(double Health, int Intelligence, double Armour, int Strength, String Vulnerability, Weapon Weapon, int charisma, int dexterity, String name,double height) {
        super(Health, Intelligence, Armour, Strength, Vulnerability, Weapon);
        Charisma = charisma;
        Dexterity = dexterity;
        this.height = height;
        setName(name);
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

    public void Attack(Creature Enemey){
        double AttackMultiplier = 0;
        if (Player.getWeapon().getDamage_Type() == Enemey.getVulnerability()){
            AttackMultiplier += 0.15;
        }
        if (Player.getIntelligence() >  Creature.getIntelligence()){
            AttackMultiplier += 0.1;

        }
        AttackMultiplier += (Player.getStrength()* 0.05);


        Enemey.setHealth(Enemey.getHealth() +(Creature.getHealth()*Creature.getArmour())- (Player.getWeapon().getDamage()*AttackMultiplier));
        if(Enemey.getHealth() < 0){
            JOptionPane.showMessageDialog(null, "Foe Slain");
        }
        else
            JOptionPane.showMessageDialog(null, "Your Foe has " + Enemey.getHealth() + " HP remaining.");

    }



}
