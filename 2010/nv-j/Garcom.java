import java.util.Scanner;

public class Garcom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int l, c;

        n = in.nextInt();

        int quebrados = 0;

        for (int i = 0; i < n; i++) {
            l = in.nextInt();
            c = in.nextInt();

            if (l > c) {
                quebrados += c;
            }
        }

        System.out.println(quebrados);
    }
}