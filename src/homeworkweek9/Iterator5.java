package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator5 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();//Create an object
        list.add("Umi");//Add elements to Arraylist
        list.add(22);
        list.add("Prime");
        list.add(true);
        list.add(null);
        list.add(false);
        list.add("Java");

        Iterator iterator = list.iterator();//Iterator object
        while (iterator.hasNext()){//Iterator to iterate through the elements.
            System.out.println(iterator.next());//Print statement
        }

    }
}
