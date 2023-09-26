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
                special = "Chicken Curry";
                break;
            case "THURSDAY":
                special = "Paneer Chilli";
                break;
            case "FRIDAY":
                special = "Parautha";
                break;
            default:
                special = "Sekuwa";
                break;
        }

        System.out.println(special);
    }
}
