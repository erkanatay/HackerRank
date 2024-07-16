package HackerRank;

import java.util.Currency;
import java.util.Locale;

public class Curr {

    public static void main(String[] args) {

        Currency curr = Currency.getInstance(Locale.US);

        double payment = 12324.134;

        System.out.println("US: " + curr.getSymbol() + payment);

        System.out.println("India: Rs."+payment);

        curr = Currency.getInstance(Locale.CHINA);
        System.out.println("Chine: " + curr.getSymbol() + payment);

        curr = Currency.getInstance(Locale.FRANCE);
        System.out.println("France: " + curr.getSymbol() + payment);




    }
}
