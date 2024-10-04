package com.mycompany.aula02_10;

public class Aula02_10 {

    public static void main(String[] args) {
        ArcaNoe arcaNoe = new ArcaNoe();
        
        Cachorro dog = new Cachorro();
        
        Peixe nemo = new Peixe();
        
        arcaNoe.fazerAnimalComerEAndar(dog);
        System.out.println("=============================================");
        arcaNoe.fazerAnimalComerEAndar(nemo);
        
        System.out.println("=============================================");
        
        Pessoa laurindo = new Pessoa();
        laurindo.nome = "Lalau";
        // ATRIBUTO ESTÁTICO: Pessoa.CASADO
        
        System.out.println("=============================================");
        Pessoa.terFilhos(); // MÉTODO ESTÁTICO

        
    }
}
