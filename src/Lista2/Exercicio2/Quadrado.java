package Lista2.Exercicio2;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(String tipo,double lado){
        super(tipo);
        this.lado = lado;
    }
    @Override
    public double calculaArea(){
        return lado * lado;
    }
}
