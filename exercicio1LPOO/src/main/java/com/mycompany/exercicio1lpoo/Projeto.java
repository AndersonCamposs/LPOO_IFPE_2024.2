package com.mycompany.exercicio1lpoo;

import java.util.Date;


/*PARTE I
Os projetos da empresa possuem um título, uma data de início, uma data de 
término e um orçamento.
*/

/*PARTE II
Cada projeto é supervisionado por um gerente e envolve uma equipe 
de funcionários alocados.
*/

/*PARTE III
Esses projetos podem ser de desenvolvimento de software, campanhas de marketing
ou qualquer outra atividade que a empresa julgar necessária.
*/

/*PARTE IV
Um projeto não pode existir sem um gerente responsável, e o gerente deve 
ser alocado a apenas um departamento.
*/

/*PARTE V
Os departamentos também devem ser monitorados quanto ao desempenho global.
*/
public class Projeto {
    // PARTE I
    private String titulo;
    private Date dataInicio;
    private Date dataTermino;
    private float orcamento;
    // PARTE II
    private Gerente gerente;
    private FuncionarioProjeto[] funcionarios;
    // PARTE III
    private String areaProjeto;
    
    // PARTE V
    private Departamento departamento;
    
    // PARTE IV
    public Projeto(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public FuncionarioProjeto[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(FuncionarioProjeto[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getAreaProjeto() {
        return areaProjeto;
    }

    public void setAreaProjeto(String areaProjeto) {
        this.areaProjeto = areaProjeto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
