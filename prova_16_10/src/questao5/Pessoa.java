package questao5;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirDetalhes() {
        System.out.printf("==============%nNOME: %s%n"+endereco.exibirDetalhes(), nome);
    }
}
