import java.util.Scanner;

class Obi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, p;

        n = in.nextInt();
        p = in.nextInt();

        int classified = 0;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x + y >= p) {
                classified++;
            }
        }

        System.out.println(classified);
    }
}