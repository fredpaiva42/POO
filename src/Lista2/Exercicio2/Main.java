package Lista2.Exercicio2;

public class Main {
    public static void main(String[] args){
        Quadrado f1 = new Quadrado("Quadrado", 10);
        Circulo f2 = new Circulo("Circulo", 10);
        Triangulo f3 = new Triangulo("Triangulo",10, 5);
        Retangulo f4 = new Retangulo("Retângulo", 10, 2);

        imprimirArea(f1);
        imprimirArea(f2);
        imprimirArea(f3);
        imprimirArea(f4);

    }
    private static void imprimirArea(FiguraGeometrica figura){
        System.out.println("Área do " + figura.tipo + ": " + figura.calculaArea());
    }
}
