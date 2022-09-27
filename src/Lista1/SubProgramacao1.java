package Lista1;
import java.util.Scanner;
public class SubProgramacao1 {

    public static double calculaMedia(double p1, double p2, double trabalho){
        return ((p1 * 3) + (p2 * 3) + (trabalho * 4))/10.0;
    }

    public static void status(double media){
        System.out.println("Seu status na disciplina: ");
        if (media >= 6.0)
            System.out.println("Aprovado!");
        else if (media >= 4 && media < 6)
            System.out.println("Verificação Suplementar!");
        else
            System.out.println("Reprovado!");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua nota da P1: ");
        double p1 = input.nextDouble();
        System.out.print("Infotme sua nota da P2: ");
        double p2 = input.nextDouble();
        System.out.print("Informe sua nota no trabalho: ");
        double trabalho = input.nextDouble();

        double media = calculaMedia(p1, p2, trabalho);
        System.out.println("Sua média na disciplina foi: " + media);
        status(media);
    }
}
