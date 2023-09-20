package predefinedclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDifference {

    static void findTimeDifference(String formattedDate, String statusUpdateTime) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy EEE dd MM hh:mm:ss");

        Date d1 = sdf.parse(formattedDate);
        Date d2 = sdf.parse(statusUpdateTime);

        /*
        120
        0 Seconds 120 % 60
        2 minutes 120 / 60


         */

        System.out.println(d1);
        System.out.println(d2);

        long diffInTime = d1.getTime() - d2.getTime();

        long diffInSecond = TimeUnit.MILLISECONDS.toSeconds(diffInTime)%60;
        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(diffInTime)%60;
        long diffInHour = TimeUnit.MILLISECONDS.toHours(diffInTime)% 24;
        long diffInDays = TimeUnit.MILLISECONDS.toDays(diffInTime)% 365;
        long diffInYears = TimeUnit.MILLISECONDS.toDays(diffInTime) / 365L;

        System.out.println("Last status was updated ::" + diffInSecond + " seconds, " + diffInMinutes + " minutes, " + diffInHour + " hours, " +diffInDays+ " days, " +diffInYears+ " years ago");
    }

    public static void main(String[] args) throws ParseException {
        String statusUpdateTime = "2024 Mon 18 09 06:00:00";
        LocalDateTime localtimeNow = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy EEE dd MM hh:mm:ss");
        String formattedDate = formatter.format(localtimeNow);

        findTimeDifference(formattedDate,statusUpdateTime );


    }
}
