package Lista1;
import java.util.Scanner;
public class EstruturaRepeticao3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int codigo = 0;

        do {
            System.out.println("Código: " + codigo);
            System.out.print("Informe o código: ");
            codigo = input.nextInt();
        }while (codigo != -1);

    }
}
