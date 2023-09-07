package clases;

/**
 *
 * @author PGC
 */
public class Minibus extends Vehiculo {

    private int capacidad;

    public Minibus() {
    }

    public Minibus(String patente, int año, int capacidad) {
        super(patente, año);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            //Pendiente
        }

    }

    @Override
    public float getValorDiario() {
        return super.getValorDiario() + (this.capacidad * 500);
    }

    @Override
    public String toString() {
        return this.getPatente()+" Minibus capacidad " + capacidad + " P. \n $" + (int) this.getValorDiario();
    }

}
