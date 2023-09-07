package clases;

/**
 *
 * @author PGC
 */
public class Arriendo {

    private Vehiculo vehiculo;
    private int dias;

    public Arriendo() {
    }

    public Arriendo(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getTotal() {
        return (int) this.vehiculo.getValorDiario() * this.dias;
    }

    @Override
    public String toString() {
        return "\nARRIENDO"
                + "\nVehiculo: " + vehiculo
                + "\nDias: " + dias
                + "\nTotal Arriendo: $ " + this.getTotal();
    }
}
