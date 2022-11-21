package Lista2.Exercicio2;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(String tipo, double base, double altura){
        super(tipo);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calculaArea(){
        return base * altura / 2;
    }
}
