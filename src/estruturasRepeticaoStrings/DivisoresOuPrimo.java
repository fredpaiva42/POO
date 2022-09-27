package estruturasRepeticaoStrings;

import java.util.Scanner;

public class DivisoresOuPrimo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int numero = teclado.nextInt();

        boolean continuar = true;
        while (continuar){
            int contador = 0;
            for(int i = 1; i < numero; i++){
                if (numero % i == 0){
                    System.out.println(i + " ");
                    contador++;
                }
            }
            if (contador == 1)
                System.out.println(numero + " é primo");

            System.out.println("Deseja informar outro número? (sim - 1) ou (não - 0)");
            int resposta = teclado.nextInt();

            if(resposta == 1){
                System.out.print("Informe um número inteiro positivo: ");
                numero = teclado.nextInt();
            }else
                continuar = false;
        }
    }
}
