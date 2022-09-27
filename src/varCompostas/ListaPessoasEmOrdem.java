package varCompostas;

import java.util.Scanner;
public class ListaPessoasEmOrdem {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        final int TAM = 6;
        int[] idades = new int[TAM];
        String[] nomes = new String[TAM];

        for (int i = 0; i < TAM; i++){
            System.out.print("Digite seu nome: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Digite sua idade: ");
            idades[i] = teclado.nextInt();

            teclado.nextLine();
        }

        System.out.println("Organizado em Ordem Alfabética:");
        for(int i = 0; i < TAM; i++){
            for (int j = i+1; j < TAM; j++) {

                if(nomes[i].compareTo(nomes[j]) > 0){
                    String temp = nomes[i];
                    int tempo = idades[i];
                    nomes[i] = nomes[j];
                    idades[i] = idades[j];
                    nomes[j] = temp;
                    idades[j] = tempo;
                }
            }
            System.out.println(nomes[i]);
        }

        System.out.println("Organizado em Ordem Crescente de Idades:");

        for(int i = 0; i < TAM; i++){
            for (int j = i+1; j < TAM; j++) {

                if(idades[i] >= idades[j]){
                    int tempo = idades[i];
                    String temp = nomes[i];
                    idades[i] = idades[j];
                    nomes[i] = nomes[j];
                    idades[j] = tempo;
                    nomes[j] = temp;
                }

            }
            System.out.println(nomes[i]);
        }

        teclado.close();
    }
}
