package questao5;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Hélder",
        new Endereco("Rua Professor Vera Cruz", 400, "Afogados da Ingazeira"));

        pessoa1.exibirDetalhes();
    }
}
