package estruturasControle;

import java.util.Scanner;

class Absoluto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        double numero = teclado.nextDouble();
        if(numero < 0)
            numero = -numero;
        System.out.println("Valor absoluto: " + numero);
    }
}
