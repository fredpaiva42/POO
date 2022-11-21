package HerancaPolimorfismo.ExemploHerancaPolimorfismo;

public class Carro {
    public int velocidade;

    public Carro(int velocidadeInicial){
        velocidade = velocidadeInicial;
    }

    public void acelera(){
        velocidade++;
    }

    public void freia(){
        velocidade--;
    }
}
