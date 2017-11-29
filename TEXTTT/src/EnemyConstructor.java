import javax.naming.Name;

public class EnemyConstructor {
    private static double Health;
    private static int Strength;
    private static Weapon Weapon;
    private static String name;

    public static double getHealth() { return Health; }
    public static void setHealth(double health) { Health = health; }

    public static int getStrength() { return Strength; }
    public static void setStrength(int strength) { Strength = strength; }

    public static Weapon getWeapon() { return Weapon; }
    public static void setWeapon(Weapon weapon) { Weapon = weapon; }

    public static String getName() { return name; }
    public static void setName(String name) { EnemyConstructor.name = name; }

    public EnemyConstructor() {
        setName("Unknown");
        setHealth(0);
        setWeapon(Weapon);
        setStrength(0);
    }
    public EnemyConstructor(double health, int strength, Weapon weapon, String name){
        setName(name);
        setHealth(health);
        setWeapon(weapon);
        setStrength(strength);


    }
}
