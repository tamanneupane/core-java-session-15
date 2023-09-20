package predefinedclass;

import java.time.LocalDate;

public class StringPractice {

    // String is immutable class.
    public static void main(String[] args) {
        String name = new String("Taman");
        String name1 = "Taman";

        String tutor = "Taman";
//        "Taman".toUpperCase();

        char a = 'd';
        String b = "d";

        a = 0;
        b = null;
        System.gc();


    }
}
