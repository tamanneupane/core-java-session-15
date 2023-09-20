package predefinedclass;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DatePractice {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date milisecondDate = new Date(1694827240478L);
        System.out.println(milisecondDate);

        boolean isAfter = currentDate.after(milisecondDate);
        System.out.println("IsAfter : " + isAfter );

        // 1993-01-07
        // In any date related class month value starts from 0
        int year = 1993;
        Date specificDate = new Date(year - 1900, Calendar.JANUARY, 7);
        System.out.println(specificDate);

        System.out.println(specificDate.getMonth());

        LocalDateTime currentLocal =  LocalDateTime.now();
        System.out.println(currentLocal);

        LocalDateTime specific = LocalDateTime.of(1993,Month.DECEMBER, 7, 10, 0);
        System.out.println(specific);

        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime currentSpecificZoneTime =  LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(currentSpecificZoneTime);

        String sDateTime = "September 14 2023";
        LocalDate parsedDate = LocalDate.parse(sDateTime, DateTimeFormatter.ofPattern("MMMM dd yyyy"));

        parsedDate.lengthOfMonth();

        System.out.println(parsedDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE dd MMM hh:mm");
        String formattedDate = formatter.format(currentLocal);

        System.out.println(formattedDate);

        // someFunction("2023-09-16T08:04")

        long value = TimeUnit.MILLISECONDS.toSeconds(5000);

        Calendar currentCalendar = Calendar.getInstance();
        System.out.println(currentCalendar);

        Calendar specificCalendar = Calendar.getInstance();
        specificCalendar.set(Calendar.YEAR, 1990);
        specificCalendar.set(Calendar.MONTH, Calendar.APRIL);
        specificCalendar.set(Calendar.DAY_OF_MONTH, 26);
        specificCalendar.set(Calendar.HOUR, 10);
        specificCalendar.set(Calendar.MINUTE, 20);
        specificCalendar.set(Calendar.SECOND, 40);

        System.out.println(specificCalendar.getTime());




    }
}
