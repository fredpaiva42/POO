package estruturasControle;

import java.util.Scanner;

class Paridade {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int numero = teclado.nextInt();

        if(numero % 2 == 0)
            System.out.println("O número é par!");
        else
            System.out.println("O número é impar!");
    }
}
