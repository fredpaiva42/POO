package Lista1;
import java.util.Scanner;
public class Basico4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome, preço e quantidade do produto: ");
        String nome = input.nextLine();
        float preco = input.nextFloat();
        int quantidade = input.nextInt();
        float valorTotal = preco * quantidade;

        if (quantidade >= 11 && quantidade <= 20)
            valorTotal += (valorTotal * 0.1f);
        else if(quantidade >= 21 && quantidade <= 50)
            valorTotal += (valorTotal * 0.2f);
        else if(quantidade > 50)
            valorTotal += (valorTotal * 0.25f);

        System.out.printf("O valor total da sua compra é: R$ %.2f", valorTotal);
    }
}
