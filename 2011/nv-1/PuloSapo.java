import java.util.Scanner;

class PuloSapo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, m;
        boolean temSapo[];

        n = in.nextInt();
        m = in.nextInt();

        temSapo = new boolean[n];

        for (int i = 0; i < m; i++) {
            int p = in.nextInt();
            int d = in.nextInt();

            for (int j = p; j <= n; j += d) {
                temSapo[j - 1] = true;
            }
            for (int j = p; j > 0; j -= d) {
                temSapo[j - 1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(temSapo[i] ? "1" : "0");
        }
    }
}