import java.util.Scanner;

class Tenis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        int x0 = 0;
        int y0 = 0;
        int x1 = 432;
        int y1 = 468;

        x = in.nextInt();
        y = in.nextInt();

        if (x >= x0 && x <= x1 && y >= y0 && y <= y1) {
            System.out.println("dentro");
        } else {
            System.out.println("fora");
        }
    }
}