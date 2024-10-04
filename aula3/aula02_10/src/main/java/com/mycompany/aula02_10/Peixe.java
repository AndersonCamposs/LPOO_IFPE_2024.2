package com.mycompany.aula02_10;

public class Peixe implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Blug blug");
    }

    @Override
    public void come() {
        System.out.println("..........");
    }

    @Override
    public void seMove() {
        System.out.println("Nadando");
    }
    
}
