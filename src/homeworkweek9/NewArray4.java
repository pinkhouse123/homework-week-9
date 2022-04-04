package homeworkweek9;

import java.util.ArrayList;

public class NewArray4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//create an object
        //add elements of arraylist
        list.add("Blue");
        list.add("Pink");
        list.add("Red");
        list.add("Orange");
        list.add("White");
        list.add("Purple");

        //for each loop
        for (Object value : list) {
            System.out.println(value);//print statement
        }
    }
}

