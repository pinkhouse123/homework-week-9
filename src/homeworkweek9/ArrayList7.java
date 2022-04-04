package homeworkweek9;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//create an object
        list.add("Central Line");
        list.add("Metropolitan Line");
        list.add("Piccadilly Line");
        list.add("District Line");
        list.add("Northern Line");
        list.add("Victoria Line");

        System.out.println("Original array list : " + list);
        System.out.println("Checking the above array list is empty or not" + list.isEmpty());
        list.remove(3);
        System.out.println("Array list after remove element : " + list);
        list.removeAll(list);
        System.out.println("Array list after remove all element : " + list);
        System.out.println("Checking the above array list is empty or not" + list.isEmpty());

    }
}
