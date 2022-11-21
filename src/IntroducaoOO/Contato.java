package IntroducaoOO;

public class Contato {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String endereco;
    private String telefone;

    public Contato(String nome, String endereco, String telefone){
        editarDados(nome, endereco, telefone);
    }

    public void editarDados(String nome, String endereco, String telefone){
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String exibirNome(){
        return getNome();
    }
    public String exibirTelefone(){
        return getTelefone();
    }
    public String exibirEndereco(){
        return getEndereco();
    }

}
