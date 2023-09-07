
import clases.Arriendo;
import clases.Automovil;
import clases.Minibus;
import clases.Registro;


public class main {

    public static void main(String[] args) {
        Registro registros = new Registro();
        
        
        Automovil automovil = new Automovil(false, "HF73JS", 2020);
        Automovil automovil2 = new Automovil(true, "MSN8D66", 2022);
        Minibus minibus = new Minibus(6, "MD5498H", 2022);
        
        Arriendo arriendo = new Arriendo(automovil, 5);
        Arriendo arriendo2 = new Arriendo(automovil2, 10);
        Arriendo arriendo3 = new Arriendo(minibus, 3);
        
        registros.add(arriendo);
        registros.add(arriendo2);
        registros.add(arriendo3);
        
        System.out.println(registros.getArriendoS());
        
        
    }
    
}
