/*
 * Apesar desta solução estar correta (apresenta o resultado certo),
 * provavelmente ela estouraria o tempo de execução para os testes.
 *
 * A questão diz que n <= 10^5, ou seja, o laço que tem um laço interno pode
 * demorar tempo demais.
 *
 * Para uma solução mais eficiente, veja o código de Frequencia-2.java
 */

import java.util.Scanner;

class solucao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int students[];

        n = in.nextInt();
        students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = in.nextInt();
        }

        int unique[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean canAdd = true;
            for (int j = 0; j < k; j++) {
                canAdd &= students[i] != unique[j];
            }
            if (canAdd) {
                unique[k++] = students[i];
            }
        }

        System.out.println(k);
    }
}