
package warrior.human;
//heavy

public class Champion extends Human{
    
    private String warriorType = "Champion";


    public Champion() {
        super();
        super.lowHealth = lowHealth + 30;
        super.highHealth = highHealth + 30;
    }

    public String GetWarriorType() {
        return this.warriorType;
    }  
}//class