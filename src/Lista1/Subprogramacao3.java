package Lista1;
import java.util.Scanner;
public class Subprogramacao3 {
    public static int obterCentena(int numero){
        return numero/100;
    }

    public static int obterDezena(int numero){
        numero %= 100;
        return numero/10;
    }

    public static int obterUnidade(int numero){
        return numero %= 10;
    }

    public static void tranformarEmRomano(int centena, int dezena, int unidade, int numero){
        String [][] numeracaoRomana = {{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX",  "XC"},
                {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}};
        String resultado = numeracaoRomana[2][centena - 1] + numeracaoRomana[1][dezena - 1] + numeracaoRomana[0][unidade - 1];
        System.out.println(numero +" = " + resultado);
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        int centena = obterCentena(numero);
        int dezena = obterDezena(numero);
        int unidade = obterUnidade(numero);

        tranformarEmRomano(centena, dezena, unidade, numero);
    }
}

