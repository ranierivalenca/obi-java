import java.util.Scanner;

class Guerra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int sections[];

        n = in.nextInt();

        sections = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sections[i] = in.nextInt();
            sum += sections[i];
        }

        int i = 0;
        int halfSum = 0;
        while (halfSum < sum / 2) {
            halfSum += sections[i++];
        }
        System.out.println(i);
    }
}