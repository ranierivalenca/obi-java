import java.util.Scanner;

class PAs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int a[];

        n = in.nextInt();
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int parts = 1;
        int r = 0;
        int lastElement = 0;

        for (int i = 1; i < n; i++) {
            if (i > lastElement + 1) {
                if (a[i] - a[i - 1] != r) {
                    parts++;
                    lastElement = i;
                }
            }
            r = a[i] - a[i - 1];
        }

        System.out.println(parts);
    }
}