
package warrior.elf;
//magical

public class LoreMaster extends Elf{

    private String warriorType = "LoreMaster";

    public LoreMaster() {
        super.lowMagic = lowMagic + 5;
    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
}//class