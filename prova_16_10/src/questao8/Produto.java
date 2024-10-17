package questao8;

public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }
}
