
package warrior.dunedain;
//tank

public class Knight extends Dunedain{

    private String warriorType = "Knight";


    public Knight() {
        super();
        super.lowHealth = lowHealth + 30;
        super.highHealth = highHealth + 30;
    }

    public String GetWarriorType() {
        return this.warriorType;
    }  
} // class