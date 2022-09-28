package Lista1;
import java.util.Scanner;
public class SubProgramacao2 {

    public static void imprimir(String mensagem){
        System.out.print(mensagem);
    }

    public static int lerDados(String mensagem){
        Scanner input = new Scanner(System.in);
        imprimir(mensagem);
        return input.nextInt();
    }

    public static int obterHoras(int tempo){
        return tempo / 3600;
    }

    public static int obterMinutos(int tempo){
        tempo %= 3600;
        return tempo / 60;
    }

    public static int obterSegundos(int tempo){
        tempo %= 60;
        return  tempo;
    }

    public static void main(String[] args){
        int tempo = lerDados("Informe o tempo em segundos: ");
        int horas = obterHoras(tempo);
        int minutos = obterMinutos(tempo);
        int segundos = obterSegundos(tempo);

        String resultado = horas+":"+minutos+":"+segundos;
        imprimir(resultado);
    }
}
