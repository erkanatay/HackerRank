package HackerRank.AsciiDraw;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.print("1. Ucgen ciz\n2. Dikdortgen ciz\n3. Cember ciz\n4. Cikis \nSekil No : ");
        String islem = in.nextLine();

        switch (islem){
            case "1" :
                Ucgen ucgen = new Ucgen();
                ucgen.ciz();
                break;
            case "2" :
                Dikdortgen dikdortgen = new Dikdortgen();
                dikdortgen.ciz();
                break;
            case "3" :
                Cember cember = new Cember();
                cember.ciz();

                case "4" : return;
        }







    }
}
