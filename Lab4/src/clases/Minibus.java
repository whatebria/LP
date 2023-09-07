
package clases;

public class Minibus extends Vehiculo {
    private int capacidad;

    public Minibus() {
    }
    
    public Minibus(int capacidad, String patente, int año) {
        super(patente, año);
        this.capacidad = capacidad;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad > 0)
        this.capacidad = capacidad;
    }

    @Override
    public float getValorDiario(){
         return (super.getValorDiario() + (this.capacidad * 500)) + (VALOR_DIARIO *IVA);
    }
    
    @Override
    public String toString(){
        return "\nMinibus \nValor diario:" + getValorDiario();
    }
    
    
}
