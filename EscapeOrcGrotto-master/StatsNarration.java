
public class StatsNarration {
    Color color = new Color();

    //store the string info to display to the play during character creation here
    //used to help organize printer class better

    public StatsNarration() {}

    public String[][] warriorRace = {
        {"Dunedain", "Dwarf" , "Elf", "Human"},// Race
        {color.green + " => Tall and Versatile slight boost to all stats" + color.colorReset,
        color.red + " => Short and Strong ++ Stamina -- Agility" + color.colorReset, 
        color.cyan + " => Lanky and Magical ++ Magic -- Health" + color.colorReset,
        color.yellow + " => Average and Hearty ++ Health -- Magic" + color.colorReset}// Race Info
    };

    String[][] warriorType = {
        {"Knight", "Comander", "Ranger","Marshal"},// Dunedain
        {"Beserker", "Housecarl", "Ruffian","Soothsayer"},// Dwarf
        {"Guardian", "Vanguard", "Stalker","Lore Master"},// Elf
        {"Champion", "Legate", "Rogue","Mage"},// Human
        {color.red + "- Tank => ++ Health" + color.colorReset,
        color.green + "- Balanced Fighter => slight boost to all regular stats" + color.colorReset,
        color.yellow + "- Light Melee => ++Agility" + color.colorReset,
        color.cyan + "- Magical => Only Warrior to use Magic" + color.colorReset} // type info
    };

    String[][] ArmorOptions = {
        {"Plate", "Splint", "Chain Mail"},// heavy
        {"Breat Plate", "Scale", "Hide"},// medium
        {"Leather", "Quilted", "Robe"},// light
        {color.red + "- Heaviest armour higher armor points buthigher debuff" + color.colorReset,
        color.yellow + "- Medium weight armor gives a balance of armor points vs debuff" + color.colorReset,
         color.cyan +"- Lightest weight in this class lowest armor rating but lowest debuff" + color.colorReset} // type info
    };

    String[][] weaponStyle = {
        {"Heavy Style", "One Handed Style", "Dual Wield Style", "Stave Style"},// style
        {" Tanks go for these Weapons to deal the most DPH they can",
            " Balanced Warriors Prefer One Handed Weapons with a Buckler in their off hand",
            " Light Melee warriors use a Weapon in each hand to quickly deal Damage with smaller amounts of exertion",
            " Magical Warriors channel their Mana through these mystical Weapons"}// style description
    };

    String[][] weaponType = {
        {"War Hammer", "Battle Axe", "Long Sword" }, // heavy
        {"Mace and Buckler", "Hand Axe and Buckler", "Sword and Buckler"}, // one handed
        {"Hatchet", "Daggers", "Sias"}, // dual wield
        {"Bladed Stave", "Trident", "Scepter"},// stave
        
        {color.red + " => +++ DPH +++ Stamina use" + color.colorReset,
        color.yellow + " => ++ DPH and ++ Stamina use" + color.colorReset,
        color.blue + " => + Stamina use + DPH" + color.colorReset},// info 
        
        {color.cyan + " => +++ DPH +++ Magic use" + color.colorReset,
        color.blue + " => ++ DPH and ++ Magic use" + color.colorReset,
        color.red + " => + DPH + Magic use" + color.colorReset},// info for magic
    };

    String[][] attackType = {
        {"Heavy Wallop", "Heavy Blow", "Sweep", "Block" }, // heavy
        {"- Heavy Attack => +++ DPH +++ Stamina use" + color.red + "------ \"Strike forth with a devastating strength!\"" + color.colorReset,
            "- Regular Attack => ++ DPH and ++ Stamina use" + color.yellow + " ------ \"Conserve your energy for repeated blows!\"" + color.colorReset, 
            "- Special => Can only use once per Battle" + color.green + " ------ \"Knock your enemy to the ground damaging them and getting a rest for yourself!\"" + color.colorReset},
            //"- Block => block the incoming damage ------ \"Block the incoming attack to take a break from the onslaught \"" + color.colorReset},//info heavy Type attacks
        
        {"Hack", "Strike", "Shield Bash", "Block"}, // one handed
        {"- Heavy Attack => +++ DPH +++ Stamina use" + color.red + " ------ \"Strike forth with a devastating strength!\"" + color.colorReset,
            "- Regular Attack => ++ DPH and ++ Stamina use" + color.yellow + " ------ \"Conserve your energy for repeated blows!\"" + color.colorReset, 
            "- Special => Can only use once per Battle" + color.green + " ------ \"Knock your enemy to the ground with your shield and take a moment to breath!\"" + color.colorReset},
            //"Block => block the incoming damage ------ \"Block the incoming attack to take a break from the onslaught \""},//info one hand Type attacks
        
        {"Dual Savage", "Dual Fury", "Dual Tusks", "Dodge"}, // dual wield
        {"- Heavy Attack => +++ DPH +++ Stamina use" + color.red + " ------ \"Strike forth with a devastating strength!\"" + color.colorReset,
            "- Regular Attack => ++ DPH and ++ Stamina use" + color.yellow + " ------ \"Conserve your energy for repeated blows!\"" + color.colorReset, 
            "- Special => Can only use once per Battle ------ \"Knock your enemy to the ground with this jump attack and take a moment to breath!\"" + color.colorReset},
            //"Block => block the incoming damage ------ \"Block the incoming attack to take a break from the onslaught \""},//info dual wield Type attacks
        
        {"Magic Explosion", "Magic Clap", "Stave Bash", "Block"},// stave
        {"- Heavy Attack => +++ DPH +++ Stamina use" + color.red + " ------ \"Strike forth with a devastating strength!\"" + color.colorReset,
            "- Regular Attack => ++ DPH and ++ Stamina use" + color.yellow + " ------ \"Conserve your energy for repeated blows!\"" + color.colorReset, 
            "- Special => Can only use once per Battle" + color.green + " ------ \"Knock your enemy to the ground with a whack and take a moment to breath!\"" + color.colorReset},
            //"Block => block the incoming damage ------ \"Block the incoming attack to take a break from the onslaught \""},//info one hand Type attacks
    };

    String[][] raceAbility = {
        {"Magical Repose", "Repose" , "Resolve", "Mend", "Center"},// race ability
        {   " => Dunedain can take a moment to repose and regain some magic and health",
            " => Dunedain can take a moment to repose and regain some stamina and health",
            " => Dwarves can temper themselves of an exceedingly strong attack", 
            " => Elves can use their inherant vigor and heal themselves moderately" , 
            " => Humans can take a moment during battle to refocus their mind and regain moderate stamina"} //ability info
    };

    

}//class