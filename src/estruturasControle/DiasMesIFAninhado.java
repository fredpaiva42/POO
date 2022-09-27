package estruturasControle;

import java.util.Scanner;

public class DiasMesIFAninhado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um mês (1 a 12): ");
        byte mes = teclado.nextByte();

        if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12))
            System.out.println("Esse mês tem 31 dias!");
        else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
            System.out.println("Esse mês tem 30 dias!");
        else {
            System.out.print("Entre com o ano (4 dígitos): ");
            short ano = teclado.nextShort();
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
                System.out.println("Esse mês tem 29 dias!");
            else
                System.out.println("Esse mês tem 28 dias!");
        }
    }
}
