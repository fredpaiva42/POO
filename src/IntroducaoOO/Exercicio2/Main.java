package IntroducaoOO.Exercicio2;

public class Main {
    public static void main(String[] args){
        Pessoa[] pessoas = {new Pessoa("Matheus", 19), new Pessoa("Fred", 22), new Pessoa("Julia", 20), new Pessoa("Ana", 23)};

        // Imprimir o vetor dos objetos:
        pessoas[0].listarNomes(pessoas);
        pessoas[0].ordernarAlfabeticamente(pessoas);
        pessoas[0].listarNomes(pessoas);
        pessoas[0].ordernarIdadeCrescente(pessoas);
        pessoas[0].listarNomes(pessoas);

    }
}
