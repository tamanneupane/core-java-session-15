package array;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        int a = 2;
        a = 3;

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 80;
        numbers[1] = 60;
        numbers[2] = 80;
        numbers[3] = 90;
        numbers[4] = 90;

        float totalMarks = 0;

//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(i);
//            totalMarks = totalMarks + numbers[i];
//        }

//        for(int item : numbers){
//            totalMarks += item;
//        }

        totalMarks = Arrays.stream(numbers).sum();

        System.out.println(totalMarks);

        String[] names = {"A", "B", "C"};
//        String[] tempNames = new String[names.length + 1];

//        int i = 0;
//        for(String name : names){
//            tempNames[i] = name;
//            i++;
//        }
//
//        names = tempNames;

        names = Arrays.copyOf(names, names.length + 5);

        System.out.println(Arrays.toString(names));



    }
}
