import javax.naming.Name;

public class EnemyConstructor {
    private static double Health;
    private static int Strength;
    //private static Weapon weapon;
    private static String name;
    private static double AttackDamage;
    private static String Vulnerability;

    public static double getHealth() { return Health; }
    public static void setHealth(double health) { Health = health; }

    public static void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }
    public static String getVulnerability() { return Vulnerability; }

    public static void setAttackDamage(double attackDamage) { AttackDamage = attackDamage; }
    public static double getAttackDamage() { return AttackDamage; }

    public static int getStrength() { return Strength; }
    public static void setStrength(int strength) { Strength = strength; }

   // public static Weapon getWeapon() { return weapon; }
   // public static void setWeapon(Weapon Weapon) { weapon = Weapon; }

    public static String getName() { return name; }
    public static void setName(String Name) { name = Name; }

    public EnemyConstructor() {
        setName("Unknown");
        setHealth(0);
        //setWeapon(weapon);
        setStrength(0);
    }
    public EnemyConstructor(double health, int strength,Double damage, String name, String vulnerability){
        setName(name);
        setHealth(health);
        //setWeapon(weapon);
        setStrength(strength);
        setAttackDamage(damage);
        setVulnerability(vulnerability);


    }
}
