package Lista1;
public class varComposta3 {
    public static void preencherVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 50);
        }
    }

    public static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }

    public static void ordenarVetor(int[] vetor){
        int temp;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]){
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        final int TAM = 50;
        int[] v1 = new int[TAM];
        int[] v2 = new int[TAM];

        preencherVetor(v1);
        preencherVetor(v2);

        System.out.println("Vetor 1 não ordenado: ");
        imprimirVetor(v1);
        System.out.println();
        System.out.println("Vetor 2 não ordenado: ");
        imprimirVetor(v2);
        System.out.println();

        System.out.println("Vetor 1 ordenado: ");
        ordenarVetor(v1);
        imprimirVetor(v1);
        System.out.println();
        System.out.println("Vetor 2 ordenado: ");
        ordenarVetor(v2);
        imprimirVetor(v2);

        int[] novoVetor = new int[v1.length + v2.length];
        int i1 = 0, i2 = 0; // elemento atual de vetor1 e vetor2
        for (int i = 0; i < novoVetor.length; i++) {
            if (v1[i1] < v2[i2]) { // elemento do v1 é menor
                novoVetor[i] = v1[i1];
                i1++; // vai para o próximo elemento de v1
                if (i1 == v1.length) {
                    // se terminou v1, preenche com os valores restantes de v2
                    System.arraycopy(v2, i2, novoVetor, i + 1, v2.length - i2);
                    break; // sai do for
                }
            } else {
                novoVetor[i] = v2[i2];
                i2++; // vai para o próximo elemento de v2
                if (i2 == v2.length) {
                    // se terminou v2, preenche com os valores restantes de v1
                    System.arraycopy(v1, i1, novoVetor, i + 1, v1.length - i1);
                    break; // sai do for
                }
            }
        }

        System.out.println();
        System.out.println("Vetor novo: ");
        imprimirVetor(novoVetor);
    }
}
