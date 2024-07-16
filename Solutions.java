package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class Solutions {


    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        try{
            long[] arr = new long[T];
            for (int i = 0; i < T; i++) {
                arr[i] = in.nextLong();
            }
            for (int i = 0; i < T; i++) {


                if (arr[i] > Short.MIN_VALUE && arr[i] < Short.MAX_VALUE) {
                    System.out.println(arr[i] + " can be fitted in:\n* short\n* int\n* long ");

                } else if (arr[i] > Integer.MIN_VALUE && arr[i] < Integer.MAX_VALUE) {
                    System.out.println(arr[i] + " can be fitted in:\n* int\n* long ");

                } else if (arr[i] > Long.MIN_VALUE && arr[i] < Long.MAX_VALUE) {
                    System.out.println(arr[i] + " can be fitted in:\n* long ");
                }
            }



        } catch (Exception e) {
            System.out.println( "can't be fitted anywhere.");
        }






/*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
*/




//            long[] arr = new long[T];
//            for (int i = 0; i < T; i++) {
//                try {
//                arr[i] = in.nextLong();
//            } catch (Exception e) {
//
//                        System.out.println(arr[i] + "can't be fitted anywhere.");
//                    }
//                }
//
//                for (int i = 0; i < T; i++) {
//                long number = arr[i];
//
//                if (number > Short.MIN_VALUE && number < Short.MAX_VALUE) {
//                    System.out.println(number + " can be fitted in:\n* short\n* int\n* long ");
//
//                } else if (number > Integer.MIN_VALUE && number < Integer.MAX_VALUE) {
//                    System.out.println(number + " can be fitted in:\n* int\n* long ");
//
//                } else if (number > Long.MIN_VALUE && number < Long.MAX_VALUE) {
//                    System.out.println(number + " can be fitted in:\n* long ");
//                }
//                }
//            }


    }
}






















