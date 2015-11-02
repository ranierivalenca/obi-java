import java.util.Scanner;

class Guerra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int sections[];

        n = in.nextInt();

        sections = new int[n];

        for (int i = 0; i < n; i++) {
            sections[i] = in.nextInt();
        }

        int i = 0;
        int j = n - 1;

        int sumI = 0;
        int sumJ = 0;
        while (i <= j) {
            if (sumI > sumJ) {
                sumJ += sections[j--];
            } else if (sumI < sumJ) {
                sumI += sections[i++];
            } else {
                sumI += sections[i++];
                sumJ += sections[j--];
            }
        }
        System.out.println(i == j + 1 ? i : i - 1);
    }
}