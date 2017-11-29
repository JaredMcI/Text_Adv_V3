public class Scenarios extends Main {

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
        MainStory.setText("You enter a dark forest,A field of mist surrounds the area, There is a cackling witch in the distance, what do you do?");
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
        MainStory.setText("A large cave blocks the path, you can hear shuffling inside,\n what do you do? ");
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
        MainStory.setText("You enter a recently torched village< a screaming stranger approaches\n what do you do? ");
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
        Event = "Deep_Breathe";
        if (use == 0) {
            user.setHealth(user.getHealth() + 10);
            use = 1;
            MainStory.setText("The air is cold, you feel alive, +10hp");
            HPlabelUser.setText(String.valueOf(user.getHealth()));
        } else {
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
        Event = "BattleA";
        MainStory.setText("You face a " + Witch.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleB(Creature opponent){
        Event = "BattleB";
        MainStory.setText("You face a " + opponent.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleC(Creature opponent){
        Event = "BattleC";
        MainStory.setText("You face a " + opponent.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleD(Creature opponent){
        Event = "BattleD";
        MainStory.setText("You face a " + opponent.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("Retreat");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void BattleE(Creature opponent){
        Event = "BattleE";
        MainStory.setText("You face a " + opponent.getName() + ", \n what do you do?");
        ChoiceA.setText("Attack");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }



    // Player Attack Methods
    public static void AttackA(){
        Event = "Player_AttackA";
        Attack(user, Witch);
        MainStory.setText("You Strike the " + Witch.getName() + ", Enemy has "+ Witch.getHealth() + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackB(Creature Enemy){
        Event = "Player_AttackB";
        Attack(user,Enemy);
        MainStory.setText("You Strike the " + Creature.getName() + ", Enemy has "+ Creature.getHealth() + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackC(Creature Enemy){
        Event = "Player_AttackC";
        Attack(user,Enemy);
        MainStory.setText("You Strike the " + Creature.getName() + ", Enemy has "+ Creature.getHealth() + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackD(Creature Enemy){
        Event = "Player_AttackD";
        Attack(user,Enemy);
        MainStory.setText("You Strike the " + Creature.getName() + ", Enemy has "+ Creature.getHealth() + "HP left.");
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void AttackE(Creature Enemy){
        Event = "Player_AttackE";
        Attack(user,Enemy);
        MainStory.setText("You Strike the " + Creature.getName() + ", Enemy has "+ Creature.getHealth() + "HP left.");
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
        Creature.Attack(user);
        Event = "Enemy_AttackB";
        MainStory.setText(Creature.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackC(){
        Creature.Attack(user);
        Event = "Enemy_AttackC";
        MainStory.setText(Creature.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackD(){
        Creature.Attack(user);
        Event = "Enemy_AttackD";
        MainStory.setText(Creature.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void EnemyAttackE(){
        CreatureAttack(Witch,user);
        Event = "Enemy_AttackE";
        MainStory.setText(Creature.getName() + " strikes you,\n You have "+ user.getHealth() + "HP left.");
        HPlabelUser.setText(String.valueOf(user.getHealth()));
        ChoiceA.setText("Next");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }



    public static void Attack(Player User, Creature Enemey){
        Enemey.setHealth(Enemey.getHealth() - User.getWeapon().getDamage());

    }
    public static void CreatureAttack(Creature Enemey, Player User){
        User.setHealth(User.getHealth() - Enemey.getWeapon().getDamage());


}}

