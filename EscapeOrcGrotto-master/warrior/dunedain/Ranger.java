
package warrior.dunedain;
// light melee

public class Ranger extends Dunedain{

    public String warriorType = "Ranger";

    public Ranger() {
        super();
        super.lowAgility = lowAgility + 30;
        super.highAgility = highAgility + 30;

    }

    public String GetWarriorType() {
        return this.warriorType;
    }
} // class