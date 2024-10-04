public class Main {
    public static void main(String[] args) {
        Produto cocaCola = new Produto();

        //REVISANDO ENCAPSULAMENTO
        cocaCola.setNome("Coca cola 2L");
        System.out.println(cocaCola.getNome());

        System.out.println("O preço é: "+cocaCola.getPreco());
        System.out.println("=============================================");

        // MÉTODO CONSTRUTOR
        Produto fanta = new Produto("Fanta lata");
        System.out.println(fanta.getNome());
        System.out.println("O preço é: "+fanta.getPreco());
        System.out.println("=============================================");

        // HERANÇA
        Cliente neto = new Cliente();
        neto.setNome("Neto");
        neto.setEmail("neto@gmail.com");
        // SOBRESCRITA DE MÉTODOS
        System.out.println(neto.toString());

        Aluguel a = new Aluguel(neto);

        a.alugar();
    }
}