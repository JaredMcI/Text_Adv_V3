
import javax.swing.*;

public class Player extends Creature {

    private int Charisma;
    private static int Dexterity;
    private double height;




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

    public Player(double Health, int Intelligence, double Armour, int Strength, String Vulnerability, Weapon Weapon, String name, int charisma, double height) {
        super(Health, Intelligence, Armour, Strength, Vulnerability, Weapon, name);
        Charisma = charisma;
        this.height = height;
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
