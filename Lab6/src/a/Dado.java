
package a;

public class Dado {
    public final int MIN = 1;
    public final int MAX = 6;
    
    public int lanzar(){
        int numero = (int) Math.random()*(MAX - MIN + 1)+ MIN;
        return numero;
    }
}
