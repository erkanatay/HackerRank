package HackerRank;

import java.util.Scanner;

public class asalAdet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Kaca kadar asallar bulunacak : ");
        int sayi = in.nextInt();
        int adet = 0;

        for (int i = 2; i <= sayi; i++) {
            int count = 0;


            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }

            }

            if (count == 0) {
                System.out.print( i + " ");
                adet++;
            }
        }
        System.out.println("\nToplam "+ adet + " adet asal var...");
    }
}
