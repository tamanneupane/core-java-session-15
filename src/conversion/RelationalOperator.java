package conversion;

public class RelationalOperator {

    public static void main(String[] args) {

        int a = -1;
        int b = -127;

        System.out.println(a == b);
        System.out.println(!(a != b));

        System.out.println(a != b);
        System.out.println(!(a == b));

        System.out.println(a < b);
        System.out.println(a > b);

        System.out.println(501 <= 500);


        float percentage = 45;

        boolean isDistinction = percentage >= 80 && percentage <= 100;
        boolean isFirstDivision =  percentage >= 70 && percentage < 80;
        boolean isSecondDivision = percentage >= 60 && percentage < 70;
        boolean isThirdDivision = percentage >= 40 && percentage < 60;
        boolean isFail = percentage < 40;

        System.out.println("Distinction : "+ isDistinction );
        System.out.println("First : "+ isFirstDivision );
        System.out.println("Second : "+ isSecondDivision );
        System.out.println("Third : "+ isThirdDivision );
        System.out.println("Failed : "+ isFail );


    }
}
