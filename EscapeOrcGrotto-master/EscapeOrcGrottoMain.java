
import java.util.Random;
import java.util.Scanner;

import armor.*;
import enemy.ChieftonOrc;
import enemy.ShamanOrc;
import warrior.*;
import weapon.*;
import enemy.*;

// reset stats and fix weapon abstraction will complete this sorry its not ready changed one thing and many broke
// make sure to put in stamina take away

public class EscapeOrcGrottoMain {

    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static Printer printer = new Printer();
    private static StatsNarration statsNarration = new StatsNarration();
    private static StoryNarration storyNarration = new StoryNarration();
    private static FightNarration fightNarration = new FightNarration();

    // race
    private static Warrior race;
    private static int raceChoice;
    private static String pRace;

    // armor type
    private static Armor armor;
    private static int armorChoice;
    private static String pArmor;

    // warrior type
    private static Warrior warrior;
    private static int warriorChoice;
    private static String pWarrior;

    // weapon
    private static Weapon weapon;
    private static int weaponChoice;
    private static String pWeapon;

    // attack
    private static Weapon attack;
    private static int attackChoice;
    private static String pAttack;

    //enemy
    private static Enemy enemy;
    private static String enemyName;

    private static boolean gameOver = false;
    private static boolean playerTurn = true; // player strikes first
    private static String who = "player";

    private StatsBar statsbar = new StatsBar();

    public static void main(String[] args) throws Exception {
        
        
        // armour
        System.out.println(storyNarration.mainStoryBeginning[0]);
        Thread.sleep(3500);
        System.out.println(storyNarration.mainStoryBeginning[1]);
        Thread.sleep(3500);
        System.out.println(storyNarration.mainStoryBeginning[2]);
        Thread.sleep(3500);
        System.out.println("What race are you?");
        printer.PrintRaceOptions();
        raceChoice = CreateRace(input.nextInt(), who);
        Climbing climbing = new Climbing();
        StatsBar statsBar = new StatsBar();
statsBar.updateBar();

        input.nextLine(); // clear

        // warrior
        System.out.println(storyNarration.mainStoryBeginning[3]);
        Thread.sleep(5000);
        System.out.println(storyNarration.mainStoryBeginning[4]);
        Thread.sleep(2500);
        System.out.println("What type of warrior are you?");
        printer.PrintWarriorTypeOptions(raceChoice); // prints warriors types
        warriorChoice = CreateWarriorType(input.nextInt(), who, raceChoice);
        input.nextLine();
        climbing.Climb();
        System.out.println("\n");

        Thread.sleep(1000);

        // weapon
        System.out.println(storyNarration.mainStoryBeginning[5]);
        Thread.sleep(3500);
        System.out.println(storyNarration.mainStoryBeginning[6]);
        System.out.println("Choose your armor => this also sets your class.");
        printer.PrintArmorOptions(warriorChoice); // prints armor
        armorChoice = CreateArmor(warriorChoice, input.nextInt(), who); 
        System.out.println("Choose your weapon.");
        printer.PrintWeaponOptions(warriorChoice); // prints wepons
        weaponChoice = CreateWeapon(warriorChoice, input.nextInt(), who); 
        System.out.println(storyNarration.mainStoryBeginning[7]);
        Thread.sleep(3500);

        // game loop
        for(int chamber = 1; chamber < 5; chamber ++){
            while (!gameOver) {
                
                if (playerTurn) {
                    System.out.println(storyNarration.chamberNarration[chamber-1]);
                    printer.PrintAttackOptions(warriorChoice);
                    int damage = CreateAttack(input.nextInt(), warriorChoice, who); // have to fix abstraction
    
                    printer.PrintWarriorStats(warrior, armor, pWarrior, pArmor);
                    printer.PrintPlayerAttackNarration(attackChoice, warriorChoice);
                    Thread.sleep(3000);
                    System.out.println("Your opponent has: " + enemy.TakeDamage(damage) + warrior.Detriment(attackChoice) + " health remaining!");
    
                    if (enemy.GetHealth() <= 0) {
                        gameOver = true;
                        break;
                    }
                    playerTurn = !playerTurn;
                } else {
                    int damage = enemy.GetEnemyDamage();
    
                    printer.PrintWarriorStats(warrior, armor, pWarrior, pArmor);
                    printer.PrintEnemyAttackNarration();
                    Thread.sleep(3000);
                    System.out.println("You have: " + warrior.TakeDamage(damage) + " health remaining!");
    
                    if (warrior.GetHealth() <= 0) {
                        gameOver = true;
                        break;
                    }
                    playerTurn = !playerTurn;
                }
                statsBar.updateBar();
                //reset stats
            }
            printer.PrintEnd(raceChoice);
        }
        
    } // main

    public static int CreateRace(int raceChoice, String who) {
        switch (raceChoice) {
        case 1: { // dunedain
            race = new Warrior();
            pRace = "Dunedain";
            break;
        }
        case 2: { // dwarf
            race = new Warrior();
            pRace = "Dwarf";
            break;
        }
        case 3: { // elf
            race = new Warrior();
            pRace = "Elf";
            break;
        }
        case 4: { // human
            race = new Warrior();
            pRace = "Human";
            break;
        }
        default: {
            // oops
        }
        }
        return raceChoice;
    }// create race
 
    public static int CreateWarriorType(int warriorChoice, String who, int raceChoice) {
        if (raceChoice == 1) { // dunedain
            switch (warriorChoice) {
            case 1: { // heavy
                warrior = new Warrior();
                pWarrior = "Knight";
                break;
            }
            case 2: { // balanced
                warrior = new Warrior();
                pWarrior = "Commander";
                break;
            }
            case 3: { // light
                warrior = new Warrior();
                pRace = "Ranger";
                break;
            }
            case 4: { // magic
                warrior = new Warrior();
                pWarrior = "Marshal";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (raceChoice == 2) { // dwarf
            switch (warriorChoice) {
            case 1: { // heavy
                warrior = new Warrior();
                pWarrior = "Beserker";
                break;
            }
            case 2: { // balanced
                warrior = new Warrior();
                pWarrior = "Housecarl";
                break;
            }
            case 3: { // light
                warrior = new Warrior();
                pRace = "Ruffian";
                break;
            }
            case 4: { // magic
                warrior = new Warrior();
                pWarrior = "Soothsayer";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (raceChoice == 3) { // elf
            switch (warriorChoice) {
            case 1: { // heavy
                warrior = new Warrior();
                pWarrior = "Guardian";
                break;
            }
            case 2: { // balanced
                warrior = new Warrior();
                pWarrior = "Vangaurd";
                break;
            }
            case 3: { // light
                warrior = new Warrior();
                pRace = "Stalker";
                break;
            }
            case 4: { // magic
                warrior = new Warrior();
                pWarrior = "Lore Master";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (raceChoice == 4) { // human
            switch (warriorChoice) {
            case 1: { // heavy
                warrior = new Warrior();
                pWarrior = "Champion";
                break;
            }
            case 2: { // balanced
                warrior = new Warrior();
                pWarrior = "Legate";
                break;
            }
            case 3: { // light
                warrior = new Warrior();
                pRace = "Rogue";
                break;
            }
            case 4: { // magic
                warrior = new Warrior();
                pWarrior = "Mage";
                break;
            }
            default: {
                // oops
            }
            }
        }
        return warriorChoice;
    }// create warrior type

    public static int CreateArmor(int warriorChoice, int armorChoice, String who) {
        if (warriorChoice == 1) { // heavy
            switch (armorChoice) {
            case 1: { //heavy
                armor = new armor.heavy.Heavy();
                pArmor = "Plate";
                break;
            }
            case 2: { // balanced
                armor = new armor.heavy.Heavy();
                pArmor = "Splint";
                break;
            }
            case 3: { // light
                armor = new armor.heavy.Heavy();
                pArmor = "Chain Mail";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (warriorChoice == 2) { // medium
            switch (armorChoice) {
             case 1: { //heavy
                armor = new armor.medium.Medium();
                pArmor = "Breast Plate";
                break;
            }
            case 2: { // balanced
                armor = new armor.medium.Medium();
                pArmor = "Scale";
                break;
            }
            case 3: { // light
                armor = new armor.medium.Medium();
                pArmor = "Hide";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (warriorChoice == 3 || warriorChoice == 4) { // light
            switch (armorChoice) {
             case 1: { //heavy
                armor = new armor.light.Light();
                pArmor = "Leather";
                break;
            }
            case 2: { // balanced
                armor = new armor.light.Light();
                pArmor = "Quilted";
                break;
            }
            case 3: { // light
                armor = new armor.light.Light();
                pArmor = "Robe";
                break;
            }
            default: {
                // oops
            }
            }
        }
        return armorChoice;
    }// create armor

    public static int CreateWeapon(int warriorChoice, int weaponChoice, String who) {
        if(warriorChoice == 1){ // heavy - two hand
            switch(weaponChoice) {
            case 1: { // heavy
                weapon = new weapon.twohanded.TwoHanded();
                pWeapon = "War Hammer";
                break;
            }
            case 2: { // balanced
                weapon = new weapon.twohanded.TwoHanded();
                pWeapon = "Battle Axe";
                break;
            }
            case 3: { // lightest
                weapon = new weapon.twohanded.TwoHanded();
                pWeapon = "Long Sword";
                break;
            }
            default: {
                // oops
            }
            }
        } else if(warriorChoice == 2){ // balanced - one hand
            switch(weaponChoice) {
                case 1: { // heavy
                    weapon = new weapon.onehanded.OneHanded();
                    pWeapon = "Mace and Buckler";
                    break;
                }
                case 2: { // balanced
                    weapon = new weapon.onehanded.OneHanded();
                    pWeapon = "Hand Axe and Buckler";
                    break;
                }
                case 3: { // light
                    weapon = new weapon.onehanded.OneHanded();
                    pWeapon = "Sword and Buckler";
                    break;
                }
                default: {
                    // oops
                } 
            }// switch
        }else if(warriorChoice == 3){ // light - dual weild
            switch(weaponChoice) {
                case 1: { // heavy
                    weapon = new weapon.dualwield.DualWield();
                    pWeapon = "Hatchet";
                    break;
                }
                case 2: { // balanced
                    weapon = new weapon.dualwield.DualWield();
                    pWeapon = "Daggers";
                    break;
                }
                case 3: { // light
                    weapon = new weapon.dualwield.DualWield();
                    pWeapon = "Sias";
                    break;
                }
                default: {
                    // oops
                }
            } // switch
        }else if(warriorChoice == 4){ // magic - staves
            switch(weaponChoice) {
                case 1: { // heavy
                    weapon = new weapon.stave.Stave();
                    pWeapon = "Bladed Stave";
                    break;
                }
                case 2: { // balanced
                    weapon = new weapon.stave.Stave();
                    pWeapon = "Trident";
                    break;
                }
                case 3: { // light
                    weapon = new weapon.stave.Stave();
                    pWeapon = "Scepter";
                    break;
                }
                default: {
                    // oops
                }
            } //switch
        } //if 
        return weaponChoice;   
    }//create weapon

    public static int CreateAttack(int attackChoice, int warriorChoice, String who) {
        if (warriorChoice == 1) { // two hand
            switch (attackChoice) {
            case 1: { //heavy
                attack = new weapon.twohanded.AttackHeavyWallop();
                pAttack = "Wallop";
                break;
            }
            case 2: { // balanced
                attack = new weapon.twohanded.AttackHeavyBlow();
                pAttack = "Heavy Blow";
                break;
            }
            case 3: { // special
                attack = new weapon.twohanded.AttackHeavySweep();
                pAttack = "Sweep";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (warriorChoice == 2) { // one hand
            switch (attackChoice) {
            case 1: { //heavy
                attack = new weapon.onehanded.AttackOneHandedHack();
                pAttack = "Hack";
                break;
            }
            case 2: { // balanced
                attack = new weapon.onehanded.AttackOneHandedStrike();
                pAttack = "Strike";
                break;
            }
            case 3: { // special
                attack = new weapon.onehanded.AttackShieldBash();
                pAttack = "Shield Bash";
                break;
            }
            default: {
                // oops
            }
            }
        } else if (warriorChoice == 3) { // dual
            switch (attackChoice) {
            case 1: { //heavy
                attack = new weapon.dualwield.AttackDualSavage();
                pAttack = "Dual Savage";
                break;
            }
            case 2: { // balancedwarriorChoice
                attack = new weapon.dualwield.AttackDualFury();
                pAttack = "Dual Furry";
                break;
            }
            case 3: { // special
                attack = new weapon.dualwield.AttackDualTusk();
                pAttack = "Dual Tusks";
                break;
            }
            default: {
                // oops
            }
            }
        }else if (warriorChoice == 4) { // magic
            switch (attackChoice) {
            case 1: { //heavy
            attack = new weapon.stave.AttackMagicExplosion();
            pAttack = "Magical Explosion";
            break;
            }
            case 2: { // balanced
            attack = new weapon.stave.AttackMagicClap();
            pAttack = "Magical Clap";
            break;
            }
            case 3: { // special
            attack = new weapon.stave.AttackStaveBash();
            pAttack = "Stave";
            break;
            }
            default: {
                // oops
            }
            }
        }
        return armorChoice; 
    }// create warrior type

    public static int CreateEnemy(int enemySpawn) {
        switch (enemySpawn) {
        case 1: { 
            enemy = new ShamanOrc();
            enemyName = "Shaman Orc";
            break;
        }
        case 2: { 
            enemy = new ScavengerOrc();
            enemyName = "ScavengerOrc";
            break;
        }
        case 3: {
            enemy = new ChieftonOrc();
            enemyName = "Chiefton Orc";
            break;
        }
        case 4: { 
            enemy = new OrcBoss();
            enemyName = "Eog";
            break;
        }
        default: {
            // oops
        }
        }
        return enemySpawn;
    }// create race
}//class