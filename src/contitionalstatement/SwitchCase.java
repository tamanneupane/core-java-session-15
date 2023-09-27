package contitionalstatement;

import java.time.LocalDate;
import java.util.Calendar;

public class SwitchCase {

    public static void main(String[] args) {

        String today = LocalDate.now().getDayOfWeek().name();
        System.out.println(today);

        String special = "";

        switch (today) {
            case "SUNDAY":
                special = "MOMO";
                break;
            case "MONDAY":
                special = "Burger";
                break;
            case "TUESDAY":
                special = "Roti";
                break;
            case "WEDNESDAY":
            case "FRIDAY":
                special = "Chicken Curry";
                break;
//            case "FRIDAY":
//                special = "Chicken Curry";
//                break;
            case "THURSDAY":
                special = "Paneer Chilli";
                break;

            default:
                special = "Sekuwa";
                break;
        }

        // This is for java version 17
//         switch (today) {
//            case "SUNDAY" -> special = "MOMO";
//            case "MONDAY" -> special = "Burger";
//            case "TUESDAY" -> special = "Roti";
//            case "WEDNESDAY", "FRIDAY" -> special = "Chicken Curry";
//            case "THURSDAY" -> special = "Paneer Chilli";
//            default -> special = "Sekuwa";
//        };

        System.out.println(special);
    }
}
