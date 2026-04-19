
package warrior.dwarf;

public class Housecarl extends Dwarf{

    private String warriorType = "Housecarl";

    public Housecarl() {
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
} // class