import java.util.Scanner;

class Chuva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int map1[][];
        int map2[][];

        n = in.nextInt();

        map1 = new int[n][n];
        map2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map1[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((map1[i][j] + map2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}