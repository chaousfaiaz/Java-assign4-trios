
package warrior.elf;
//balanced

public class Vanguard extends Elf{
    private String warriorType = "Vanguard";

    public Vanguard() {
        super();
        super.lowHealth = lowHealth + 10;
        super.highHealth = highHealth + 10;
        super.lowAgility = lowAgility + 10;
        super.highAgility = highAgility + 10;
        super.lowStamina = lowStamina + 10;
        super.highStamina = highStamina + 10;
    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
}//class