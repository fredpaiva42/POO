package subprogramacao;
import java.util.Scanner;
public class IMC {
    // Declarando o método
    public static double leia(String mensagem) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensagem);
        return input.nextDouble();
    }
    public static void main(String[] args){
        // chamando o método
        double altura = leia("Entre com a sua altura em metros: ");
        double massa = leia("Entre com a sua massa em KG: ");

        double imc = massa / Math.pow(altura, 2);
        System.out.println("Seu IMC é " + imc);
    }
}
