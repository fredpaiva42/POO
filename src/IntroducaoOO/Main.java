package IntroducaoOO;

public class Main {
    public static void main(String[] args){
        // Instanciando objetos
        Carro fusca = new Carro(10); // (new) aloca memória disponível para armazenar um objeto recém-criado
        Carro bmw = new Carro(10);

        fusca.freia();
        bmw.acelera();
        fusca = bmw; // Estamos passando o endereço do objeto bmw, não o objeto
        fusca = null; // Usado para representar um objeto não instanciado
        boolean objetosIguais = fusca == bmw; // estamos checando se o endereço de memória é igual
        System.out.println(bmw);
    }
}
