
// not working 100% but i still like it just takes up longer space than needed 
public class Climbing {

    public Climbing() {}

    public void Climb() throws Exception {

        int update = 1 ;
        while(update <= 11) {
            String temp = createClimb(update);
            System.out.write(temp.getBytes());
            update = update + 1;
            Thread.sleep(800);

            if(update >= 1 && update <= 11){
                clearIt();
                
            }
            
        }
    } // climb() output of animation

    public static void clearIt() {
        for(int i = 0; i <6; i++) {
            final String ESC = "\033[";
            System.out.print(ESC + "2J");
            clearBack();
            
        } // i want to clear 6 lines so iterating for 0-5
    // System.out.print(clearClimb[0]);
    // System.out.printf("%-20s", clearClimb[0]);
    // trying to clear all 20 chars of each line and start back at the beginning of each line for the next print

    } //clear the last output

    public static void clearBack() {
        System.out.print("\033[1A"); 
        System.out.print(clearClimb[0]); // trying to clear all 20 chars, need carriage return for format
    } // clear the freed space, i think this not working properly

    public static String createClimb(int update)
    {   
        int startsNum = update;
        StringBuilder builder = new StringBuilder();
        while(startsNum >= 0)
        {
            if(startsNum == 1){
                for(int i = 0; i < step1.length; i++){
                builder.append(step1[i]);   
                }
                System.out.print("\r");
            } else if(startsNum == 2) {
                for(int i = 0; i < step2.length; i++){
                    builder.append(step2[i]);    
                    }
            }else if(startsNum == 3) { 
                for(int i = 0; i < step3.length; i++){
                    builder.append(step3[i]);    
                    }  
            }else if(startsNum == 4) {
                
                for(int i = 0; i < step4.length; i++){
                    builder.append(step4[i]);    
                    }
            }else if(startsNum == 5) {
                
                for(int i = 0; i < step5.length; i++){
                    builder.append(step5[i]);    
                    }
            }else if(startsNum == 6) {
                for(int i = 0; i < step6.length; i++){
                    builder.append(step6[i]);    
                    }
            }else if(startsNum == 7){
                
                for(int i = 0; i < step7.length; i++){
                    builder.append(step7[i]);    
                    }
            }
            else if(startsNum == 8){
                clearIt();
                for(int i = 0; i < step8.length; i++){
                    builder.append(step8[i]);    
                    }
            }else if(startsNum == 9){
                
                for(int i = 0; i < step9.length; i++){
                    builder.append(step9[i]);    
                    }
            }else if(startsNum == 10){
                
                for(int i = 0; i < step10.length; i++){
                    builder.append(step10[i]);    
                    }
            }else if(startsNum == 11){
                
                for(int i = 0; i < step11.length; i++){
                    builder.append(step11[i]);    
                    }
            }
        break;
        }
        return builder.toString();
    }// create climb

    //arrays for animation

    public static String[] step1 = {
        "                     \n",
        "                     \n",
        "                     \n",
        "     o       |#|     \n",
        "    /|\\      |#|     \n",
        "    / \\______|#|_____"
    };

    public static String[] step2 = {
        "                     \n",
        "                     \n",
        "                     \n",
        "      o      |#|     \n",
        "     /|\\     |#|     \n",
        "    _/ \\_____|#|_____"
    };

    public static String[] step3 = {
        "                     \n",
        "                     \n",
        "                     \n",
        "        o    |#|     \n",
        "       /|\\   |#|     \n",
        "    ___/ \\___|#|_____"
    };

    public static String[] step4 = {
        "                     \n",
        "                     \n",
        "                     \n",
        "          o  |#|     \n",
        "         /|\\ |#|     \n",
        "    _____/ \\_|#|_____"
    };

    public static String[] step5 = {
        "                     \n",
        "                     \n",
        "                     \n",
        "           o/|#|     \n",
        "           |-|#|     \n",
        "    _______|\\|#|_____"
    };

    public static String[] step6 = {
        "                     \n",
        "                     \n",
        "           o         \n",
        "          ||\\|#|     \n",
        "           |\\|#|     \n",
        "    _________|#|_____"
    };

    public static String[] step7 = {
        "                     \n",
        "           o         \n",
        "          ||\\        \n",
        "           |\\|#|     \n",
        "             |#|     \n",
        "    _________|#|_____"
    };

    public static String[] step8 = {
        "                    \n",
        "               o    \n",
        "             /|__   \n",
        "             |#|\\   \n",
        "             |#|     \n",
        "    _________|#|_____"
    };

    public static String[] step9 = {
        "                     \n",
        "                  o  \n",
        "                 /|\\ \n",
        "             |#| / \\ \n",
        "             |#|     \n",
        "    _________|#|_____"
    };

    public static String[] step10 = {
        "                     \n",
        "                  o  \n",
        "             |#| /|\\ \n",
        "             |#| / \\ \n",
        "    _________|#|_____"

    };


    public static String[] step11 = {  
        "                     \n",
        "                     \n",
        "                     \n",
        "             |#| \\o/ \n",
        "             |#|  |  \n",
        "    _________|#|_/ \\_"
    };

    public static String[] clearClimb ={ 
        "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\r",
        "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b"
    };


} // class

