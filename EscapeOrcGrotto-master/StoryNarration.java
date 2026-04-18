
public class StoryNarration {
    public String race;
    public String warriorType;
    Color color = new Color();

    //store the string info for story
    //used to help organize printer class better

    public StoryNarration() {}

    public String[] mainStoryBeginning = {
       color.purple + "You wake up in a damp and dirty pen. The last thing you remember was fighting a hoard of orcs while travelling home from the Iron Mountains." + color.colorReset,
       color.purple + "You see a shield stuck in the wall, shining, you look into it."  + color.colorReset,
       color.purple + "\"Not bad looking for a beat up ....\"" + color.colorReset, // race choice
       color.purple + "Stupid creatures keeping you in a pen like cattle, like you can't just climb out!" + color.colorReset,
       color.purple + "All those years training is about to pay off and get you out of here." + color.colorReset, // warriorType and style Selction
       color.purple + "After clambering over the side you see a chest full of equipment." + color.colorReset,
       color.purple + "Walking over you notice that your favorite equipment is there." + color.colorReset, // weapon chioce
       color.purple + "Armed and ready to go you follow the path to the first chamber to freedom." + color.colorReset
    }; // main story arch

    public String[] chamberNarration = {
        color.purple + "You enter the first room and come upon one of those viel creatures time to teach it a lesson!" + color.colorReset,
        color.purple + "Moving into the next chamber there is yet another orc to be delt with" + color.colorReset,
        color.purple + "You are growing impatient with these creatures as you advance once more lucky for you there is another orc to take out your aggression on!" + color.colorReset,
        color.purple + "You can see light but one final foe remains the thrice damned leader of the clan Eog!" + color.colorReset
    }; // main story arch

    public String[] endStory = {
        color.purple + "Your are free! Finally you can return to your home lands of Arnor." + color.colorReset,
        color.purple + "Your are free! Finally you can return home to the Blue Mountains." + color.colorReset,
        color.purple + "Your are free! Finally you can return home to Lothlorien" + color.colorReset,
        color.purple + "Your are free! Finally you can return home to Edoras" + color.colorReset
    }; // main story arch

}//class