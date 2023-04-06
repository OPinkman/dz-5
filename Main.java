public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 2;
        int d = 1;

        int sumab = a + b;
        int sumcd = c + d;

        System.out.println(sumab > sumcd);

        System.out.println(sumab++ > (sumcd - 2));

        System.out.println(sumab % 2 == 0 || sumcd % 2 == 0 ? "true" : "false");

    }
}