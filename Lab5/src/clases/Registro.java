package clases;

import java.util.ArrayList;

/**
 *
 * @author PGC
 */
public class Registro {

    public ArrayList<Vehiculo> vehiculos;
    public ArrayList<Arriendo> arriendos;

    public Registro() {
        arriendos = new ArrayList<>();
        vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void registrarArriendo(Arriendo arriendo) {
        arriendos.add(arriendo);
    }

    public ArrayList<Arriendo> getArriendos() {
        return this.arriendos;
    }
    
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    

}
