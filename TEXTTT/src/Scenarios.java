public class Scenarios extends Main {

    public static void Charectar() {
        Event = "Charectar";
        MainStory.setText("Thief\nFarmer\nSoldier\nwho are you?");
        ChoiceA.setText("Thief");
        ChoiceB.setText("Farmer");
        ChoiceC.setText("Soldier");
        ChoiceD.setText("Quit");
    }


    public static void HomeStead() {
        Event = "Homestead";
        MainStory.setText("You sharpen your blade and prepare to\nembark on your journey, The village fool \nbeckons for your attention, \nwhat do you do? ");
        ChoiceA.setText("Talk to the Fool");
        ChoiceB.setText("Head to the Forest");
        ChoiceC.setText("Head to the Castle");
        ChoiceD.setText("");
    }

    public static void Forest() {
        Event = "Forest";
        MainStory.setText("You enter a dark forest,A field of mist \nsurrounds the area, There is a cackling witch in the distance, what do you do?");
        ChoiceA.setText("Attack the witch");
        ChoiceB.setText("Head to the Burned Village");
        ChoiceC.setText("Head to the Cave");
        ChoiceD.setText("Retreat to the local castle.");
    }

    public static void Castle() {
        Event = "Castle";
        MainStory.setText("You approach a large recently attack\n castle, a guard stops you as you pass,\n what do you do? ");
        ChoiceA.setText("Talk to the Guard");
        ChoiceB.setText("Head to the Open Plains");
        ChoiceC.setText("Head to the Burned Village");
        ChoiceD.setText("");
    }

    public static void Cave() {
        Event = "Cave";
        MainStory.setText("A large cave blocks the path, \nyou can hear shuffling inside,\n what do you do? ");
        ChoiceA.setText("Enter the cave");
        ChoiceB.setText("leave, Head to the Caverns");
        ChoiceC.setText("Retreat to the Forest");
        ChoiceD.setText("");
    }

    public static void InnerCave() {
        Event = "Inner_Cave";
        MainStory.setText("You can see a glow in the distance\n an ork stands in your way,\n what do you do? ");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Exit the Cave");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void BurnedVillage() {
        Event = "Burned_Village";
        MainStory.setText("You enter a recently torched \nvillage a screaming stranger approaches\n what do you do? ");
        ChoiceA.setText("Head to the cave");
        ChoiceB.setText(" Head to the Caverns");
        ChoiceC.setText("Head to the Ravine");
        ChoiceD.setText("Talk to the Mad Man");
    }

    public static void OpenPlains() {
        Event = "Open_Plains";
        MainStory.setText("Your in a wide open plane, the air is fresh and the grass soft\n what do you do? ");
        ChoiceA.setText("Head to the caverns");
        ChoiceB.setText("Take a deep Breathe");
        ChoiceC.setText("Head back to the Castle");
        ChoiceD.setText("Pick up Object");
    }

    public static void Ravine() {
        Event = "Ravine";
        MainStory.setText("You are in a wide Crumbling Ravine, a goblin scremas in the distance and charges at you\n what do you do? ");
        ChoiceA.setText("Attack the Goblin");
        ChoiceB.setText("Head to the Mountain Base");
        ChoiceC.setText("Head back to the Burned Village");
        ChoiceD.setText("");
    }

    public static void Caverns() {
        Event = "Caverns";
        MainStory.setText("You enter a decaying cavern,\na Troll blocks the path to the Mountain \n what do you do? ");
        ChoiceA.setText("Attack the Troll");
        ChoiceB.setText("Head Back to the Burned Village");
        ChoiceC.setText("Talk to the troll");
        ChoiceD.setText("Head to the Base of the Mountain");
    }

    public static void MountainBase() {
        Event = "Mountain_Base";
        MainStory.setText("There is no retreating, The dragon sits atop the mountain\n what do you do? ");
        ChoiceA.setText("Scale the mountain");
        ChoiceB.setText("Climb inside and Scale from within");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void Mountain() {
        Event = "Mountain";
        MainStory.setText("The dragon growls, it scurries towards you\n what do you do? ");
        ChoiceA.setText("Attack the Dragon");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }


    public static void TalkGuard() {
        Event = "Guard_Conversation";
        if (user.getDexterity() >= 6) {
            MainStory.setText("Go through the burned village\n and down past the Ravine,\n Hes there!!");
        } else
            MainStory.setText("Stay Back Wanderer!! \nWe barely survived the siege!");
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void TalkFool() {
        Event = "Fool_Conversation";
        MainStory.setText("Insanity is doing the same thing over and\n over... Click AGAIN");
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void TalkMadMan() {
        Event = "Mad_Man_Conversation";
        if (user.getCharisma() > 5) {
            MainStory.setText("The ting goes skrrrahh, pap, pap, ka-ka-ka. \n" +
                    "Skibiki-pap-pap, and a \npu-pu-pudrrrr-boom. Skya, \ndu-du-ku-ku-dun-dun. Poom, \npoom");
        } else if (user.getCharisma() > 7 && user.getIntelligence() > 6) {
            MainStory.setText("The bigger beast headed\n to the caverns, Maybe he was just\n sad?!");
        } else {
            MainStory.setText("Insanity is doing the same thing over and\n over... Click AGAIN");
        }
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");

    }

    public static void DeepBreath() {
        Event = "Deep_Breath";
        if (use == 0) {
            user.setHealth(user.getHealth() + 10);
            MainStory.setText("The air is cold, you feel alive, +10hp");
            HPlabelUser.setText(String.valueOf(user.getHealth()));
            use = 1;}
        else {
            MainStory.setText("\"I should really be moving on\"");
        }
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void PickObject() {
        Event = "Plains_Dagger";
        MainStory.setText("You have found Dagger on the ground");
        Weapon Dagger = new Weapon(15,"Cutting",1.3,"Dagger");
        user.setWeapon(Dagger);
        WeaponLabelUser.setText(user.getWeapon().getName());
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void TalkTroll() {
        Event = "Troll_Conversation";
        if (user.getCharisma() > 7) {
            MainStory.setText("Everybody assumes I'm evil,\n pass stranger, let me be.");
            ChoiceA.setText("Head to the Base of the Mountain");
            ChoiceB.setText("");
            ChoiceC.setText("");
            ChoiceD.setText("");
        }

    else{
        TalkTrollBad();
    }}

    public static void TalkTrollBad(){
     Event = "Troll_Conversation_Bad";
        MainStory.setText("ILL KILL YOU BEFORE YOU KILL ME!");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    // Battle start Methods
    public static void BattleA(){

        if(TriggerA == 0) {
            Witch = new EnemyConstructor(130, 2, (double) 5, "Witch", "Bludgeon");
        }
        if(Witch.getHealth() < 0)
        {
            AliveA=false;
            BattleSuccessA();
        }
        else if(user.getHealth() < 0){
            lose();
        }

        else{
        Event = "BattleA";
        MainStory.setText("You face a " + Witch.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
            TriggerA = 1;
    }}
    public static void BattleB(){
        if(TriggerB == 0) {
            Ork = new EnemyConstructor(140, 3, (double) 3, "Orc", "Bludgeon");
        }
        if(Ork.getHealth() < 1)
        {
            AliveB=false;
            BattleSuccessB();
        }
        else if(user.getHealth() < 0){
            lose();
        }
        else{
        Event = "BattleB";
        MainStory.setText("You face a " + Ork.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
        TriggerB = 1;
    }}
    public static void BattleC(){
        if(TriggerC == 0) {
            Goblin = new EnemyConstructor(150, 4, (double) 3, "Goblin", "Cutting");
        }
        if(Goblin.getHealth() < 1)
        {
            AliveC=false;
            BattleSuccessC();
        }
        else if(user.getHealth() < 0){
            lose();
        }
        else{
        Event = "BattleC";
        MainStory.setText("You face a " + Goblin.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
        TriggerC = 1;
    }}
    public static void BattleD(){
        if(TriggerD == 0) {
            Troll = new EnemyConstructor(160, 6, (double) 4, "Troll" , "Piercing");
        }
        if(Troll.getHealth() < 1)
        {
            AliveD=false;
            BattleSuccessD();
        }
        if(user.getHealth() < 0){
            lose();
        }
        else{
        Event = "BattleD";
        MainStory.setText("You face a " + Troll.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
        TriggerD = 1;
    }}
    public static void BattleE(){
        if(TriggerE == 0) {
            Dragon = new EnemyConstructor(240, 5, (double) 8, "Dragon", "Bludgeon");
        }
        if(user.getHealth() < 0){
            lose();
        }
        else{
        Event = "BattleE";
        MainStory.setText("You face a " + Dragon.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
        TriggerE = 1;
    }}



    // Player Attack Methods
    public static void AttackA(){
        Event = "Player_AttackA";
        Attack(Witch);
        MainStory.setText("You Strike the " + Witch.getName() + ",\n Enemy has "+ String.format("%.2f",Witch.getHealth()) + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackB(){
        Event = "Player_AttackB";
        Attack(Ork);
        MainStory.setText("You Strike the " + Ork.getName() + ",\n Enemy has "+ String.format("%.2f",Ork.getHealth()) + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackC(){
        Event = "Player_AttackC";
        Attack(Goblin);
        MainStory.setText("You Strike the " + Goblin.getName() + ",\n Enemy has "+ String.format("%.2f",Goblin.getHealth()) + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackD(){
        Event = "Player_AttackD";
        Attack(Troll);
        MainStory.setText("You Strike the " + Troll.getName() + ",\n Enemy has "+ String.format("%.2f",Troll.getHealth()) + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackE(){
        Event = "Player_AttackE";
        Attack(Dragon);
        MainStory.setText("You Strike the " + Dragon.getName() + ",\n Enemy has "+ String.format("%.2f",Dragon.getHealth()) + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    //Enemy Attack Methods
    public static void EnemyAttackA(){
        CreatureAttack(Witch,user);
        Event = "Enemy_AttackA";
        MainStory.setText(Witch.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackB(){
        CreatureAttack(Ork,user);
        Event = "Enemy_AttackB";
        MainStory.setText(Ork.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackC(){
        CreatureAttack(Goblin,user);
        Event = "Enemy_AttackC";
        MainStory.setText(Goblin.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackD(){
        CreatureAttack(Troll,user);
        Event = "Enemy_AttackD";
        MainStory.setText(Troll.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackE(){
        CreatureAttack(Dragon,user);
        Event = "Enemy_AttackE";
        MainStory.setText(Dragon.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleSuccessA(){
        Event = "Battle_SuccessA";
        MainStory.setText("The Witch has been slain\n She dropped a spear,\n what do you do?");
        ChoiceA.setText("Take it and Leave");
        ChoiceB.setText("Leave");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleSuccessB(){
        Event = "Battle_SuccessB";
        MainStory.setText("The Ork has been slain\n He dropped a strange looking bottle,\n you drink it. +10HP");
        ChoiceA.setText("Leave");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleSuccessC(){
        Event = "Battle_SuccessC";
        MainStory.setText("The Goblin has been slain\n He dropped a Mace,\n what do you do?");
        ChoiceA.setText("Take it and Leave");
        ChoiceB.setText("Leave");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleSuccessD(){
        Event = "Battle_SuccessD";
        MainStory.setText("The Troll has been slain\n He dropped a Flask,\n You drink it. + 2 strength");
        ChoiceA.setText("Leave");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }

    public static void lose(){
        Event = "lose";
        MainStory.setText("You have been killed.\n Better luck next time.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void win(){
        Event = "win";
        MainStory.setText("You have beaten the boss.\n Congrats on winning.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }






    public static EnemyConstructor Attack(EnemyConstructor Enemey){
        double Multiplier = 0;
        Multiplier += user.getHeight() * (user.getAttackDamage()/12);
        Multiplier += user.getWeapon().getWeight()*(user.getAttackDamage()/18);
        Multiplier += (user.getStrength()/115)* user.getAttackDamage();
        if(user.getWeapon().getDamage_Type() == Enemey.getVulnerability()){
            Multiplier+= 0.25;
        }
        double Damage = user.getAttackDamage()*Multiplier;
        Enemey.setHealth(Enemey.getHealth() - Damage);
        return Enemey;

    }
    public static void CreatureAttack(EnemyConstructor Enemey, Player User){
        double Multiplier = 0;
        Multiplier += Enemey.getStrength()*(Enemey.getAttackDamage()/2);
        double Damage = Enemey.getAttackDamage()*Multiplier;
        User.setHealth(User.getHealth() - Damage);
}}

