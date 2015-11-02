import java.util.Scanner;

class Banco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, c;
        int t[], d[];

        c = in.nextInt();
        n = in.nextInt();

        t = new int[n];
        d = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
            d[i] = in.nextInt();
        }

        int clientAtt[] = new int[c];
        int attFreeTime[] = new int[c];
        for (int i = 0; i < c; i++) {
            clientAtt[i] = -1;
            attFreeTime[i] = 0;
        }

        int i = 0;
        int time = 0;

        int waitingMoreThan20 = 0;

        while (i < n) {
            for (int j = 0; j < c; j++) {
                if (attFreeTime[j] == time) {
                    clientAtt[j] = -1;
                }
                if (clientAtt[j] == -1) {
                    if (t[i] <= time) {
                        clientAtt[j] = i;
                        attFreeTime[j] = time + d[i];

                        if (time - t[i] > 20) {
                            waitingMoreThan20++;
                        }

                        i++;
                    }
                }
                if (i >= n) {
                    break;
                }
            }
            time++;
        }

        System.out.println(waitingMoreThan20);
    }
}