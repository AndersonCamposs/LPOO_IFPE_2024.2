/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02_10;

/**
 *
 * @author ander
 */
public class Cachorro extends SerVivo implements Animal {
    
    // IMPLEMENTANDO OS MÉTODOS DA INTERFACE
    @Override 
    public void emitirSom() {
        System.out.println("au au au");
    }
    
    @Override
    public void come() {
        System.out.println("Nham Nham");
    }

    @Override
    public void seMove() {
        System.out.println("Correndo");
    }  
    
    // SOBRESCREVENDO MÉTODO ABSTRATO DA CLASSE PAI
    @Override
    public void nascer() {
        System.out.println("Auauauau! Nasci.");
    }
}
