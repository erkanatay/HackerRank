package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    static String convert(Double payment, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(payment);
    }

    static String India(Double payment) {
        NumberFormat nff = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        return nff.format(payment);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NumberFormat f = NumberFormat.getInstance(Locale.US);

        double payment = in.nextDouble();


        System.out.println("US: " + convert(payment, Locale.US));
        System.out.println("India: Rs. " + India(payment));
        System.out.println("China: " + convert(payment, Locale.CHINA));
        System.out.println("France: " + convert(payment, Locale.FRANCE));


    }


}
