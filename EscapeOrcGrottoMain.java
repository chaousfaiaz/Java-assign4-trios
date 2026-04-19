import armor.*;
import armor.heavy.*;
import armor.light.*;
import armor.medium.*;
import enemy.*;
import java.util.Random;
import java.util.Scanner;
import warrior.*;
import warrior.dunedain.*;
import warrior.dwarf.*;
import warrior.elf.*;
import warrior.human.*;
import weapon.*;
import weapon.dualwield.*;
import weapon.onehanded.*;
import weapon.stave.*;
import weapon.twohanded.*;

public class EscapeOrcGrottoMain {

    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static Printer printer = new Printer();
    
    // Player Character Objects
    private static Warrior player;
    private static Armor playerArmor;
    private static Weapon playerWeapon;
    private static Enemy currentEnemy;

    private static boolean gameOver = false;

    public static void main(String[] args) {
        try {
            System.out.println("--- WELCOME TO ESCAPE FROM ORC GROTTO ---");
            
            // 1. Character Creation
            setupCharacter();

            // 2. The Climb Animation
            Climbing climbing = new Climbing();
            climbing.Climb();

            // 3. The Adventure Loop (Chambers)
            for (int chamber = 0; chamber < 4 && !gameOver; chamber++) {
                System.out.println("\n" + printer.storyNarration.chamberNarration[chamber]);
                
                // Spawn Enemy
                spawnEnemy(chamber + 1);
                
                // Combat Loop
                while (currentEnemy.GetHealth() > 0 && player.GetHealth() > 0) {
                    combatTurn();
                }

                if (player.GetHealth() <= 0) {
                    System.out.println("You have fallen in the grotto...");
                    gameOver = true;
                } else {
                    System.out.println("You defeated the " + currentEnemy.GetType() + "!");
                    healPlayer();
                }
            }

            if (!gameOver) {
                displayEnding();
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void setupCharacter() {
        // Race Selection
        printer.PrintRaceOptions();
        int raceChoice = input.nextInt();
        switch (raceChoice) {
            case 1 -> player = new Dunedain();
            case 2 -> player = new Beserker();
            case 3 -> player = new Guardian();
            default -> player = new Human();
        }

        // Warrior Type Selection
        printer.PrintWarriorTypeOptions(raceChoice);
        int typeChoice = input.nextInt();
        selectWarriorType(raceChoice, typeChoice);

        // Armor Selection
        printer.PrintArmorOptions(typeChoice);
        int armorChoice = input.nextInt();
        selectArmor(typeChoice, armorChoice);
        
        // Weapon Selection
        printer.PrintWeaponOptions(typeChoice);
        int weaponChoice = input.nextInt();
        selectWeapon(typeChoice, weaponChoice);
    }
    
    private static void selectWarriorType(int raceChoice, int typeChoice) {
        switch (raceChoice) {
            case 1 -> { // Dunedain
                player = switch (typeChoice) {
                    case 1 -> new Knight();
                    case 2 -> new Commander();
                    case 3 -> new Ranger();
                    case 4 -> new Marshal();
                    default -> new Knight();
                };
            }
            case 2 -> { // Dwarf
                player = switch (typeChoice) {
                    case 1 -> new Beserker();
                    case 2 -> new Housecarl();
                    case 3 -> new Ruffian();
                    case 4 -> new Soothsayer();
                    default -> new Beserker();
                };
            }
            case 3 -> { // Elf
                player = switch (typeChoice) {
                    case 1 -> new Guardian();
                    case 2 -> new Vanguard();
                    case 3 -> new Stalker();
                    case 4 -> new LoreMaster();
                    default -> new Guardian();
                };
            }
            default -> { // Human
                player = switch (typeChoice) {
                    case 1 -> new Champion();
                    case 2 -> new Legate();
                    case 3 -> new Rogue();
                    case 4 -> new Mage();
                    default -> new Champion();
                };
            }
        }
    }
    
    private static void selectArmor(int warriorType, int armorChoice) {
        if (warriorType == 1) { // Heavy armor
            playerArmor = switch (armorChoice) {
                case 1 -> new Plate();
                case 2 -> new Splint();
                case 3 -> new ChainMail();
                default -> new Plate();
            };
        } else if (warriorType == 2) { // Medium armor
            playerArmor = switch (armorChoice) {
                case 1 -> new BreastPlate();
                case 2 -> new Scale();
                case 3 -> new Hide();
                default -> new BreastPlate();
            };
        } else { // Light armor
            playerArmor = switch (armorChoice) {
                case 1 -> new Leather();
                case 2 -> new Quilted();
                case 3 -> new Robe();
                default -> new Leather();
            };
        }
    }
    
    private static void selectWeapon(int weaponStyle, int weaponChoice) {
        if (weaponStyle == 1) { // Two-handed weapons
            playerWeapon = switch (weaponChoice) {
                case 1 -> new WeaponWarHammer();
                case 2 -> new WeaponBattleAxe();
                case 3 -> new WeaponLongSword();
                default -> new WeaponBattleAxe();
            };
        } else if (weaponStyle == 2) { // One-handed weapons
            playerWeapon = switch (weaponChoice) {
                case 1 -> new WeaponMaceAndBuckler();
                case 2 -> new WeaponHandAxeAndBuckler();
                case 3 -> new WeaponSwordAndBuckler();
                default -> new WeaponSwordAndBuckler();
            };
        } else if (weaponStyle == 3) { // Dual wield weapons
            playerWeapon = switch (weaponChoice) {
                case 1 -> new WeaponHatchet();
                case 2 -> new WeaponDaggers();
                default -> new WeaponDaggers();
            };
        } else { // Stave weapons
            playerWeapon = switch (weaponChoice) {
                case 1 -> new WeaponBladedStave();
                case 2 -> new WeaponTrident();
                case 3 -> new WeaponScepter();
                default -> new WeaponScepter();
            };
        }
    }

    private static void spawnEnemy(int level) {
        switch (level) {
            case 1 -> currentEnemy = new ShamanOrc();
            case 2 -> currentEnemy = new ScavengerOrc();
            case 3 -> currentEnemy = new ChieftonOrc();
            case 4 -> currentEnemy = new OrcBoss();
        }
    }

    private static void combatTurn() {
        System.out.println("\n--- Player Turn ---");
        System.out.println("HP: " + player.GetHealth() + " | Stamina: " + player.GetStamina());
        System.out.println("1) Heavy Attack  2) Regular Attack  3) Special/Block");
        int choice = input.nextInt();

        // 1. Calculate Damage and Deduct Stamina
        // Using your Detriment logic from Warrior.java
        player.Detriment(choice);

        int damageToEnemy = 25 + randNum.nextInt(15); // Base logic
        currentEnemy.TakeDamage(damageToEnemy);
        System.out.println("You hit the enemy for " + damageToEnemy + " damage!");

        // 2. Enemy Turn
        if (currentEnemy.GetHealth() > 0) {
            int enemyDamage = currentEnemy.GetEnemyDamage();
            // Armor Reduction Logic - armor reduces damage by a percentage
            int armorReduction = playerArmor.GetArmorPoints() / 10; // Armor points reduce damage by 1/10th
            int finalDamage = Math.max(5, enemyDamage - armorReduction); // Minimum 5 damage gets through
            player.TakeDamage(finalDamage);
            System.out.println("The " + currentEnemy.GetType() + " hits you for " + finalDamage + "!");
        }
    }

    private static void healPlayer() throws Exception {
        StatsBar bar = new StatsBar();
        bar.updateBar();
        // Reset logic
        player.SetHealth(200); 
        player.SetStamina(250);
    }

    private static void displayEnding() {
        // Logic to pick correct home based on race
        System.out.println(printer.storyNarration.endStory[0]);
    }
}