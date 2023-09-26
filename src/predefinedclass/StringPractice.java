package predefinedclass;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractice {

    // String is immutable class.
    public static void main(String[] args) {
        String name = new String("Taman");
        String name1 = "Taman";
        name1 = "ABC";

        String tutor = "Taman";
//        "Taman".toUpperCase();

        char a = 'd';
        String b = "d";

        a = 0;
        b = null;
        System.gc();

        CustomImmutableClass immutableClass = new CustomImmutableClass("ABC", 20);
        CustomImmutableClass immutableClass1 = immutableClass.setAge(30);

        System.out.println(immutableClass.getAge());
        System.out.println(immutableClass1.getAge());


        // Taman
        String test = "Taman";
        char first = test.charAt(4);
        System.out.println(first);

        System.out.println("length of test = " + test.length());

        for (int index=0; index < test.length(); index++){
            System.out.println(index);
            char eachChar = test.charAt(index);
            System.out.println(" = "+ eachChar);
        }

        // a = 97 , A = 65

        char t = 'A';
        System.out.println("ascii : " + (int)t);

        String smaller = "Ac";
        String greater = "ab";

        int compareValue = smaller.compareToIgnoreCase(greater);
        System.out.println(compareValue);


        String sentence = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ";
        System.out.println(sentence.contains("ummy"));

        String student = "ABC";
        int date = 21;
        String greeting = "Hi "+ student + " Today is " + date + " of september";
        System.out.println(greeting);

        String greeting1 = String.format("Hi %s Today is %d of september",student, date);
        System.out.println(greeting1);

        student.indexOf('B');

        String empty = "";
        String empty1 = "     ";

        System.out.println(empty.isEmpty());
        System.out.println(empty1.trim().isEmpty());

        String number = "21 ";
        Integer.parseInt(number.trim());

        String one = "one";
        String two = new String("one");

        boolean isEqual = one == two;

        System.out.println("isEqual : " + isEqual);

        String language = "Java";
        String language1 = "java";
        String language2 = "Java Programming";
        language2 = language2.substring(0,4);

        System.out.println("Language : "+ language);
        System.out.println("Language2 : "+ language2);

        System.out.println("Language isEqual : " + (language == language2));

        System.out.println("Language isEqual : " + (language.equals(language2)));
        System.out.println("Language case sensitive isEqual : " + (language.equals(language1)));
        System.out.println("Language case sensitive isEqual : " + (language.equalsIgnoreCase(language2)));
        int N = 50000;
        if((N % 2) == 0){
            // Even
            System.out.println("a".repeat(N-1).concat("b"));
        }else{
            // Odd
            System.out.println("a".repeat(N));
        }

        String response = "06001 050000002 20000005";
        String[] spittedResponse = response.split(" ");

        System.out.println(Arrays.toString(spittedResponse));

        String firstPolicy = spittedResponse[0];
        String secondPolicy = spittedResponse[1];
        String thirdPolicy = spittedResponse[2];

        System.out.println("First Policy : " + firstPolicy);
        System.out.println("Second Policy : " + secondPolicy);
        System.out.println("Third Policy : " + thirdPolicy);


        String input = "5 12";

        // output 5 10

        String searchText = " ul500004".trim().toUpperCase();

        System.out.println(searchText);

        float f = 20.7f;
        String sFloat =  String.valueOf(f);
        System.out.println(sFloat);

        //   N > 0
        // N < 500000

        StringBuilder sb = new StringBuilder();
        sb.append("5");
        sb.append("10");
        sb.append("15");
        sb.append("20");
        sb.append("25");
        sb.append("30");

        String finalOutput = sb.toString();

        System.out.println(finalOutput);

        String input1 ="5 12";
        String[] splitInput = input1.split(" ");

        List<Integer> intList = Arrays.stream(splitInput).map(Integer::parseInt).collect(Collectors.toList());

    }
}
