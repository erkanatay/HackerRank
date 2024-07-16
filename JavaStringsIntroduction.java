package HackerRank;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(a.length()+b.length());

      //  System.out.println(a.toString().toUpperCase());

        char[] x = new char[a.length()];


        for (int i = 0; i < a.length(); i++) {
            System.out.print(x[i]);
        }

        //System.out.println(Character.toUpperCase(x));
    }
}
