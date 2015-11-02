import java.util.Scanner;

class Album {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        int l1, h1, l2, h2;

        x = in.nextInt();
        y = in.nextInt();
        l1 = in.nextInt();
        h1 = in.nextInt();
        l2 = in.nextInt();
        h2 = in.nextInt();

        boolean eh_possivel = false;

        // eh_possivel |= ...
        // é a mesma coisa que
        // eh_possivel = eh_possivel || ...
        eh_possivel |= l1 + l2 <= x && h1 <= y && h2 <= y;
        eh_possivel |= l1 + l2 <= y && h1 <= x && h2 <= x;
        eh_possivel |= l1 + h2 <= x && l2 <= y && h1 <= y;
        eh_possivel |= l1 + h2 <= y && l2 <= x && h1 <= x;
        eh_possivel |= h1 + l2 <= x && l1 <= y && h2 <= y;
        eh_possivel |= h1 + l2 <= y && l1 <= x && h2 <= x;
        eh_possivel |= h1 + h2 <= x && l1 <= y && l2 <= y;
        eh_possivel |= h1 + h2 <= y && l1 <= x && l2 <= x;

        if (eh_possivel) {
            System.out.println('S');
        } else {
            System.out.println('N');
        }
    }
}