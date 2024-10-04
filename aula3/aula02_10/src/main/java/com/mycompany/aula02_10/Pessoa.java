package com.mycompany.aula02_10;

public class Pessoa {
    public String nome;
    public int idade;
    public String estadoCivil;
    
    public static String CASADO = "C";
    
    // CONSTANTE 
    public static final String UNIAO_ESTAVEL = "UE";
    
    public void casar() {
        if (estadoCivil == "S" || estadoCivil == "V" || estadoCivil == "D") {
            estadoCivil = "C";
        } else {
            System.out.println("Não pode casar!");
        }
    }
    
    public static void terFilhos() {
        System.out.println("Tendo filhos");
    }
}
