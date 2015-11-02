import java.util.Scanner;

class Consecutivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int last, tmp;
        int counter, max;

        n = in.nextInt();
        last = in.nextInt();
        counter = 1;
        max = 1;

        for (int i = 1; i < n; i++) {
            tmp = in.nextInt();
            if (tmp == last) {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 1;
                last = tmp;
            }
        }
        if (counter > max) {
            max = counter;
        }

        System.out.println(max);
    }
}