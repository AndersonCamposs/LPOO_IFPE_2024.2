package questao7;

public class FuncionarioCLT extends Funcionario {
    @Override
    public float calcularSalario() {
        float descontoPrevidencia = getSalario() * 0.14f;
        float descontoIRPF = 0;

        if (getSalario() >= 2112.01 && getSalario() <= 2826.66) {
            descontoIRPF = getSalario() * 0.075f;
        } else if(getSalario() >= 2826.67 && getSalario() <= 3751.06) {
            descontoIRPF = getSalario() * 0.15f;
        } else if (getSalario() >= 3751.07 && getSalario() <= 4664.68) {
            descontoIRPF = getSalario() * 0.225f;
        } else {
            descontoIRPF = getSalario() * 0.275f;
        }
        return getSalario() - descontoIRPF - descontoPrevidencia;
    }


}
