package estruturasRepeticaoStrings;

import java.util.Scanner;

public class FatorialFor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número inteiro positivo: ");
        int numero = teclado.nextInt();
        long fatorial = 1;
        for (int i = numero; i > 1; i--){
            fatorial *= i;
        }
        System.out.println("O fatorial desse número é " + fatorial);
    }
}
