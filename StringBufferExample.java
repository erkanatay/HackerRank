package HackerRank;

public class StringBufferExample {
    public static void main(String[] args) {
        builStringWithPlus("Java", 100_000);
        buildStringWithStringBuilder("Java", 100000);
        buffer("Java", 100_000);
    }

    public static void builStringWithPlus(String string, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            string = string + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Length : " + string.length());
        System.out.println(end - start);
    }

    private static void buildStringWithStringBuilder(String string, int count) {
        StringBuilder sb = new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }
        System.out.println(sb.length());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void buffer(String string, int count) {
        StringBuffer sbs = new StringBuffer(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            sbs.append(i);
        }
        System.out.println(sbs.length());
        long end = System.currentTimeMillis();
        System.out.println(end-start);



    }


}
