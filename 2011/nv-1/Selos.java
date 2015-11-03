import java.util.Scanner;

class Selos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n; // atenção para o "long", n < 10.000.000.000

        n = in.nextLong();

        long i = 2;
        boolean isPrime = true;
        while (i <= Math.sqrt(n)) {
            isPrime &= (n % i != 0); // n não é divisível por i
            i++;
        }

        System.out.println(isPrime ? "N" : "S");
    }
}