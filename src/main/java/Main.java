
public class Main {
    public static void main(String[] args) {

        int[] zahlen = new int[10];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;
        zahlen[5] = 6;
        zahlen[6] = 7;
        zahlen[7] = 8;
        zahlen[8] = 9;
        zahlen[9] = 10;


        for (int i = 0; i <= zahlen.length - 1; i++) {
            System.out.println(zahlen[i]);
        }
        int summe = 0;
        for(int i = 0; i < zahlen.length; i++) {
            summe = summe + zahlen[i];
        }
        System.out.println(summe);

    }

    public static int add(int a, int b) {
        return a + b;

    }
    public static int multiplikation(int a, int b) {
        return a * b;

    }

}
