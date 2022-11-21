package Lista2.Exercicio2;

public abstract class FiguraGeometrica{
    public String tipo;
    public FiguraGeometrica(String tipo){
        this.tipo = tipo;
    }
    abstract public double calculaArea();
}
