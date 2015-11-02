import java.util.Scanner;

class Carnaval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float notas[] = new float[5];
        float maior, menor;

        for (int i = 0; i < 5; i++) {
            notas[i] = in.nextFloat();
        }
        menor = notas[0];
        maior = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        float soma = 0;
        for (int i = 0; i < 5; i++) {
            soma = soma + notas[i];
        }
        System.out.println(soma - maior - menor);
    }
}