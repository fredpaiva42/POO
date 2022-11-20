package IntroducaoOO.Exercicio3;
import java.util.Scanner;
public class Calculadora {
    Scanner in = new Scanner(System.in);
    private double memoria = 0;
    public int escolha;
    public double numero;

    public void exibirMenu(){
        System.out.println();
        System.out.printf("Estado da memória: %.2f%n", memoria);
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
        escolha = in.nextInt();
        escolherOperacao(escolha);
    }

    public void somar(double numero){
        memoria += numero;
    }

    public void subtrair(double numero){
        memoria -= numero;
    }

    public void multiplicar(double numero){
        memoria *= numero;
    }

    public void dividir(double numero){
        memoria /= numero;
    }

    public void limparMemoria(){
        memoria = 0;
        System.out.println("Memória Limpa!");
    }

    public void escolherOperacao(int escolha){
        switch (escolha){
            case 1 -> {
                System.out.print("Valor a ser somado:");
                numero = in.nextDouble();
                somar(numero);
                exibirMenu();
                break;
            }
            case 2 -> {
                System.out.print("Valor a ser subtraído:");
                numero = in.nextDouble();
                subtrair(numero);
                exibirMenu();
                break;
            }
            case 3 -> {
                System.out.print("Valor a ser multiplicado:");
                numero = in.nextDouble();
                multiplicar(numero);
                exibirMenu();
                break;
            }
            case 4 -> {
                System.out.print("Valor a ser dividido:");
                numero = in.nextDouble();
                dividir(numero);
                exibirMenu();
                break;
            }
            case 5 -> {
                limparMemoria();
                exibirMenu();
                break;
            }
            case 6 -> {
                break;
            }
            default -> {
                System.out.println("Operação inválida!");
                break;
            }
        }
    }

}
