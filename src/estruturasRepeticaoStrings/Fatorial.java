package estruturasRepeticaoStrings;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número inteiro positivo: ");
        int numero = teclado.nextInt();

        long fatorial = 1;
        while (numero > 0){
            fatorial *= numero--;
        }
        System.out.println("O fatorial desse número é " + fatorial);
    }
}
