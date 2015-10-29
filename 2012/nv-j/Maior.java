import java.util.Scanner;

class Maior {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        n = in.nextInt();

        int maior = n;

        while (n != 0) {
            if (n > maior) {
                maior = n;
            }

            n = in.nextInt();
        }

        System.out.println(maior);
    }
}