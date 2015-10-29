import java.util.Scanner;

class Nota {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        n = in.nextInt();

        String out = "A";
        if (n == 0) {
            out = "E";
        }
        if (n > 0 && n <= 35) {
            out = "D";
        } else if (n > 35 && n <= 60) {
            out = "C";
        } else if (n > 60 && n <= 85) {
            out = "B";
        }

        System.out.println(out);
    }
}