package bj.highfive;

public class Person {
    private String nom;
    public static int x = 10; 
    final private String surnom = "Codeur";

    private Adress adress;

   

    public Person() {

    }

    public Person(String nom, Adress adress) {
        this.nom = nom;
        this.adress = adress;
    }

    final public void present(){
        System.out.println("je suis "+
            this.nom + " , j'ai "+
            this.surnom);
            this.adress.showAdress();
    }   


    static {
        System.out.println("appel du bloc static de person ");        
    }


    public void dire(){
        System.out.println("bonjour à tous ");
    }

}
