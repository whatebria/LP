
package clases;

public class Arriendo {
    private Vehiculo vehiculo;
    private int dias;

    public Arriendo() {
    }

    public Arriendo(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDias(int dias) {
        if(dias > 0)
        this.dias = dias;
    }
    
    public float getTotal(){
        float total = this.dias * this.vehiculo.getValorDiario();
        return total;
    }
    
    @Override
    public String toString(){
        return "\nARRIENDO" + vehiculo.toString() + 
                "\nDias: " + dias+
                "\nTotal: " + this.getTotal() +
                "\n--------------------------";
    }
    
}
