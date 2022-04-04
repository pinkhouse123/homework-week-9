package homeworkweek9;

import java.util.ArrayList;

public class RetrieveElement6 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();//Create an object
        list.add("Umi");
        list.add("Patel");
        list.add(22);
        list.add("February");
        list.add(true);


        // Retrieve element directly using index number
        System.out.println(list.get(0));
        System.out.println(list.get(4));
    }
}
