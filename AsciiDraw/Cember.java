package HackerRank.AsciiDraw;

public class Cember {
    public void ciz(){

        for (int y = 0; y > -20; y--) {
            for (int x = 0; x < 20; x++) {

                //System.out.print("("+x + y+")");

                if ( (7-x)*(7-x) + (-7-y)*(-7-y) <= 25 ){
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println();

        }
    }
}
