package homeworkweek9;

import java.util.HashSet;

public class HashSet8 {
    public static void main(String[] args) {//main method
        HashSet<Integer> hashSet = new HashSet<>();//create an object
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(8);
        for (int i = 0; i < 10; i++){
            if(hashSet.contains(i));
            System.out.println(i + " was found in the set. ");
        }
    }
}