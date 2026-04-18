
package warrior.elf;
//heavy

public class Guardian extends Elf{
    
    private String warriorType = "Guardian";

    public Guardian() {
        super();
        super.lowHealth = lowHealth + 30;
        super.highHealth = highHealth + 30;
    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
}//class