package HackerRank;

import java.util.TimeZone;

public class Clndr {
    public static void main(String[] args) throws InterruptedException {
     /*   Calendar calendar = new GregorianCalendar();
        GregorianCalendar gc = new GregorianCalendar(2023,3,17);
        System.out.println(gc);
        System.out.println(calendar.getTime());


        Date date = new Date();
        System.out.println(date);
        //Thread.sleep(2*1000);
        Date date1 = new Date();
        System.out.println(date1);

        System.out.println(calendar.getTime().getHours());
        System.out.println(calendar.HOUR);
        System.out.println(calendar.HOUR_OF_DAY);

        calendar.set(2023,3,8);
        System.out.println(calendar.HOUR_OF_DAY);
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("hour : " + calendar.get(Calendar.HOUR));
        System.out.println("era : " + calendar.get(Calendar.ERA));
        System.out.println("ERA: " + calendar.get(Calendar.ERA));


*/
//        TimeZone tm = TimeZone.getTimeZone("Europe/Istanbul");
//        TimeZone tm2 = TimeZone.getTimeZone("Japan");
//
//        //now.setTimeZone(tm2);
//
//        System.out.println(tm.getDisplayName());
//        System.out.println(tm2.getDisplayName());
//
//        System.out.println(now.getTime());
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date tarih = now.getTime();
//
//        System.out.println(simpleDateFormat.format(tarih));

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getID());

        String[] timeZones = TimeZone.getAvailableIDs();
        for (String s:
             timeZones) {
            System.out.println(s.toString());

        }
        System.out.println(timeZones.length);





    }
}
