import java.util.Scanner;

public class Pedagio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l, d, k, p;

        l = in.nextInt();
        d = in.nextInt();
        k = in.nextInt();
        p = in.nextInt();

        int custo_carro = l * k;
        int pedagios = l / d;
        int custo_pedagios = pedagios * p;
        int custo_total = custo_carro + custo_pedagios;

        System.out.println(custo_total);
    }
}