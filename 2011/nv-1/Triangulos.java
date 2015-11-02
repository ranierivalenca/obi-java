import java.util.Scanner;

class Triangulos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int tmp;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            tmp = a;
            a = c;
            c = tmp;
        }

        if (a >= b + c) {
            System.out.println("n");
        } else if (a == Math.sqrt(b * b + c * c)) {
            System.out.println("r");
        } else if (a > Math.sqrt(b * b + c * c)) {
            System.out.println("o");
        } else {
            System.out.println("a");
        }

        System.out.println();

    }
}