package questao8;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Coca");
        Produto produto2 = new Produto("Arroz", 5.99f);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        System.out.println("======================");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
    }
}
