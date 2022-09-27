package Lista1;
import java.util.Scanner;

/*
Determine as raízes de uma equação de 2º grau
 */

public class Basico1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float a, b, c;
        float r1, r2, delta;

        System.out.print("Informe os valores de a, b e c: ");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        delta = b * b - 4 * a * c;

        if (delta < 0 && a != 0)
            System.out.println("Essa equação não possui raiz!");
        else {
            if (delta == 0){
                r1 = (float) (-b + Math.sqrt(delta))/(2 * a);
                System.out.println("A equação possui raízes reais iguais: R = " + r1);
            }else {
                r1 = (float) (-b + Math.sqrt(delta))/(2 * a);
                r2 = (float) (-b - Math.sqrt(delta))/(2 * a);

                System.out.println("A equação possui raízes reais e distintas: R1 = " + r1 + " R2 = " + r2);
            }
        }
    }
}
