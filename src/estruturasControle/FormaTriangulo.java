package estruturasControle;

import java.util.Scanner;

/*
* Faça um programa que leia três coordenadas num espaço 2D
* e indique se formam um triângulo, justamente com o seu tipo
* (equilátero, isósceles e escaleno)
* */

public class FormaTriangulo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe as coordenadas do P1: ");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        System.out.println("Informe as coordenadas do P2: ");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        System.out.println("Informe as coordenadas do P3: ");
        double x3 = teclado.nextDouble();
        double y3 = teclado.nextDouble();

        double area = x1 * y2 + x2 * y3 + x3 * y1 - x3 * y2 - x1 * y2 - x2 * y1;
        double tolerancia = 10e-5;

        if (Math.abs(area) < tolerancia) {
            System.out.println("Não forma Triângulo!");

        }else {
            System.out.println("Forma Triângulo!");

            double P1P2 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            double P2P3 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
            double P3P1 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);

            boolean equilatero = (P1P2 == P2P3) && (P1P2 == P3P1);
            boolean escaleno = (P1P2 == P2P3) ^ (P1P2 == P3P1);

            if(equilatero)
                System.out.println("É um triângulo equilátero");
            else if (escaleno)
                System.out.println("É um triângulo escaleno");
            else
                System.out.println("É um triângulo isósceles");
        }
    }
}
