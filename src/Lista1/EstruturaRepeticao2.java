package Lista1;

import java.util.Scanner;

/*
Determine o número de dígitos de um número informado
 */
public class EstruturaRepeticao2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, contador = 0, resultado;
        System.out.print("Entre com um número inteiro: ");
        numero = input.nextInt();
        resultado = numero;
        while (numero != 0){
            numero /= 10;
            contador++;
        }
        System.out.println("O número " + resultado + " tem " + contador + " dígitos!");
    }
}
