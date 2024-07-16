package HackerRank;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class WeekOfDay {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Tarihi girin (DD MM YYYY) : ");

        int dd = in.nextInt();
        int mm = in.nextInt()-1;
        int yyyy = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(yyyy,mm,dd);

        System.out.print("Bu tarihteki gun : ");

        String day = calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,
                Locale.US).toUpperCase();
        System.out.println(day);


    }

}
