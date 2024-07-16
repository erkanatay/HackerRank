package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigDecimal {
    public static void main(String[] args) {

        BigInteger sum = BigInteger.valueOf(0);

        Scanner in = new Scanner(System.in);
      /*  System.out.print("Please enter the limit : ");
        int limit = in.nextInt();
        for (int i = 0; i < limit; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }
        System.out.println(sum);
        System.out.println("max value of integer : "+ Integer.MAX_VALUE);
        System.out.println("max value of long : "+ Long.MAX_VALUE);
        System.out.println("max value of double : "+ Double.MAX_VALUE);

*/

        System.out.print("Factorial : ");
        int nm = in.nextInt();
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 2; i <= nm; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInteger);

    }
}
