package ui;

import clases.Arriendo;
import clases.Automovil;
import clases.Minibus;
import clases.Registro;

/**
 *
 * @author PGC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Registro registro = new Registro();
       
       Automovil comun = new Automovil("FFBB36",2013,false);
       Automovil deLujo = new Automovil("RRJJ22",2023,true);
       Minibus minibus = new Minibus("DDJJ33",2020,6);
       
       Arriendo a1 = new Arriendo(comun,5);
       Arriendo a2 = new Arriendo(deLujo,1);
       Arriendo a3 = new Arriendo(minibus,1);
       
//       registro.add(a1);
//       registro.add(a2);
//       registro.add(a3);
       
        for (Arriendo a : registro.getArriendos()) {
            System.out.println(a);
        }
               
    }
    
}
