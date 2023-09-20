package predefinedclass;

import java.util.Random;
import java.util.stream.IntStream;

public class MathPractice {

    public static void main(String[] args) {

        int absValue = Math.abs(-234);
        System.out.println(absValue);

        int sum = Math.multiplyExact(9999 , 9999);
        System.out.println(sum);

        double ceiledValue = Math.ceil(2.0000001);
        System.out.println(ceiledValue);
        double floorValue = Math.floor(2.9);
        System.out.println(floorValue);
        long roundedValue = Math.round(2.5);
        System.out.println(roundedValue);

        double squareRootValue = Math.sqrt(-4);
        System.out.println(squareRootValue);

        double signCheckValue = Math.signum(0);
        System.out.println(signCheckValue);

//        long randomNumber = Math.round(Math.random() * 10);
//        System.out.println(randomNumber);

        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        System.out.println(randomNumber);
    }
}
