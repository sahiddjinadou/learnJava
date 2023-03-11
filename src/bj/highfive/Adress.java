package bj.highfive;

public class Adress {
    private String country;
    private String city;

    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry(){
        return country;
    }
    public String getCity() {
        return city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void showAdress(){
        System.out.println("je suis au "+this.country+" et ma ville est : "+this.city);
    }
}
