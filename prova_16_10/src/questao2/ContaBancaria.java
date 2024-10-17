package questao2;

public class ContaBancaria {
    private String numeroConta;
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float deposito) {
        saldo += deposito;
    }

    public void sacar (float saque) {
        if (saldo >= saque) {
            saldo -= saque;
        } else {
            System.out.println("Não há saldo suficiente!");
        }
    }
}
