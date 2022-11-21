package Lista2.Exercicio2;

public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Retangulo(String tipo ,double base, double altura){
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }
}
