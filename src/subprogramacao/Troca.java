package subprogramacao;
import java.util.Scanner;
public class Troca {
    public static void troca(int x, int y){
        int aux = x;
        x = y;
        y = aux;
    }

    public static float media (int x, int y){
        return (x+y)/2;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 7;
        troca(a, b);
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("media: " + media(a, b));
    }
}
