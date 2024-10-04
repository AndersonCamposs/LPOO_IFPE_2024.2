package com.mycompany.exercicio1lpoo;

/*
Também é importante registrar o progresso de cada projeto, incluindo uma 
porcentagem de conclusão e relatórios sobre o que foi desenvolvido até 
o momento.
*/

public class ProgressoDeProjeto {
    private Projeto projeto;
    private float porcentagemConclusao;
    private String relatorio;

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public float getPorcentagemConclusao() {
        return porcentagemConclusao;
    }

    public void setPorcentagemConclusao(float porcentagemConclusao) {
        this.porcentagemConclusao = porcentagemConclusao;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    
    
}
