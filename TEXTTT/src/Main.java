import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
   static JFrame Window;
    static Font TitleFont = new Font ("Times New Roman", Font.PLAIN, 90);
    static Font ButtonFont = new Font("Timers New Roman", Font.PLAIN, 30);
    static Font StatFont = new Font("Times New Roman", Font.PLAIN, 15);
    static Container cont;
    static String Event;
    static JTextArea MainStory;
    TitleScreenHandler TitleScreenHandler = new TitleScreenHandler();
    ChoiceHandler ChoiceHandler = new ChoiceHandler();
    static JPanel TitlePanel, UserStatPanel, ButtonPanel,StoryButtonPanel,TextPanel;
    static JButton StartButton,ChoiceA,ChoiceB,ChoiceC,ChoiceD;
    static Player user;
    static Creature Opponent = new Creature();

    //Gameplay Variables
    static int use = 0;
    // Health controls
    static int TriggerA = 0;
    static int TriggerB= 0;
    static int TriggerC = 0;
    static int TriggerD = 0;
    static int TriggerE = 0;
    //Existence Controls

    static boolean AliveA = true;
    static boolean AliveB = true;
    static boolean AliveC = true;
    static boolean AliveD = true;
    static boolean AliveE = true;
   // static Weapon Dagger = new Weapon(15,"Cutting",1.3,"Dagger");
   // static Weapon Shard = new Weapon(3,"Cutting",0.1,"Shard");
   // static Weapon Club = new Weapon(4,"Bludgeon",4.1,"Club");
   // static Weapon Fist = new Weapon(10,"Bludgeon",0.1,"Fist");
   // static Weapon Bite = new Weapon(12,"Piercing",5.1,"Bite");
   // static Weapon Wand = new Weapon(5,"Bludgeon",2.1,"Wand");


    //Enemies in Game Generated
    static EnemyConstructor Witch = new EnemyConstructor();
    static EnemyConstructor Ork = new EnemyConstructor();
    static EnemyConstructor Goblin = new EnemyConstructor();
    static EnemyConstructor Troll = new EnemyConstructor();
    static EnemyConstructor Dragon = new EnemyConstructor();



    //Stat Bar Labels
    JLabel HPlabel,ArmourLabel, StrengthLabel;
    JLabel  WeaponLabel, CharismaLabel;

    //Stat Bar User Values Labels
    static JLabel HPlabelUser, ArmourLabelUser, StrengthLabelUser;
    static JLabel WeaponLabelUser, CharismaLabelUser;


    public static void main(String[] args) {

        new Main();
    }

    public Main(){

        Window = new JFrame();
        Window.setSize(800,600);
        Window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Window.getContentPane().setBackground(Color.BLACK);
        Window.setLayout(null);
        Window.setVisible(true);
        cont = Window.getContentPane();

        TitlePanel = new JPanel();
        TitlePanel.setBounds(100,150,600,150);
        TitlePanel.setBackground(Color.BLACK);
        JLabel Title = new JLabel("WELCOME");
        Title.setFont(TitleFont);
        Title.setForeground(Color.white);
        TitlePanel.add(Title);

        ButtonPanel = new JPanel();
        ButtonPanel.setBounds(300,400,200,100);
        ButtonPanel.setBackground(Color.BLACK);

        StartButton = new JButton("START");
        StartButton.setBackground(Color.BLACK);
        StartButton.setForeground(Color.WHITE);
        StartButton.setFont(ButtonFont);
        StartButton.setFocusPainted(false);
        StartButton.addActionListener(TitleScreenHandler);

        cont.add(TitlePanel);
        ButtonPanel.add(StartButton);
        cont.add(ButtonPanel);}

    public void CreateStoryScreen(){
        TitlePanel.setVisible(false);
        ButtonPanel.setVisible(false);

        TextPanel = new JPanel();
        TextPanel.setBounds(100,100,600,250);
        TextPanel.setBackground(Color.black);
        cont.add(TextPanel);

        MainStory = new JTextArea("Insert Story");
        MainStory.setEditable(false);
        MainStory.setBounds(100,100,600,250);
        MainStory.setBackground(Color.BLACK);
        MainStory.setForeground(Color.WHITE);
        MainStory.setFont(ButtonFont);
        MainStory.setLineWrap(true);
        TextPanel.add(MainStory);

        StoryButtonPanel = new JPanel();
        StoryButtonPanel.setBounds(100,350,600,75);
        StoryButtonPanel.setBackground(Color.black);
        GridLayout GridLayout = new GridLayout(0,4);
        StoryButtonPanel.setLayout(GridLayout);
        cont.add(StoryButtonPanel);

        ChoiceA = new JButton();
        ChoiceA.setBackground(Color.black);
        ChoiceA.setForeground(Color.WHITE);
        ChoiceA.setFont(StatFont);
        ChoiceA.setFocusPainted(false);
        ChoiceA.addActionListener(ChoiceHandler);
        ChoiceA.setActionCommand("CA");
        StoryButtonPanel.add(ChoiceA);

        ChoiceB = new JButton();
        ChoiceB.setBackground(Color.black);
        ChoiceB.setForeground(Color.WHITE);
        ChoiceB.setFont(StatFont);
        ChoiceB.setFocusPainted(false);
        ChoiceB.addActionListener(ChoiceHandler);
        ChoiceB.setActionCommand("CB");
        StoryButtonPanel.add(ChoiceB);

        ChoiceC = new JButton();
        ChoiceC.setBackground(Color.black);
        ChoiceC.setForeground(Color.WHITE);
        ChoiceC.setFont(StatFont);
        ChoiceC.setFocusPainted(false);
        ChoiceC.addActionListener(ChoiceHandler);
        ChoiceC.setActionCommand("CC");
        StoryButtonPanel.add(ChoiceC);

        ChoiceD = new JButton();
        ChoiceD.setBackground(Color.black);
        ChoiceD.setForeground(Color.WHITE);
        ChoiceD.setFont(StatFont);
        ChoiceD.setFocusPainted(false);
        ChoiceD.addActionListener(ChoiceHandler);
        ChoiceD.setActionCommand("CD");
        StoryButtonPanel.add(ChoiceD);

        UserStatPanel = new JPanel();
        UserStatPanel.setBounds(50,35,700,50);
        UserStatPanel.setBackground(Color.black);
        UserStatPanel.setLayout(new GridLayout(1,10));
        cont.add(UserStatPanel);

        HPlabel = new JLabel("Health:");
        HPlabel.setFont(StatFont);
        HPlabel.setForeground(Color.WHITE);
        UserStatPanel.add(HPlabel);
        HPlabelUser = new JLabel();
        HPlabelUser.setFont(StatFont);
        HPlabelUser.setForeground(Color.WHITE);
        UserStatPanel.add(HPlabelUser);

        ArmourLabel = new JLabel("Armour:");
        ArmourLabel.setFont(StatFont);
        ArmourLabel.setForeground(Color.WHITE);
        UserStatPanel.add(ArmourLabel);
        ArmourLabelUser = new JLabel();
        ArmourLabelUser.setFont(StatFont);
        ArmourLabelUser.setForeground(Color.WHITE);
        UserStatPanel.add(ArmourLabelUser);

        StrengthLabel = new JLabel("Strength:");
        StrengthLabel.setFont(StatFont);
        StrengthLabel.setForeground(Color.WHITE);
        UserStatPanel.add(StrengthLabel);
        StrengthLabelUser = new JLabel();
        StrengthLabelUser.setFont(StatFont);
        StrengthLabelUser.setForeground(Color.WHITE);
        UserStatPanel.add(StrengthLabelUser);

        WeaponLabel = new JLabel("Weapon:");
        WeaponLabel.setFont(StatFont);
        WeaponLabel.setForeground(Color.WHITE);
        UserStatPanel.add(WeaponLabel);
        WeaponLabelUser = new JLabel();
        WeaponLabelUser.setFont(StatFont);
        WeaponLabelUser.setForeground(Color.WHITE);
        UserStatPanel.add(WeaponLabelUser);

        CharismaLabel = new JLabel("Charisma:");
        CharismaLabel.setFont(StatFont);
        CharismaLabel.setForeground(Color.WHITE);
        UserStatPanel.add(CharismaLabel);
        CharismaLabelUser = new JLabel();
        CharismaLabelUser.setFont(StatFont);
        CharismaLabelUser.setForeground(Color.WHITE);
        UserStatPanel.add(CharismaLabelUser);

        CharectarCreation();
        Scenarios.HomeStead();
    }
    public void CharectarCreation(){
        Weapon StartingWeapon = new Weapon(12,"Cutting",5.7,"Sword");
        user = new Player(100, 3, 0.15, 8, "Piercing",StartingWeapon , "Johnny",7, 1.45);
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ArmourLabelUser.setText(String.valueOf(user.getArmour()));
        StrengthLabelUser.setText(String.valueOf(user.getStrength()));
        WeaponLabelUser.setText(user.getWeapon().getName());
        CharismaLabelUser.setText(String.valueOf(user.getCharisma()));


    }





public class TitleScreenHandler implements ActionListener{
   public void actionPerformed(ActionEvent e) {
       CreateStoryScreen();

   }}

public class ChoiceHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String Choice = e.getActionCommand();

        switch (Event) {
            case "Homestead":
                switch (Choice) {
                    case "CA":

                        Scenarios.TalkFool();
                        break;
                    case "CB":
                        Scenarios.Forest();
                        break;
                    case "CC":
                        Scenarios.Castle();
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Fool_Conversation":
                switch (Choice) {
                    case "CA":
                        Scenarios.HomeStead();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Castle":
                switch (Choice) {
                    case "CA":
                        Scenarios.TalkGuard();
                        break;
                    case "CB":
                        Scenarios.OpenPlains();
                        break;
                    case "CC":
                        Scenarios.BurnedVillage();
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Guard_Conversation":
                switch (Choice) {
                    case "CA":
                        Scenarios.Castle();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Forest":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleA();
                        break;
                    case "CB":
                        Scenarios.BurnedVillage();
                        break;
                    case "CC":
                        Scenarios.Cave();
                        break;
                    case "CD":
                        Scenarios.Castle();
                        break;
                }
                break;
            case "Cave":
                switch (Choice) {
                    case "CA":
                        Scenarios.InnerCave();
                        break;
                    case "CB":
                        Scenarios.Caverns();
                        break;
                    case "CC":
                        Scenarios.Forest();
                        break;
                    case "CD":
                        break;
                }
            case "Inner_Cave":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleB();
                        break;
                    case "CB":
                        Scenarios.Cave();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Burned_Village":
                switch (Choice) {
                    case "CA":
                        Scenarios.Cave();
                        break;
                    case "CB":
                        Scenarios.Caverns();
                        break;
                    case "CC":
                        Scenarios.Ravine();
                        break;
                    case "CD":
                        Scenarios.TalkMadMan();
                        break;
                }
                break;
            case "Mad_Man_Conversation":
                switch (Choice) {
                    case "CA":
                        Scenarios.BurnedVillage();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Open_Plains":
                switch (Choice) {
                    case "CA":
                        Scenarios.Caverns();
                        break;
                    case "CB":
                        Scenarios.DeepBreath();
                        break;
                    case "CC":
                        Scenarios.Castle();
                        break;
                    case "CD":
                        Scenarios.PickObject();
                        break;
                }break;
            case "Plains_Dagger":
                switch (Choice) {
                    case "CA":
                        Scenarios.OpenPlains();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }break;

            case "Deep_Breath":
                switch (Choice) {
                    case "CA": Scenarios.OpenPlains();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Ravine":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleC();
                        break;
                    case "CB":
                        Scenarios.MountainBase();
                        break;
                    case "CC":
                        Scenarios.BurnedVillage();
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Caverns":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleD();
                        break; // Attack +Health Boost
                    case "CB":
                        Scenarios.BurnedVillage();
                        break;
                    case "CC":
                        Scenarios.TalkTroll();
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Talk_Troll":
                switch (Choice) {
                    case "CA":
                        Scenarios.MountainBase();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Troll_Conversation_Bad":
                switch (Choice) {
                    case "CA": Scenarios.BattleD();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;


            case "Mountain_Base":
                switch (Choice) {
                    case "CA":
                        Scenarios.Mountain();
                        break;
                    case "CB":
                        Scenarios.Mountain();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Mountain":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleE();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;

// PLAYER ATTACK SWITCH HANDLERS
            case "Player_AttackA":
                switch (Choice) {
                    case "CA":
                        Scenarios.EnemyAttackA();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Player_AttackB":
                switch (Choice) {
                    case "CA":
                        Scenarios.EnemyAttackB();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Player_AttackC":
                switch (Choice) {
                    case "CA":
                        Scenarios.EnemyAttackC();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Player_AttackD":
                switch (Choice) {
                    case "CA":
                        Scenarios.EnemyAttackD();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Player_AttackE":
                switch (Choice) {
                    case "CA":
                        Scenarios.EnemyAttackE();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
// ENEMY ATTACK SWITCH HANDLERS
            case "Enemy_AttackA":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleA();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
                case "Enemy_AttackB":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleB();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Enemy_AttackC":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleC();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Enemy_AttackD":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleD();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Enemy_AttackE":
                switch (Choice) {
                    case "CA":
                        Scenarios.BattleE();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
// BATTLE SWITCH HANDLERS
            case "BattleA":
                switch (Choice) {
                    case "CA":
                        Scenarios.AttackA();
                        break;
                    case "CB":
                        Scenarios.Forest();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "BattleB":
                switch (Choice) {
                    case "CA":
                        Scenarios.AttackB();
                        break;
                    case "CB":
                        Scenarios.Cave();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "BattleC":
                switch (Choice) {
                    case "CA":
                        Scenarios.AttackC();
                        break;
                    case "CB":
                        Scenarios.Ravine();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "BattleD":
                switch (Choice) {
                    case "CA":
                        Scenarios.AttackD();
                        break;
                    case "CB":Scenarios.Caverns();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "BattleE":
                switch (Choice) {
                    case "CA":
                        if(Dragon.getHealth() < 1)
                        {
                            Scenarios.win();
                        }
                        else
                        Scenarios.AttackE();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
//BATTLE SUCCESS HANDLERS
            case "Battle_SuccessA":
                switch (Choice) {
                    case "CA":
                        Weapon Spear = new Weapon(14,"Piercing",5.4,"Spear");
                        user.setWeapon(Spear);
                        WeaponLabelUser.setText(user.getWeapon().getName());
                        Scenarios.Forest();
                        break;
                    case "CB":
                        Scenarios.Forest();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Battle_SuccessB":
                switch (Choice) {
                    case "CA":
                        user.setHealth(user.getHealth()+ 10);
                        Scenarios.Cave();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "Battle_SuccessC":
                switch (Choice) {
                    case "CA":
                        Weapon Mace = new Weapon(12,"Bludgeon",7.4,"Mace");
                        user.setWeapon(Mace);
                        WeaponLabelUser.setText(user.getWeapon().getName());
                        Scenarios.Ravine();
                        break;
                    case "CB":
                        Scenarios.Ravine();
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }break;
            case "Battle_SuccessD":
                switch (Choice) {
                    case "CA":
                        user.setStrength(user.getStrength()+ 2);
                        StrengthLabelUser.setText(String.valueOf(user.getStrength()));
                        Scenarios.Caverns();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "lose":
                switch (Choice) {
                    case "CA":
                       new Main();
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;
            case "win":
                switch (Choice) {
                    case "CA":
                        break;
                    case "CB":
                        break;
                    case "CC":
                        break;
                    case "CD":
                        break;
                }
                break;





        }


    }

}}




