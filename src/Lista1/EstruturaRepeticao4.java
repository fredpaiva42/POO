package Lista1;
import java.util.Scanner;
public class EstruturaRepeticao4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, fib = 0, primeiro = 0, segundo = 1;
        numero = input.nextInt();

        System.out.printf("Fib(%d): %d %d", numero, primeiro, segundo);
        for (int i = 1; i < numero; i++){
            fib = primeiro + segundo;
            primeiro = segundo;
            segundo = fib;
            System.out.print(" " + fib);
        }
    }
}
