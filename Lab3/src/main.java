
import clases.Vehiculo;

public class main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("HGD21N", "PEUGEOT", "YOQSE", 10, 0, 100, 6);
        vehiculo.frenar();
        vehiculo.subirMarcha();
        vehiculo.acelerar();
    }
    
}
