import java.util.Scanner;

class Overflow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int p, q;
        char c;

        n = in.nextInt();
        p = in.nextInt();
        c = in.next().charAt(0);
        q = in.nextInt();

        int result = 0;
        if (c == '+') {
            result = p + q;
        } else if (c == '*') {
            result = p * q;
        }
        if (result > n) {
            System.out.println("OVERFLOW");
        } else{
            System.out.println("OK");
        }
    }
}