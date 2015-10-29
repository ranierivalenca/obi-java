import java.util.Scanner;

public class Papel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c, p, f;

        c = in.nextInt();
        p = in.nextInt();
        f = in.nextInt();

        int folhas = c * f;

        if (folhas <= p) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}