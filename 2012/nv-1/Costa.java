import java.util.Scanner;

class Costa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m, n;
        String lines[];

        m = in.nextInt();
        n = in.nextInt();

        lines = new String[m];

        for (int i = 0; i < m; i++) {
            lines[i] = in.next();
        }

        int borders = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean isLand = lines[i].charAt(j) == '#';
                boolean isBorder = isLand && (
                    (
                        (i == 0) ? true : lines[i - 1].charAt(j) == '.' // água acima
                    ) ||
                    (
                        (j == 0) ? true : lines[i].charAt(j - 1) == '.' // água à esqueda
                    ) ||
                    (
                        (j == n - 1) ? true : lines[i].charAt(j + 1) == '.' // água à direita
                    ) ||
                    (
                        (i == m - 1) ? true : lines[i + 1].charAt(j) == '.'
                    )
                );
                if (isBorder) {
                    borders++;
                }
            }
        }

        System.out.println(borders);
    }
}