import java.util.Scanner;

public class Bolo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int farinha = a / 2;
        int ovos = b / 3;
        int leite = c / 5;

        if (farinha <= ovos && farinha <= leite) {
            System.out.println(farinha);
        } else if (ovos <= farinha && ovos <= leite) {
            System.out.println(ovos);
        } else {
            System.out.println(leite);
        }
    }
}