package Java;

import java.util.Scanner;

/* Este programa calcula a área de um triângulo retângulo */

class Triangulo {
    public static void  main(String[] args){
        Scanner teclado = new Scanner(System.in); // Leitor do teclado
        int altura, base; // Dados de entrada
        float area; // Dados de saida

        System.out.println("Informe a altura: ");
        altura = teclado.nextInt();
        System.out.println("Informe a base: ");
        base = teclado.nextInt();
        area = 0.5f * altura * base;
        System.out.println("Área: " + area);
    }
}
