package contitionalstatement;

public class IfCondition {
    static int a;
    public static void main(String[] args) {
//        int i = 6;
//
//        if(i % 2 == 0){
//            a = 5;
//            System.out.println(String.format("%d is even", i));
//        }

        int target = 5;
        int sales = 15;
        float bonus = 0;
//        //Case I
//        if(sales >= target){
//            bonus = 100;
//        }

//        // Case II
//
//        if(sales >= target){
//            bonus = 100;
//        }else{
//            bonus = 0;
//        }


        // Case III

        if(sales >= 2 * target){
            bonus = 1000;
        }
        else if(sales >= 1.5 * target){
            bonus = 500;
        }
        else if(sales >= target){
            bonus = 100;
        }
        else if(sales < target){
            //Fired
        }


        System.out.println(bonus);



    }
}
