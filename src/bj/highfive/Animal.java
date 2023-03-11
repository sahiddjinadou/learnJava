package bj.highfive;

public class Animal {
    private String nom;

    public Animal() {
        super();
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    @Override
    public String toString (){
        return("bonjour");
    }
    
}
