
package warrior.human;
// magical

public class Mage extends Human{
    
    private String warriorType = "Mage";


    public Mage() {
        super.lowMagic = lowMagic + 5;
    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
} // class