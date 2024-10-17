package questao7;

public abstract class  Funcionario {
    private float salario;

    public abstract float calcularSalario();

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
