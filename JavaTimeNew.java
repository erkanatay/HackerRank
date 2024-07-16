package HackerRank;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class JavaTimeNew {

    public static void main(String[] args) {

        TimeZone tz = TimeZone.getTimeZone("Europe/Sofia");
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime1 = LocalTime.now(tz.toZoneId());
        LocalTime localTime2 = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        LocalTime localTime3 = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("Istanbul : " + localTime2.getHour());
        System.out.println("Germany " + localTime3.getHour());
        System.out.println("*********************");
        System.out.println(localTime);
        System.out.println("\ndate : ");
        System.out.println(localDate.getEra());
        System.out.print(localDate.getDayOfMonth()+" ");
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.plusDays(3).getDayOfWeek());

        System.out.println(localTime1);

    }
}
