package com.mycompany.exercicio1lpoo;

/*
Cada funcionário tem um nome, um número de identificação único, um salário base 
e pertence a um departamento.
*/

public class Funcionario {
    private String nome;
    private int id;
    private float salarioBase;
    private Departamento departamento;
    
    private FuncionarioProjeto[] funcionarioProjetos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

   
    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public float getSalarioBruto(float gratificacao) {
        return this.getSalarioBase() + gratificacao;
    }
}
