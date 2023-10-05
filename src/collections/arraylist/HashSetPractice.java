package collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        System.out.println(names);
        names.add("Taman");
        names.add("Ram");
        names.add("Shyam");
        names.add("Sita");
        names.add("Sita");
        System.out.println(names);
    }
}
