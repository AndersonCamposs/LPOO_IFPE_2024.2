
package com.mycompany.exercicio1lpoo;

/*
Os funcionários podem ser promovidos a cargos de liderança de projetos, e essa 
experiência deve ser registrada no sistema para fins de 
avaliação de desempenho.
*/

public class LiderancaProjeto {
    private Projeto projeto;
    private Funcionario funcionario;

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
