
package warrior.dunedain;
// magic

public class Marshal extends Dunedain{
        
    private String warriorType = "Marshal";

    public Marshal() {
        super.lowMagic = lowMagic + 5;
    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
} // class