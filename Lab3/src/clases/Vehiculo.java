
package clases;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int velocidad;
    private int marcha;
    private int velocidadMax;
    private int marchaMax = 6;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(int velocidad, int marcha, int velocidadMax) {
        this.velocidad = velocidad;
        this.marcha = marcha;
        this.velocidadMax = velocidadMax;
    }

    public Vehiculo(String patente, String marca, String modelo, int velocidad, int marcha, int velocidadMax, int marchaMax) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.marcha = marcha;
        this.velocidadMax = velocidadMax;
        this.marchaMax = marchaMax;
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getMarchaMax() {
        return marchaMax;
    }
    public void setMarchaMax(int marchaMax) {
        this.marchaMax = marchaMax;
    }

    public int acelerar(){
        if(velocidad < velocidadMax && marcha != 0){
            velocidad += 10;
            System.out.println("Velocidad = " + velocidad);
        }
        return velocidad;
    }
    
    public int frenar(){
        if(velocidad > 0 && velocidad-5 > 0){
            velocidad -= 5;
            System.out.println("Velocidad = " + velocidad);
        }
        return velocidad;
    }
    
    public String marchaEnPalabras(int marcha){
        String marchaEnPalabras = "";
        switch(marcha){
            case -1 -> marchaEnPalabras = "Reversa";
            case 0 -> marchaEnPalabras = "Neutro";
            case 1 -> marchaEnPalabras = "Primera";
            case 2 -> marchaEnPalabras = "Segunda";
            case 3 -> marchaEnPalabras = "Tercera";
            case 4 -> marchaEnPalabras = "Cuarta";
            case 5 -> marchaEnPalabras = "Quinta";
            case 6 -> marchaEnPalabras = "Sexta";
        }
        return marchaEnPalabras;
    }
    
    public int subirMarcha(){
        if(marcha < marchaMax){
            marcha +=1;
            System.out.println("Marcha = " + marchaEnPalabras(marcha));
            
        }
        return marcha;
    }
    
    
    public int bajarMarcha(){
        if(marcha > -1){
            marcha -= 1;
            System.out.println("Marcha = " + marchaEnPalabras(marcha));
        }
        return marcha;
    }
    
    public int ponerMarcha(int amarcha){
        if(amarcha < 6 && amarcha > -1){
            marcha = amarcha;
            System.out.println("Marcha = " + marchaEnPalabras(marcha));
        }
        return marcha;
    }

    
}
