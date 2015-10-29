import java.util.Scanner;

class Conta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        n = in.nextInt();

        int conta = 7;
        if (n > 10) {
            conta += Math.min(n, 30) - 10;
        }
        if (n > 30) {
            conta += (Math.min(n, 100) - 30) * 2;
        }
        if (n > 100) {
            conta += (n - 100) * 5;
        }

        System.out.println(conta);
    }
}