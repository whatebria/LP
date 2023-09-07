
package a;

public class Craps extends Juego{

    private Jugador jugador;
    private final Dado dado1 = new Dado();
    private final Dado dado2 = new Dado();

    public Craps() {
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int lanzarDados(Dado dado1, Dado dado2){
        int total;
        total = dado1.lanzar() + dado2.lanzar();
        return total;
    }
    
    @Override
    public void jugar() {
        int apuesta = 0;
        int numero2;
        int numero = lanzarDados(dado1, dado2);
        
        switch (numero) {
            case 7:
            case 11:
                jugador.ganar(apuesta);
                break;
            case 2:
            case 3:
            case 12:
                jugador.pagar(apuesta);
                break;
            default:
                numero2 = numero;
                puntos(numero, numero2, apuesta, jugador.getSaldo());
                break;
        }
    }

    public void puntos(int numero1, int numero2, int apuesta, int saldo){
        if(numero1 == numero2){
            System.out.println("Ganaste");
            jugador.ganar(apuesta);
        }
        else if(numero2 == 7){
            System.out.println("Perdiste todo");
            jugador.pagar(saldo);
        }
    }
    
}
