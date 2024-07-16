package HackerRank;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */


        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) - A.charAt((A.length() - i - 1)) != 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}