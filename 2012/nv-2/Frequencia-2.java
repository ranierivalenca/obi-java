import java.util.Scanner;

class Frequencia {

    static class Hashtable {
        int size;
        int keys[];
        boolean values[];

        public int uniqueStudents; // aqui vamos guardar a quantidade de alunos

        public Hashtable(int size) {
            this.size = size;
            this.keys = new int[size];
            this.values = new boolean[size];

            this.uniqueStudents = 0;

            for (int i = 0; i < size; i++) {
                this.keys[i] = -1; // os números dos alunos variam de 0 a 10⁶
                this.values[i] = false;
            }
        }

        public void put(int key) {
            int hash = key % this.size;
            while (this.values[hash] != false && this.keys[hash] != key) {
                hash = (hash + 1) % this.size;
            }
            if (this.keys[hash] != key) {
                this.keys[hash] = key;
                this.values[hash] = true;
                this.uniqueStudents++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        Hashtable hashtable;

        n = in.nextInt();

        hashtable = new Hashtable(n);

        for (int i = 0; i < n; i++) {
            hashtable.put(in.nextInt());
        }

        System.out.println(hashtable.uniqueStudents);
    }
}