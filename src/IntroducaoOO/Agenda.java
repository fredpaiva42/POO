package IntroducaoOO;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda(){
        Scanner entrada = new Scanner(System.in);
        exibirMenu();
        int escolha = entrada.nextInt();
        while (escolha != 4){
            switch (escolha){
                case 1 -> {
                    if(contatos.size() != 0)
                        listarContatos();
                    else
                        System.out.println("Você não possui contatos");
                }
                case 2 -> {
                    entrada.nextLine();
                    System.out.println("Digite o nome do contato:");
                    String nome = entrada.nextLine();
                    System.out.println("Digite o endereço do contato:");
                    String endereco = entrada.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = entrada.nextLine();
                    addContato(nome, endereco, telefone);
                }
                case 3 -> {
                    listarContatos();
                    System.out.println("Qual contato você deseja remover:");
                    int index = entrada.nextInt();
                    removerContato(index);
                }
                default -> {
                    System.out.println("Comando inexistente");
                }
            }
            exibirMenu();
            escolha = entrada.nextInt();
        }

    }

    public void addContato(String nome, String endereco, String telefone){
        contatos.add(new Contato(nome, endereco, telefone));
    }

    public void removerContato(int index){
        contatos.remove(index);
    }

    public void listarContatos(){
        for (Contato contato: contatos) {
            System.out.println("Contato:");
            System.out.println("Nome: " + contato.exibirNome());
            System.out.println("Telefone: " + contato.exibirTelefone());
            System.out.println("Endereço: " + contato.exibirEndereco());
            System.out.println();
        }
    }

    public void exibirMenu(){
        System.out.println();
        System.out.println("Bem vindo a sua Agenda:");
        System.out.println("1 - Listar contatos");
        System.out.println("2 - Adicionar contato");
        System.out.println("3 - Remover contanto");
        System.out.println("4 - Fechar Agenda");
        System.out.println();
        System.out.print("Qual a sua escolha: ");
    }

    public static void main(String[] args){
        Agenda agenda = new Agenda();
    }
}
