package bj.highfive;

public class Counter {
    public static int count;
    static {
        count = 0;
    }
    public Counter(){
        count ++;
        // System.out.println(count);
    }
}
