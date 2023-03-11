package bj.highfive;

public class Programmeur extends Person  {
    private String nom;
    private String surnom;
    {
        System.out.println(" c'est le bloc  tout cour");
    }
    
  

    public Programmeur(String nom, Adress adress) {
        super( nom, adress);
        super.present();    
        System.out.println("ici c'est dans le constructeur");
    }

    final public void presents(){
        System.out.println("je suis "+ this.nom +"et ma profession est "+ this.surnom);
    }
    
    public void dire(){
        System.out.println("bonjour à tous "+ this.nom);
    }
    
}
