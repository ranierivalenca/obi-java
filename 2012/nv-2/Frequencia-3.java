/*
 * Esta é a melhor solução para se usar na prática; mas eu não sei se é
 * possível utilizar a classe java.util.Hashtable na competição... logo, é
 * melhor se garantir na solução do código Frequencia-2.java, que tem a
 * implementação de Hashtable específica para o problema.
 */

import java.util.Scanner;
import java.util.Hashtable;

class Frequencia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        Hashtable<Integer, Boolean> students = new Hashtable<Integer, Boolean>();

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            students.put(in.nextInt(), true);
        }

        System.out.println(students.keySet().size());
    }
}