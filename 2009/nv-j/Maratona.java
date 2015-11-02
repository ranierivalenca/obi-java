import java.util.Scanner;

class Maratona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, mad;
        int checkpoint = 0;
        int tmp;
        boolean finish = true;

        n = in.nextInt();
        mad = in.nextInt();

        for (int i = 0; i <= n; i++) {
            tmp = (i == n ? 42195 : in.nextInt());
            if (tmp - checkpoint > mad) {
                finish = false;
            }
            checkpoint = tmp;
        }

        System.out.println(finish ? "S" : "N");
    }
}