import java.util.Scanner;

public class Cometa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;

        a = in.nextInt();

        int anos_desde_ultima_passagem = (a - 1986) % 76;
        int proxima_passagem = a + (76 - anos_desde_ultima_passagem);

        System.out.println(proxima_passagem);
    }
}