package HerancaPolimorfismo.ExemploHerancaPolimorfismo;

public class CarroCorrida extends Carro{

    public CarroCorrida(int velocidadeInicial){
        super(velocidadeInicial);
    }

    @Override
    public void acelera(){
        velocidade += 5;
    }

    public void mostraVelocidade(){
        System.out.println(velocidade);
    }
}
