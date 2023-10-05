package collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        System.out.println(names);
        names.add("Taman");
        names.add("Ram");
        names.add("Shyam");
        System.out.println(names);
        names.add(1, "Sita");
        System.out.println(names);
        names.set(3,"Hari");
        System.out.println(names);

//        names.clear();
//        System.out.println(names);
        String oneName = names.get(2);
        System.out.println(oneName);

        boolean containCheck = names.contains("Shyam");
        System.out.println("Contain Name : " + containCheck);
    }
}
