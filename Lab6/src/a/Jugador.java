
package a;

public class Jugador extends Apostador{

    private String nombre;
    private int saldo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public Jugador() {
    }

    public Jugador(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void apostar(int apuesta) {
        if(saldo >= apuesta){
            System.out.println("Apuesta aceptada");
        }
        else{
            System.out.println("Saldo insuficiente");
        } 
    }

    @Override
    public void pagar(int apuesta) {
        setSaldo(saldo-apuesta);
        System.out.println(saldo);
    }

    @Override
    public void ganar(int apuesta) {
        setSaldo(saldo+(2*apuesta));
        System.out.println(saldo);
    }
    
}
