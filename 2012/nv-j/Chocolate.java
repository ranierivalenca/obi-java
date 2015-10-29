import java.util.Scanner;

class Chocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l;

        l = in.nextInt();

        int partes = 1;

        while (l > 1) {
            partes = partes * 4;
            l = l / 2;
        }

        System.out.println(partes);
    }
}