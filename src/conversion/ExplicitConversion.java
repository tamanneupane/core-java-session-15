package conversion;

public class ExplicitConversion {

    public static void main(String[] args) {
        short s = 128;
        byte b = (byte) s;

        System.out.println(b);

        char c = 'z';
        int i = c;

        System.out.println(i);

//        for (int index = 97; index <= 122; index++){
//            char ch = (char) index;
//            System.out.print(ch);
//        }

        for (int index = 'a'; index <= 'z'; index++){
            char ch = (char) index;
            System.out.print(ch);
        }


    }
}
