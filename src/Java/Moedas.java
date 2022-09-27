package Java;

import java.util.Scanner;

/**
 * Faça um programa para, a partir de um valor
 * informado em centavos, indicar a menor quantidade
 * de moedas que representa esse valor
 **/

class Moedas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int valor, valorInicial, moedas5, moedas10, moedas25, moedas50,moedas1;

        System.out.println("Informe o valor em centavos: ");
        valorInicial = teclado.nextInt();

        valor = valorInicial;

        moedas1= valor / 100;
        valor %= 100;
        moedas50 = valor / 50;
        valor %= 50;
        moedas25 = valor / 25;
        valor %= 25;
        moedas10 = valor / 10;
        valor %= 10;
        moedas5 = valor / 5;
        valor %= 5;

        System.out.println("Para o valor "+valorInicial+" centavos, a menor quantidade de moedas é "+moedas1+" moedas de 1 real, "+moedas50+" moedas de 50 centavos, "+moedas25+" moedas de 25 centavos, "+moedas10+" moedas de 10 centavos e "+moedas5+" moedas de 5 centavos.");
    }
}
