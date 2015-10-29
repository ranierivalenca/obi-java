import java.util.Scanner;

class Vestibular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        String gabarito;
        String opcoes;

        n = in.nextInt();
        gabarito = in.next();
        opcoes = in.next();

        int acertos = 0;
        for (int i = 0; i < n; i++) {
            if (gabarito.charAt(i) == opcoes.charAt(i)) {
                acertos++;
            }
        }

        System.out.println(acertos);
    }
}