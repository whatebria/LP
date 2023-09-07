
package negocio;

import java.util.ArrayList;

public class Suscripcion {
    
    private Cliente cliente;
    private final ArrayList<Servicio> servicios = new ArrayList<>();

    
    public Suscripcion(Cliente cliente) {
            this.cliente = cliente;
        }
    
    public Suscripcion() {
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void add(Servicio servicio){
        servicios.add(servicio);
    }
    
    public ArrayList<Servicio> getAll(){
        return servicios;
    }
   
    public int getTotalMensual(){
        int costo;
        int total = 0;
        for (Servicio servicio : servicios){
            costo = servicio.getCosto();
            total += costo;  
        }
        return total;
    }
    
    public String toString(){
        return "Total suscripciones: $" + getTotalMensual();
    }
}
