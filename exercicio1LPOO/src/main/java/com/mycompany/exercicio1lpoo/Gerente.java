package com.mycompany.exercicio1lpoo;

/*
Além disso, funcionários podem ser promovidos a cargos de gerência, onde eles 
terão um bônus salarial adicional por gerenciar suas equipes. Os gerentes 
também são responsáveis por monitorar os projetos de seu departamento e 
alocar funcionários para trabalharem nesses projetos.
*/

public class Gerente extends Funcionario {
    private float bonusSalarial;
    
    public Gerente(float bonusSalarial, float gra) {
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
     
    @Override
    public float getSalarioBruto(float gratificacao) {
        return this.getSalarioBase() * (bonusSalarial + 1) + gratificacao;
    }
}
