
public class StatsBar {


    public StatsBar() {}

    public void updateBar() throws Exception {
       
        
        System.out.write("\r".getBytes());
        System.out.write("[".getBytes());
        int update = 1 ;
        while(update <= 20) {
        String temp = createSymbol(update);
        System.out.write(temp.getBytes());
        System.out.print("\b\b\b\b\b\b\b\b");
        update = update + 1;
        Thread.sleep(300);
    }


        System.out.print("=] Healed - All attributes reset to full!");

    } // updateBar()

    public static String createSymbol(int update)
    {
        int startsNum = update / 4;
        StringBuilder builder = new StringBuilder();
        while(startsNum >= 0)
        {
        builder.append("=");
        startsNum--;
        }
        builder.append("*Healing");
        return builder.toString();
    }

} // class

