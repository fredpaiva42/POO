package IntroducaoOO;

public class Carro {
    //Atributos (Características) são variáveis globais acessíveis por todos os métodos da classe
    private int velocidade;

    // Método Construtor
    public Carro(int velocidadeInicial){
        velocidade = velocidadeInicial;
    }

    // Métodos (Comportamentos)
    public void acelera(){
        velocidade++;
    }

    public void freia(){
        velocidade--;
    }
}
