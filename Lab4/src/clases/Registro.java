
package clases;

import java.util.ArrayList;

public class Registro {
    ArrayList<Arriendo> arriendos = new ArrayList<>();

    public Registro() {
    }
    
    public void add(Arriendo arriendo){
        arriendos.add(arriendo);
    }
    
    public ArrayList<Arriendo> getArriendoS(){
        return arriendos;
    }
}
