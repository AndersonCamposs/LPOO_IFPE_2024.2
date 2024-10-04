// extends indica herança
public class Cliente extends Pessoa{
    public float saldo;

    // sobrescrevendo o método da classe pai (Pessoa)
    @Override
    public String toString() {
        return String.format("Olá meu cliente lindo %s", this.getNome());
    }
}
