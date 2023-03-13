import bj.highfive.Person;
import bj.highfive.Counter;
import bj.highfive.Adress;
import bj.highfive.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Counter c1 = new Counter();        
        Animal rex = new Animal();
        Adress add = new Adress("Benin", "cotonou");
        Person user = new Person("sahid",add);
        Programmeur p = new Programmeur("djinadou",add);
        // user.present();
        // System.out.println(rex);
        // System.out.println(c1);
        // System.out.println("-----------------------------gf-------------------------");
        System.out.println(p);
    }
}
