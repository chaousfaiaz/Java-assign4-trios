
package warrior.dwarf;
// tank

public class Beserker extends Dwarf{

    private String warriorType = "Beserker";

    public Beserker() {
        super();
        super.lowHealth = lowHealth + 30;
        super.highHealth = highHealth + 30;
    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
} // class