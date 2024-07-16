package HackerRank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        int count = 0;

        if (a.length()!=b.length()) return false;
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    arr[i] = 'a';
                    brr[j] = 'a';
                }
            }
        }
        System.out.println(arr);
        System.out.println(brr);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == brr[i]) count++;
        }

        if (count == arr.length) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();



        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean ret = isAnagram(a, b);


        System.out.println(ret ? "Anagrams " : "Not Anagrams");


    }


}
