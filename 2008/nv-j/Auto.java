import java.util.Scanner;

class Auto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        String caracteres;

        n = in.nextInt();
        caracteres = in.next();

        int paineis = 0;

        for (int i = 0; i < n; i++) {
            char c = caracteres.charAt(i);
            switch (c) {
                case 'P':
                case 'C':
                    paineis += 2;
                    break;
                case 'A':
                    paineis += 1;
                    break;
            }

            // ----------------
            // O switch acimna é equivalente aos ifs abaixo
            // ----------------

            /*if (c == 'P' || c == 'C') {
                paineis += 2;
            }
            if (c == 'A') {
                paineis += 1;
            }*/
        }

        System.out.println(paineis);
    }
}