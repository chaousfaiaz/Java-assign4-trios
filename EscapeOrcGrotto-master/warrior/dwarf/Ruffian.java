
package warrior.dwarf;
// non magical light

public class Ruffian extends Dwarf{

    private String warriorType = "Ruffian";


    public Ruffian() {
        super();
        super.lowAgility = lowAgility + 30;
        super.highAgility = highAgility + 30;

    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
} // class