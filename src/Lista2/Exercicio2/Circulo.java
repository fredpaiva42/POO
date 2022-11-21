package Lista2.Exercicio2;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(String tipo, double raio){
        super(tipo);
        this.raio = raio;
    }
    @Override
    public double calculaArea(){
        return Math.PI * raio * raio;
    }
}
