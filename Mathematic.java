package HackerRank;

import java.util.Random;

public class Mathematic {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        System.out.println(Math.pow(2,3));
        System.out.println(Math.abs(4));
        System.out.println(Math.abs(-97));
        System.out.println(Math.random());
        System.out.println(Math.cbrt(8));
        System.out.println(Math.round(6.7));
        System.out.println(Math.round(6.4));
        System.out.println(Math.round(6.5));


        System.out.println("*******************");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5));
            System.out.println(random.nextGaussian());
        }




    }
}
