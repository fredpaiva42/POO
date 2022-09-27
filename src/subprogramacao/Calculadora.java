package subprogramacao;
import java.util.Scanner;
public class Calculadora {

    public static void menu(double[] memoria){
        double mem = memoria[0];
        System.out.println();
        System.out.printf("Estado da memória: %.2f%n", mem);
        System.out.println("Opções:");
        System.out.println();
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa");
        System.out.println();
        System.out.println("Qual opção você deseja?");
    }

    public static void soma(double[] memoria, double numero){
        memoria[0] += numero;
    }

    public static void subtrai(double[] memoria, double numero){
        memoria[0] -= numero;
    }

    public static void multiplica(double[] memoria, double numero){
        memoria[0] *= numero;
    }

    public static void divide(double[] memoria, double numero){
        memoria[0] /= numero;
    }
    private static void limparMemoria(double[] memoria) {
        memoria[0] *= 0;
        System.out.println("Memória limpa!");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] memoria = {0};
        double numero;

        menu(memoria);
        int escolha = input.nextInt();
        while (escolha != 6){
            switch (escolha) {
                case 1 -> {
                    System.out.print("Valor a ser somado:");
                    numero = input.nextDouble();
                    soma(memoria, numero);
                }
                case 2 -> {
                    System.out.print("Valor a ser subtraído:");
                    numero = input.nextDouble();
                    subtrai(memoria, numero);
                }
                case 3 -> {
                    System.out.print("Valor a ser multiplicado:");
                    numero = input.nextDouble();
                    multiplica(memoria, numero);
                }
                case 4 -> {
                    System.out.print("Valor a ser dividido:");
                    numero = input.nextDouble();
                    divide(memoria, numero);
                }
                case 5 -> limparMemoria(memoria);
                default -> System.out.println("Operação inválida!");
            }

            menu(memoria);
            escolha = input.nextInt();
        }
    }
}


