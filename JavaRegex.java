package HackerRank;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

public class JavaRegex {
    public static void main(String[] args) {

        String IP = "234.34..34";

        StringTokenizer st = new StringTokenizer(IP, ".");

        ArrayList arrayList = new ArrayList();

        while (st.hasMoreTokens()) {
            arrayList.add(st.nextToken());
        }

        for (Object s : arrayList) {
            System.out.println(s);
        }
        System.out.println("*******************");

        int count = 0;


        try {
            for (int i = 0; i < arrayList.size(); i++) {
                int m = Integer.parseInt((String) arrayList.get(i));
                if ((m > 0) && (m < 255)) {
                    count++;
                }
            }


                if (count == 4) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                System.out.println("count : " + count);





        } catch (NumberFormatException e) {
            System.out.println("False");


        }
    }
}












