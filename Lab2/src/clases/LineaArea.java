
package clases;

import java.util.ArrayList;

public class LineaArea {
    ArrayList<Pasaje> pasajes = new ArrayList();
    Pasaje p = new Pasaje();
    
    public LineaArea() {
    }

    public ArrayList<Pasaje> getPasajes() {
        return pasajes;
    }

    public void setPasajes(ArrayList<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }
    
    public boolean agregarPasaje(Pasaje p){
        boolean agregar = false;
        if(p.getNumeroAsiento() != 0){
            agregar = true;
            pasajes.add(p);
        }
        return agregar;
    }
    
    public boolean buscarAsiento(int asiento){
        boolean ocupado = false;
        for(int i = 0; i < pasajes.size(); i++){
            if(pasajes.get(i).getNumeroAsiento() == asiento){
                ocupado = true;
            }
        }
        return ocupado;
    }
    
    public String listarPasajes(){
        String datos = null;
        for(int i = 0; i < pasajes.size(); i++){
           datos += pasajes.get(i).imprimirPasaje();
        }
        return datos;
    }
    
    public int obtenerPasajesVendidos(){
        int total = 0;
        for(int i = 0; i < pasajes.size(); i ++){
            total += 1;
        }
        return total;
    }
    
    }
