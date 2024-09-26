public class Aluguel {
    private float preco;
    private Cliente cliente;

    // COMPOSIÇÃO
    public Aluguel (Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void alugar() {
        System.out.println("O cliente "+cliente.getNome()+" alugou um filme!");
    }
}
