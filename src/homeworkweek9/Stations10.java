package homeworkweek9;

import java.util.HashMap;
import java.util.Scanner;

public class Stations10 {

    //Main Method
    public static void main(String[] args) {
        //create a hashmap object
        HashMap<String, String> tube = new HashMap<>();

        tube.put("Bank","Zone 1");
        tube.put("Bond Street", "Zone 1");
        tube.put("Baker Street","Zone 1");
        tube.put("Paddington", "Zone 1");
        tube.put("Westminster", "Zone 1");
        tube.put("Green Park", "Zone 1");
        tube.put("Old Street", "Zone 1");
        tube.put("Monument","Zone 1");
        tube.put("Embankment", "Zone 1");
        //create scanner class object
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the station name");
        String tfl = sca.nextLine().toLowerCase();
        //print statement
        System.out.println("Entered Station in Zone 1 " + tube.get(tfl));
    }
}
