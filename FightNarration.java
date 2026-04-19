
public class FightNarration {

    public String attack;
    public String weapon;
    public String enemy;
    public String damage;
    public String magicRegain;
    public String staminaRegain;
    public String smallHealthRegain; //for dunedain
    public String largeHealthRegain; //for elf
    public String agilityRegain;

    public FightNarration() {}

    public String[][] heavyAttackNarration = {
        {"Your hurl forth with your " + weapon + " and land a mighty strike!",
            "With your " + weapon + " you lash out with a ferocious attack!" ,
            "You land your" + attack + "causing cataclysmic agony to the " + enemy + "!"},// player
        {enemy + "strikes forth with it's" + weapon + "inducing considerable pain.",
         "With " + weapon + " in hand" + enemy + " lunges at you."}// enemy
    };// heavy attack narration - magic excluded

    public String[][] regularAttackNarration = {
        {"Your charge forth with your " + weapon + " and descend upon the " + enemy + "!",
            "With your " + weapon + " at the ready you press your " + attack + " attack!",
            "You land your" + attack + "causing anguish to the " + enemy + "!"},// player
        {enemy + "strikes forth with it's" + weapon + "inflicting you grief.",
            "With " + weapon + " in hand" + enemy + " leeps at you."}// enemy
    };// regular attack narration - magic excluded

    public String[][] specialAttackNarration = {
        {"Your charge forth with your " + weapon + " and descend upon the " + enemy + "!",
            "With your " + weapon + " at the ready you press your " + attack + " attack!",
            "You land your" + attack + "causing anguish to the " + enemy + "!"},// player
        {enemy + "strikes forth with it's" + weapon + "inflicting you grief.",
            "With " + weapon + " in hand" + enemy + " leeps at you."}// enemy
    };// narration for special attacks - magic excluded

    public String[][] magicalAttackNarration = {
        {"You stand stalwart and send forth your" + attack + " attack upon the" + enemy + "!",
            "Your " + attack + " lands causing devistation to the " + enemy + "!"},// heavy
        {"With a resolute stance you launch  your " + attack + "with your " + weapon + "!",
            "Taking your " + weapon + " in hand you cast your " + attack + " upon the" + enemy + "!"},// regular
        {"Taking a moment to recenter your mana you strike out with your " + weapon + "and land it with a thud!",
            "Feeling brazen you steep forward and smack the " + enemy + " with your " + weapon + "!"}// special
    }; // narration for magic attacks
    
    public String[] blockNarration = {
        "You dart out for the way and have a moment to breath regaining " + staminaRegain + " pints of stamina and " + smallHealthRegain + " points of health!",
            "You move your " + weapon + " sidelong and block the incoming attack breathing for a moment while the " + enemy + " is stund and you regain " + staminaRegain + " points of stamina and " + smallHealthRegain + " points of health!",
            "Your raise your buckler and block the attack stuning the " + enemy + " giving you time to recenter and regain "  + staminaRegain + " points of stamina and " + smallHealthRegain + " points of health!",
            "Your raise your " + weapon + " athwart and block the attack stuning the " + enemy + " giving you time to recenter and regain "  + magicRegain + " points of magic and " + smallHealthRegain + " points of health!"
    }; //dual wield, heavy, one handed, stave

    public String[] abilityAttackNarration = {
        "You take a moment of repose and regain" + magicRegain + " points of magic and " + smallHealthRegain + " points of health!",
            "You take a moment of repose and regain" + staminaRegain + " points of stamina and " + smallHealthRegain + " points of health!",
            "You resolve your thoughts and strength and assault the " + enemy + " with devastating force",
            "You tap into the will of your ancestors and regain " + largeHealthRegain + " points of your health!",
            "You clear and center your mind rejuvenatign you and regaining " + agilityRegain + " points of your agility!"
    }; // only for the player in order of Magical Repose, Repose, Temper, Mend, Center
}