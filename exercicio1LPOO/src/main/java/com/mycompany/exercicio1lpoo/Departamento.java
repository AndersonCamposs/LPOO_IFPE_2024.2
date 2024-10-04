package com.mycompany.exercicio1lpoo;

/* PARTE I
A empresa possui uma estrutura organizada em departamentos, onde cada 
departamento é responsável por diferentes áreas de atuação, como 
Desenvolvimento de Software, Marketing e Recursos Humanos.
*/

/* PARTE II
Cada departamento tem um gerente responsável por supervisionar as atividades e 
um conjunto de funcionários que realizam as tarefas diárias.
*/

public class Departamento {
    private String areaAtuacao;
    private Gerente gerente;
    private Funcionario[] listaFuncionarios;
    
    public Departamento(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}
