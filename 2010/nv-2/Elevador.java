import java.util.Scanner;

class Elevador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, c;
        int s, e;
        int people = 0;
        boolean exceed = false;

        n = in.nextInt();
        c = in.nextInt();

        for (int i = 0; i < n; i++) {
            s = in.nextInt();
            e = in.nextInt();
            people = people - s + e;
            if (people > c) {
                exceed = true;
            }
        }

        System.out.println(exceed ? "S" : "N");
        /* A linha acima é equivalente a
         *
         * if (exceed) {
         *     System.out.println("S");
         * } else {
         *     System.out.println("N");
         * }
         */
    }
}