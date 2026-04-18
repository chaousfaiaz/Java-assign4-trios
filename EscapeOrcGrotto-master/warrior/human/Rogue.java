
package warrior.human;

// non magical light
public class Rogue extends Human{

    private String warriorType = "Rogue";


    public Rogue() {
        super();
        super.lowAgility = lowAgility + 30;
        super.highAgility = highAgility + 30;

    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
}// class