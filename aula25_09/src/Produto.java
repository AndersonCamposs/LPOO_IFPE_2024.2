public class Produto {
    private int id;
    private String nome;
    private float preco;

    // SOBRECARGA DE CONSTRUTORES
    public Produto() {
        this.preco = 10;
    }

    public Produto (String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
