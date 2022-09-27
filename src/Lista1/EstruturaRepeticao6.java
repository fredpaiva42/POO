package Lista1;
import java.util.Scanner;
public class EstruturaRepeticao6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean continua = true;
        System.out.print("Quanto você deseja investir: ");
        double quantia = input.nextFloat();
        System.out.print("Qual é a taxa de juros mensal: ");
        double taxa = input.nextFloat();
        input.nextLine();
        double rendimento = 0;

        while (continua){
            for (int i = 1; i <= 12; i++) {
                rendimento = (rendimento + quantia) * (1 + (taxa/100));
            }

            System.out.println("Saldo do investimento após 1 ano: " + rendimento);
            System.out.print("Deseja processar mais um ano? (S/N) ");
            String escolha = input.nextLine();

            if (escolha.equalsIgnoreCase("N"))
                continua = false;
        }
    }
}
