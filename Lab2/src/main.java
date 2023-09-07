import clases.LineaArea;
import clases.Pasaje;
import clases.Pasajero;

public class main {

    public static void main(String[] args) {
        LineaArea lineaAerea = new LineaArea();
        Pasajero pasajero1 = new Pasajero("Raul", "111111-1", 20, 974734); 
        Pasaje p = new Pasaje(20, "snack", pasajero1);
        Pasajero pasajero2 = new Pasajero("Pedro", "111111-2", 26, 94373647);
        Pasaje p2 = new Pasaje(15, "completo", pasajero2);
        
        lineaAerea.agregarPasaje(p);
        lineaAerea.agregarPasaje(p2);
        System.out.println(lineaAerea.listarPasajes());
        System.out.println(lineaAerea.obtenerPasajesVendidos());
        System.out.println(lineaAerea.buscarAsiento(5));
    }

}
