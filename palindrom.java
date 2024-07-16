package HackerRank;


import java.util.Scanner;

public class palindrom {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(str);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println("\n***************");

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                count++;
            }

        }
        if (count == str.length()) {
            System.out.println("palindrom");
        } else {
            System.out.println("degil");
        }
        System.out.println(str.compareTo("a"));


    }
}
