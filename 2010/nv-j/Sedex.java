import java.util.Scanner;

class Sedex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, a, l, p;

        n = in.nextInt();
        a = in.nextInt();
        l = in.nextInt();
        p = in.nextInt();

        if (n <= a && n <= l && n <= p) {
            System.out.println('S');
        } else {
            System.out.println('N');
        }
    }
}