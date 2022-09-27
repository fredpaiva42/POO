package Lista1;
import java.util.Scanner;
public class Basico3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        System.out.println("Entre com as coordenadas x e y dos pontos nessa ordem:");
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1.0/2);
        System.out.println("A distancia é: " +  distancia);
    }
}
