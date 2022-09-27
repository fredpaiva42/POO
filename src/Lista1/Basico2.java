package Lista1;
/*
Calcule a distância entre dois pontos num espaço de 3 dimensões
 */
import java.util.Scanner;
public class Basico2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe as coordenadas do P1: ");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double z1 = teclado.nextDouble();
        System.out.print("Informe as coordenadas do P2: ");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        double z2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));

        System.out.printf("A distância entre os pontos P1 e P2 no espaço de 3 dimensões é: %.1f", distancia);
    }
}
