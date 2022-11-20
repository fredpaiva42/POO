package IntroducaoOO.Exercicio2;

public class Pessoa {
    public String nome;
    public int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa[] ordernarAlfabeticamente(Pessoa[] pessoas){
        System.out.println();
        System.out.println("Organizado em Ordem Alfabética:");
        for (int i = 0; i < pessoas.length; i++) {
            for (int j = i + 1; j < pessoas.length; j++) {
                if(pessoas[i].nome.compareTo(pessoas[j].nome) > 0){
                    Pessoa temp = pessoas[i];
                    pessoas[i] = pessoas[j];
                    pessoas[j] = temp;
                }
            }
        }
        return pessoas;
    }

    public void listarNomes(Pessoa[] pessoas){
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].nome);
        }
    }

    public void ordernarIdadeCrescente(Pessoa[] pessoas){
        System.out.println();
        System.out.println("Organizado em Ordem Crescente de Idade:");
        for (int i = 0; i < pessoas.length; i++) {
            for (int j = i+1; j < pessoas.length; j++) {
                if(pessoas[i].idade >= pessoas[j].idade){
                    Pessoa temp = pessoas[i];
                    pessoas[i] = pessoas[j];
                    pessoas[j] = temp;
                }
            }
        }
    }

}
