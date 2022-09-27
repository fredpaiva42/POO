package Lista1;
import java.util.Scanner;
public class EstruturaRepeticao7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o número no qual você quer saber a raiz quadrada: ");
        int numero = input.nextInt();
        System.out.print("Informe o erro máximo: ");
        double erroMaximo = input.nextDouble();
        double raiz, anterior, absoluto;

        raiz = numero/2.0;
        do {
            anterior = raiz;
            raiz = (raiz * raiz + numero)/(2 * raiz);

            if (raiz > anterior)
                absoluto = raiz - anterior;
            else
                absoluto = anterior - raiz;
        }while(absoluto > erroMaximo);

        System.out.println(raiz);
        System.out.println(Math.sqrt(numero));
    }
}
