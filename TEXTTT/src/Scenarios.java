public class Scenarios extends Main {

    public static void HomeStead(){
        Event =  "Homestead";
        MainStory.setText("You sharpen your blade and prepare to\nembark on your journey, The village fool \nbeckons for your attention, \nwhat do you do? ");
        ChoiceA.setText("Talk to the Fool");
        ChoiceB.setText("Head to the Forest");
        ChoiceC.setText("Head to the Castle");
        ChoiceD.setText("");
    }
    public static void Forest(){
        Event =  "Forest";
        MainStory.setText("You enter a dark forest,A field of mist surrounds the area, There is a cackling witch in the distance, what do you do?");
        ChoiceA.setText("Attack the witch");
        ChoiceB.setText("Head to the Burned Village");
        ChoiceC.setText("Head to the Cave");
        ChoiceD.setText("Retreat to the local castle.");
    }
    public static void Castle(){
        Event =  "Castle";
        MainStory.setText("You approach a large recently attack\n castle, a guard stops you as you pass,\n what do you do? ");
        ChoiceA.setText("Talk to the Guard");
        ChoiceB.setText("Head to the Open Plains");
        ChoiceC.setText("Head to the Burned Village");
        ChoiceD.setText("");
} public static void Cave() {
        Event = "Cave";
        MainStory.setText("A large cave blocks the path, you can hear shuffling inside,\n what do you do? ");
        ChoiceA.setText("Enter the cave");
        ChoiceB.setText("leave, Head to the Caverns");
        ChoiceC.setText("Retreat to the Forest");
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
        ChoiceD.setText("");
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
    public static void MountainBase(){
        Event = "Mountain_Base";
        MainStory.setText("There is no retreating, The dragon sits atop the mountain\n what do you do? ");
        ChoiceA.setText("Scale the mountain");
        ChoiceB.setText("Climb inside and Scale from within");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
    public static void Mountain(){
        Event = "Mountain";
        MainStory.setText("The dragon growls, it scurries towards you\n what do you do? ");
        ChoiceA.setText("Attack the Dragon");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }





    public static void TalkGuard(){
        Event =  "Guard_Conversation";
        if(user.getDexterity() >= 6){
        MainStory.setText("Go through the burned village\n and down past the Ravine,\n Hes there!!");
        }
        else
            MainStory.setText("Stay Back Wanderer!! \nWe barely survived the siege!");
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
        }
    public static void TalkFool(){
        Event = "Fool_Conversation";
        MainStory.setText("Insanity is doing the same thing over and\n over... Click AGAIN");
        ChoiceA.setText("Go Back");
        ChoiceB.setText("");
        ChoiceC.setText("");
        ChoiceD.setText("");
    }
}
