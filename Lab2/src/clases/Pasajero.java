package clases;

public class Pasajero {
    private String nombre;
   private String rut;
   private int edad;
   private int numeroTelefono;

    public Pasajero(String nombre, String rut, int edad, int numeroTelefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    public Pasajero() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

 

    public String imprimirPasajero(){
        String datos = "\nNombre: " + nombre + 
                "\n rut: " + rut + "\n edad: " + edad +
                "\n Numero telefono: " + numeroTelefono;
                
        return datos;
    }

}

