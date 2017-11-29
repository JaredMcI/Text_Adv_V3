public class Weapon{
    private static double damage;
    private String Damage_Type;
    private double weight;
    private String Name;

    //Mutators
    public static void setDamage(double Damage) { damage = Damage; }
    public void setDamage_Type(String damage_Type) { Damage_Type = damage_Type; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setName(String name) { Name = name; }

    //Accessors
    public static double getDamage() { return damage; }
    public String getDamage_Type() { return Damage_Type; }
    public double getWeight() { return weight; }
    public String getName() { return Name; }


    public String toString() {
        return "\nDamage: " + getDamage() + "\nDamage Type: " +
                getDamage_Type() + "\nWeight: " + getWeight();
    }
    public Weapon(){
        setDamage(0);
        setDamage_Type("Unknown");
        setWeight(0);
        setName("Unknown");
    }
    public Weapon(double damage, String Damage_Type, double weight, String name){
        setDamage(damage);
        setDamage_Type(Damage_Type);
        setWeight(weight);
        setName(name);
    }}

