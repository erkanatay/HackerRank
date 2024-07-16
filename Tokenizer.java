package HackerRank;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String s = "i love java very much :) ";
        StringTokenizer st = new StringTokenizer(s, "a", true);
        System.out.println(s);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
