package HackerRank;

import java.util.Scanner;

public class MonteCarlo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kac nokta icin hesaplansin ? : ");
        int nokta = 0;
        nokta = sc.nextInt();

        int count = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < nokta; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = x * x + y * y;
            if (distance < 1) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("My pi : " + 4.0 * count / nokta);
        System.out.println("time : " + time + "ms");

    }
}
