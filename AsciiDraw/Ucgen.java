package HackerRank.AsciiDraw;

public class Ucgen {


    public void ciz(){

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0) {
                    for (int k = 1; k < 10 - i; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }



    }

