package questao6;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está celerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}
