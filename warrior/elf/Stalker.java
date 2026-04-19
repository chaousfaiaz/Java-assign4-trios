
package warrior.elf;
// non magical light option

public class Stalker extends Elf{

    private String warriorType = "Stalker";


    public Stalker(){
        super();
        super.lowAgility = lowAgility + 30;
        super.highAgility = highAgility + 30;

    }

    public String GetWarriorType() {
        return this.warriorType;
    } 
}//class