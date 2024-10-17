package questao1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.printf("Ano: %s%nModelo: %s%nAno: %d%n", marca, modelo, ano);
    }
}
