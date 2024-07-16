package HackerRank;


import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String ss = scan.nextLine();


        String[] arrk = ss.split("[ !,?._'@]+");
      //  String[] arrk = ss.split("[ !,?._'@]+");



        System.out.println(arrk.length);

        for (String a : arrk){
            System.out.println(a);
        }

//
//        String s = scan.nextLine().trim();
//
//            String tokens[] = s.split("[ !,?._'@]+");
//            System.out.println(tokens.length);
//            for (String token : tokens) {
//                System.out.println(token);
//        }
        }

    }

