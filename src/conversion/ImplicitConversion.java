package conversion;

public class ImplicitConversion {

    public static void main(String[] args) {

        byte b = 127;
        short s = b;

        long l = 200;
        float f = l;

        double p = 20000;
        int time = 2;
        float rate = 9.44f;

        double interest = (p * time * rate)/100;

        int a = 2;

        double result =  a/500f;
        System.out.println(result);

    }
}
