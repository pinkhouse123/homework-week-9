package homeworkweek9;

import java.util.HashMap;

public class HashMap9 {
    public static void main(String[] args) {
        //create a hashmap object
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        //Add keys and objects
        people.put("Umi", 22);
        people.put("Pink", 10);
        people.put("Blue", 15);
        people.put("Prime", 25);
        people.put("Orange", 40);
        people.put("Black", 20);

        //for each loop
        for (String i : people.keySet()) {
            //print statement
            System.out.println("String keys : " + i + ", Integer Value : " + people.get(i));
        }
    }
}
