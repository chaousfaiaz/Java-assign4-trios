
//for the printing on the console
//StatsStrings strings for player character choices
//StoryStrings strings for story
//FightStrings strings for fights


import armor.*;
import warrior.*;
import java.util.*;

public class Printer {
    private static Random randNum = new Random();
    public StatsNarration statsNarration = new StatsNarration();
    public StoryNarration storyNarration = new StoryNarration();
    public FightNarration fightNarration = new FightNarration();
    Color color = new Color();

    
    public Printer() {}

    public void PrintRaceOptions() {
        int race = 0;
        for(int col = 0; col < statsNarration.warriorRace[race].length; col++) {
            System.out.println(col + 1 + ") " + statsNarration.warriorRace[race][col] +
            statsNarration.warriorRace[1][col] );
            
        }
    } // PrintRaceOptions()

    public void PrintWarriorTypeOptions(int raceChoice) {
        for(int col = 0; col < statsNarration.warriorType[raceChoice - 1].length; col++) {
            System.out.println(col + 1 + ") " + statsNarration.warriorType[raceChoice - 1][col] +
            statsNarration.warriorType[4][col] );
        }
    } //PrintWarriorTypeOptions()

    public void PrintArmorOptions(int warriorChoice) {
        if(warriorChoice == 1){
            for(int col = 0; col < statsNarration.ArmorOptions[0].length; col++) {
                System.out.println(col + 1 + ") " + statsNarration.ArmorOptions[0][col] +
                statsNarration.ArmorOptions[3][col] );
            }
        }else if(warriorChoice == 2){
            for(int col = 0; col < statsNarration.ArmorOptions[1].length; col++) {
                System.out.println(col + 1 + ") " + statsNarration.ArmorOptions[1][col] +
                statsNarration.ArmorOptions[3][col] );
            }
        }else if(warriorChoice == 3 || warriorChoice == 4){
            for(int col = 0; col < statsNarration.ArmorOptions[2].length; col++) {
                System.out.println(col + 1 + ") " + statsNarration.ArmorOptions[2][col] +
                statsNarration.ArmorOptions[3][col] );
            }
        } 
    } //PrintWarriorTypeOptions()

    public void PrintWeaponOptions(int warriorChoice) {
        if(warriorChoice == 4){
            for(int col = 0; col < statsNarration.weaponType[warriorChoice - 1].length; col++) {
                System.out.println(col + 1 + ") " + statsNarration.weaponType[warriorChoice - 1][col] +
                statsNarration.weaponType[5][col] );
            }
        }else {
            for(int col = 0; col < statsNarration.weaponType[warriorChoice - 1].length; col++) {
                System.out.println(col + 1 + ") " + statsNarration.weaponType[warriorChoice - 1][col] +
                statsNarration.weaponType[4][col] );
            }
        }
    } //PrintWeaponWeaponOptions()

    public void PrintWarriorStats(Warrior warrior, Armor armor, String pWarrior, String pArmor) {
        int stamina = warrior.GetStamina();
        int health =  warrior.GetHealth();
        int armorRating = armor.GetArmorPoints() + armor.GetAgilityBuffer() - armor.GetStaminaDebuff();
        System.out.println(color.cyan +"================ "+ pWarrior + "======================="+ color.colorReset);
        System.out.printf("%20s%20s%20s", "Health", "Stamina","Armor Rating for: " + pArmor);
        System.out.printf("%20d%20d%20d",  color.red + health + color.colorReset , 
        color.green + stamina + color.colorReset, color.yellow + armorRating + color.colorReset);

    }

    public void PrintAttackOptions(int warriorChoice) {
        if(warriorChoice == 1){
            for(int col = 0; col < statsNarration.attackType[0].length;) {
                System.out.println(col + ") " + statsNarration.attackType[1][randNum.nextInt(col)] + " - " +
                statsNarration.attackType[1][randNum.nextInt(col)]
                );
            }
        }else if(warriorChoice == 2){
            for(int col = 0; col < statsNarration.attackType[2].length;) {
                System.out.println(col + ") " + statsNarration.attackType[2][randNum.nextInt(col)] + " - " +
                statsNarration.attackType[3][randNum.nextInt(col)]
                );
            }
        }else if(warriorChoice == 3){
            for(int col = 0; col < statsNarration.attackType[4].length;) {
                System.out.println(col + ") " + statsNarration.attackType[4][randNum.nextInt(col)] + " - " +
                statsNarration.attackType[5][randNum.nextInt(col)]
                );
            }
        }else{
            for(int col = 0; col < statsNarration.attackType[6].length;) {
                System.out.println(col + ") " + statsNarration.attackType[6][randNum.nextInt(col)] + " - " +
                statsNarration.attackType[7][randNum.nextInt(col)]
                );
            }
        }
    } // attack options

    public void PrintPlayerAttackNarration(int attackChoice, int warriorChoice) {
        if(attackChoice == 1 && (warriorChoice == 1 || warriorChoice == 2 || warriorChoice == 3 )){
            for(int col = 0; col < fightNarration.heavyAttackNarration[0].length;) {
                System.out.println(fightNarration.heavyAttackNarration[0][randNum.nextInt(col)]);
            }        
        }else if(attackChoice == 2 && (warriorChoice == 1 || warriorChoice == 2 || warriorChoice == 3 )){
            for(int col = 0; col < fightNarration.regularAttackNarration[0].length;) {
                System.out.println(fightNarration.regularAttackNarration[0][randNum.nextInt(col)]);
            }
        }else if(attackChoice == 3 && (warriorChoice == 1 || warriorChoice == 2 || warriorChoice == 3 )){
            for(int col = 0; col < fightNarration.specialAttackNarration[0].length;) {
                System.out.println(fightNarration.specialAttackNarration[0][randNum.nextInt(col)]);
            }
        } else if(attackChoice == 1 && warriorChoice == 4){
            for(int col = 0; col < fightNarration.magicalAttackNarration[0].length;) {
                System.out.println(fightNarration.magicalAttackNarration[0][randNum.nextInt(col)]);
            }        
        } else if(attackChoice == 2 && warriorChoice == 4){
            for(int col = 0; col < fightNarration.magicalAttackNarration[1].length;) {
                System.out.println(fightNarration.magicalAttackNarration[1][randNum.nextInt(col)]);
            }        
        } else if(attackChoice == 1 && warriorChoice == 4){
            for(int col = 0; col < fightNarration.magicalAttackNarration[2].length;) {
                System.out.println(fightNarration.magicalAttackNarration[2][randNum.nextInt(col)]);
            }        
        }
    } // play attack

    public void PrintEnemyAttackNarration() {
        int enemyAttack = randNum.nextInt(2);
        if(enemyAttack == 1){
            for(int col = 0; col < fightNarration.heavyAttackNarration[1].length;) {
                System.out.println(fightNarration.heavyAttackNarration[1][randNum.nextInt(col)]);
            }        
        } else if(enemyAttack == 2){
            for(int col = 0; col < fightNarration.regularAttackNarration[1].length;) {
                System.out.println(fightNarration.regularAttackNarration[1][randNum.nextInt(col)]);
            }
        }
    } // enemy attack

    public void PrintEnd(int raceChoice) {
            System.out.println(storyNarration.endStory[raceChoice - 1]);
    } // print end

} // class