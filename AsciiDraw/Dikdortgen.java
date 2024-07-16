package HackerRank.AsciiDraw;

public class Dikdortgen {

    public void ciz(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {

                if (j == 0) System.out.print("*");
                else if (j == 19) System.out.print("*");
                else if (i == 0) System.out.print("*");
                else if (i == 9) System.out.print("*");
                else System.out.print(" ");


            }
            System.out.println();
        }
    }


}
