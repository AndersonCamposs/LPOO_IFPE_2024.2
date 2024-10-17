package questao5;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public Endereco (String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String exibirDetalhes() {
        return String.format("==============%nENDEREÇO%nRUA: %s%nNÚMERO: %d%nCIDADE: %s%n",
                rua, numero, cidade);
    }
}
