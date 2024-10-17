package questao7;

public class Main {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
        funcionarioCLT.setSalario(10000f);
        System.out.printf("SALÁRIO CLT: %.2f%n", funcionarioCLT.calcularSalario());

        FuncionarioPJ funcionarioPJ = new FuncionarioPJ();
        funcionarioPJ.setSalario(10000f);
        System.out.printf("SALÁRIO PJ: %.2f%n", funcionarioPJ.calcularSalario());

    }
}
