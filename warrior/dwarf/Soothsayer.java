
package warrior.dwarf;
// magical

public class Soothsayer extends Dwarf{
    
    private String warriorType = "Soothsayer";

    public Soothsayer() {
        super.lowMagic = lowMagic + 5;
    }

    public String GetWarriorType() {
        return this.warriorType;
    }    
} // class